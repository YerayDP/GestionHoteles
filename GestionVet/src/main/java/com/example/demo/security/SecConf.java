package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class SecConf extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailServiceIMPL UDS;
	@Bean
	public BCryptPasswordEncoder Codificador() {
		return new BCryptPasswordEncoder();
	}
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(UDS).passwordEncoder(Codificador());
    }
	@Override
    protected void configure(HttpSecurity SecWeb) throws Exception {
     SecWeb
     	.authorizeRequests()
     		.antMatchers("/public/**","/auth/**","/css/**","/js/**","/assets/**")
     		.permitAll()
     		.antMatchers().hasAnyRole("CLIENTE","ADMINISTRADOR")
     		.anyRequest().authenticated()
     		.and()
 		.formLogin()
 			.loginPage("/auth/login")
 			.defaultSuccessUrl("/")
 			.loginProcessingUrl("/auth/DoLogin")
 			.permitAll()
 			.and()
		.logout()
			.logoutUrl("/auth/DoLogout")
			.logoutSuccessUrl("/auth/login?logout")
			.permitAll();

     	
    
    }
}
