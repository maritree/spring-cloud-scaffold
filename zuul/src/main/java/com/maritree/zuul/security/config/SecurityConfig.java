package com.maritree.zuul.security.config;


import com.maritree.zuul.security.filter.AccessAuthorizer.AuthorityService;
import com.maritree.zuul.security.filter.Handller.JwtAccessDeniedHandler;
import com.maritree.zuul.security.filter.Handller.JwtAuthenticationEntryPoint;
import com.maritree.zuul.security.filter.JWTAuthenticationFilter;
import com.maritree.zuul.security.filter.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * Created by echisan on 2018/6/23
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("userDetailsServiceImpl")
    private UserDetailsService userDetailsService;

    @Autowired
    AuthorityService authorityService; //注入access判断bean
    @Autowired
    JwtAccessDeniedHandler jwtAccessDeniedHandler; //注入access拒绝处理器
    @Autowired
    JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;//注入authenticated拒绝处理器

    @Autowired
    JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;//注入权限鉴定过滤器


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .anyRequest().access("@authorityService.hasPermission(request, authentication)")
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager())) //处理登陆请求
//                .addFilter(new JWTAuthorizationFilter(authenticationManager()))
                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class) //处理普通请求，对token进行处理
                // 不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
                .accessDeniedHandler(jwtAccessDeniedHandler);
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
        return source;
    }
}
