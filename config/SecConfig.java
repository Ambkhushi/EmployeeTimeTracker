package com.project.Employee.time.tracker.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
	    PasswordEncoder encoder = passwordEncoder();
	    UserDetails normalUser = User.withUsername("khushi")
	        .password(encoder.encode("user"))
	        .roles("USER")
	        .build();
	    
	    UserDetails adminUser = User.withUsername("admin")
	        .password(encoder.encode("admin"))
	        .roles("ADMIN")
	        .build();
		
	    return new InMemoryUserDetailsManager(Arrays.asList(normalUser, adminUser));
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
	    httpSecurity
	    .csrf(csrf -> csrf.disable())
	    .authorizeHttpRequests(authorize -> authorize
	        .requestMatchers("/employees/**")
	        .authenticated()
	        .anyRequest()
	        .permitAll())
	    //.formLogin(Customizer.withDefaults());
	    .httpBasic(Customizer.withDefaults());
	    return httpSecurity.build();
	}

}
