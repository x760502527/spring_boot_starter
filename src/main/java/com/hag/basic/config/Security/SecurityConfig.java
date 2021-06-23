package com.hag.basic.config.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;
    @Autowired
    private MyAuthenticationFailureHandler myAuthenticationFailureHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("zhangsan").password(passwordEncoder().encode("123456")).roles("user")
                .and()
                .withUser("admin").password(passwordEncoder().encode("123456")).roles("admin")
                .and()
                .passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                //                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                //                .defaultSuccessUrl("/")
                .successHandler(myAuthenticationSuccessHandler)
                .failureHandler(myAuthenticationFailureHandler)
//                .and()
//                .authorizeRequests()
//                .antMatchers("/login.html", "/login").permitAll()
//                .antMatchers("/hello/sayHello").hasAnyAuthority("ROLE_user", "ROLE_admin")
//                .antMatchers("/hello/sayHi").hasAnyRole("admin")
//                .anyRequest().authenticated()
                .and()
                .sessionManagement().sessionFixation().migrateSession()
                .maximumSessions(1).maxSessionsPreventsLogin(false).expiredSessionStrategy(new MyExpiredSessionStrategy());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}