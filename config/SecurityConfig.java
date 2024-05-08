/*package com.project.Employee.time.tracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
	    httpSecurity
	    .csrf(csrf -> csrf.disable())
	    .authorizeHttpRequests(authorize -> authorize
	        .requestMatchers("/employees")
	        .hasAnyRole("USER")
	        .requestMatchers("/user/**")
	        .hasAnyRole("USER","ADMIN")
	        .requestMatchers("/**")
	        .anonymous()
	        .anyRequest()
	        .authenticated())
	    .httpBasic(Customizer.withDefaults())
	    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
	    .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));
	    return httpSecurity.build();
	}

	@Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails userOne = User.withUsername("user")
            .password(encoder.encode("user"))
            .roles("USER")
            .build();
        UserDetails userTwo = User.withUsername("admin")
            .password(encoder.encode("admin"))
            .roles("ADMIN")
            .build();
        return new InMemoryUserDetailsManager(userOne, userTwo);
    }
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

	 
}
*/