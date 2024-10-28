package com.fyxify.practice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

        //Just for providing info to spring security custom tables and columns
        jdbcUserDetailsManager.setUsersByUsernameQuery("select username,password,enabled from dbo.users where username = ?");

        //Just for providing info to spring security custom tables and columns
        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select username,authority from dbo.authorities where username = ?");

        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(conf ->
                conf.requestMatchers(HttpMethod.GET, "api/v1/btu-of-furnaces").hasRole("EMP")
                        .requestMatchers(HttpMethod.GET, "api/v1/btu-of-furnaces/**").hasRole("EMP")
                        .requestMatchers(HttpMethod.POST, "api/v1/btu-of-furnaces").hasRole("MNG")
                        .requestMatchers(HttpMethod.PUT, "api/v1/btu-of-furnaces").hasRole("MNG")
                        .requestMatchers(HttpMethod.DELETE, "api/v1/btu-of-furnaces/**").hasRole("ADMIN")
        );

        // Use http basic auth
        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
