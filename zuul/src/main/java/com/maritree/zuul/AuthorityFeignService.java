package com.maritree.zuul;

import com.maritree.zuul.common.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author maritree
 * @dec uaa的接口
 * @date 2018/4/28
 */
@Component
@FeignClient(name = "spring-cloud-auth")
public interface AuthorityFeignService {

    @GetMapping(value = "/user/loadUserInfoByUsername")
    Result<Map<String, Object>> getUserDetails(@RequestParam("loginName") String loginName);

    @PostMapping("/groupResource/getResourceByGroups")
    Result<List<Map<String, Object>>> getResourceByGroups(@RequestBody List<String> groups);


}
