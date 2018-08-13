package com.maritree.zuul.security.filter;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.maritree.zuul.common.response.Result;
import com.maritree.zuul.common.response.ResultCode;
import com.maritree.zuul.security.entity.JwtUser;
import com.maritree.zuul.security.utils.JwtTokenUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by echisan on 2018/6/23
 */
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
        super.setFilterProcessesUrl("/login");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {

        // 从输入流中获取到登录的信息
        try {
            Map map = new ObjectMapper().readValue(request.getInputStream(), Map.class);
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(map.get("userName"), map.get("password"), new ArrayList<>())
            );
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 成功验证后调用的方法
    // 如果验证成功，就生成token并返回
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        JwtUser jwtUser = (JwtUser) authResult.getPrincipal();
        System.out.println("jwtUser:" + jwtUser.toString());

        Collection<? extends GrantedAuthority> authorities = jwtUser.getAuthorities();

        String token = JwtTokenUtils.createToken(jwtUser.getUsername(), authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()));
//        String token = JwtTokenUtils.createToken(jwtUser.getUsername(), false);
        // 返回创建成功的token
        // 但是这里创建的token只是单纯的token
        // 按照jwt的规定，最后请求的时候应该是 `Bearer token`
        response.setHeader("token", JwtTokenUtils.TOKEN_PREFIX + token);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setStatus(200);
        String message;
        if (failed instanceof UsernameNotFoundException) {
            message = "没有找到用户名";
        } else if (failed instanceof BadCredentialsException) {
            message = "坏凭证例外";
        } else {
            message = "登陆失败";
        }
        response.getWriter().write(Result.genResult(ResultCode.FAIL, message, null).toString());
    }
}
