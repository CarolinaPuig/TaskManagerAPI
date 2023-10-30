package br.com.fiap.cp4digitalBusiness.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {

    @Autowired
    private UserDetailsService userDetailsService;

    @SuppressWarnings({ "deprecation", "removal" })
	protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/public/**").permitAll() 
                .requestMatchers("/api/**").authenticated()   
                .and()
            .formLogin()
                .loginPage("/login") 
                .defaultSuccessUrl("/api/tasks") 
                .and()
            .logout()
                .logoutUrl("/logout") 
                .logoutSuccessUrl("/login") 
                .and()
            .csrf().disable(); 

        http.userDetailsService(userDetailsService);
    }
}
