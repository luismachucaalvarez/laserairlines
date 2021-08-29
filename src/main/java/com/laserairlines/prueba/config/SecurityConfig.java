package com.laserairlines.prueba.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.laserairlines.prueba.service.UsuarioService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UsuarioService userService;
	
	@Autowired BCryptPasswordEncoder encoder;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
		return bcpe;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/css/**","/js/**").permitAll()
		.antMatchers("/index", "/forbidden").permitAll()
		.antMatchers("/index","/servicioturismo","/serviciopremium")
		.hasAnyAuthority("admin","userpre","usertur")
		//.antMatchers("/servicioturismo").hasAnyAuthority("usertur", "admin")
		//.antMatchers("/serviciopremium").hasAnyAuthority("userpre", "admin")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login").permitAll() 
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService).passwordEncoder(encoder);
	}
	
	

	
}
