package com.maritree.zuul.security.filter.AccessAuthorizer;

import com.maritree.zuul.AuthorityFeignService;
import com.maritree.zuul.common.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class AuthorityService {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Autowired
    AuthorityFeignService authorityFeignService;

    public boolean hasPermission(HttpServletRequest request, Authentication auth) {
        System.out.println(request.getRequestURI());
        Object principal = auth.getPrincipal();
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = (List<SimpleGrantedAuthority>) auth.getAuthorities();
        Result<List<Map<String, Object>>> result = authorityFeignService.getResourceByRoles(simpleGrantedAuthorities.stream().map(SimpleGrantedAuthority::getAuthority).collect(Collectors.toList()));
        List<Map<String, Object>> resultData = result.getData();
        if (!CollectionUtils.isEmpty(resultData)) {
            List<String> permittedUrls = resultData.stream()
                    .map(stringObjectMap -> (String) stringObjectMap.get("url"))
                    .collect(Collectors.toList());
            System.out.println(permittedUrls);
            if (permittedUrls.contains(request.getRequestURI())) {
                return true;
            }
        }
        return false;
    }
}
