package com.laserairlines.prueba.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping ("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String getLogout() {
		return "logout";
	}
	
	@GetMapping("/servicioturismo")
	public String getServicioTurismo(Authentication auth) {
		if ((auth.getAuthorities().contains(new SimpleGrantedAuthority("usertur"))) || auth.getAuthorities().contains(new SimpleGrantedAuthority("admin"))) {
			return "servicioturismo";
		} else {
			return "forbidden";
		}
	}
	
	@GetMapping("/serviciopremium")
	public String getServicioPremium(Authentication auth) {
		if ((auth.getAuthorities().contains(new SimpleGrantedAuthority("userpre"))) || auth.getAuthorities().contains(new SimpleGrantedAuthority("admin"))) {
			return "serviciopremium";
		} else {
			return "forbidden";
		}
	}

}
