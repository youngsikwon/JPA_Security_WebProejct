package com.cos.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration //빈등록 IOC
@EnableWebSecurity // 시큐리티 필터가 등록이 된다.
@EnableGlobalMethodSecurity(prePostEnabled = true) //특정 주소로 접근하면 권한 및 인증을 미리 체크함.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Join
    @Bean // IoC가 된다.
    public BCryptPasswordEncoder encoderPWD(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    http
            .csrf().disable() // csrf 토큰 비활성화 (테스트 걸어두는게 좋음)
            .authorizeRequests()
            .antMatchers("/","/auth/**","/js/**", "/css/**", "/image/**")
            .permitAll()
            .anyRequest()
            .authenticated()
            .and()
                .formLogin()// UserController -> login method
                .loginPage("/auth/loginForm")
                .loginProcessingUrl("/auth/loginProc")
                .defaultSuccessUrl("/");
                 //해당 시큐리티가 해당 주소로 요청오는 로그인을 거로채서 대신 로그인 해줌

    }
}

