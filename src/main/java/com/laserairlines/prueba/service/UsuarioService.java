package com.laserairlines.prueba.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.laserairlines.prueba.model.Usuario;
import com.laserairlines.prueba.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario u = repo.findByUser(username);
		System.out.println("USER: " + u);
		ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		roles.add(new SimpleGrantedAuthority( u.getRol()));
		//roles.add(new SimpleGrantedAuthority("usertur"));
		//roles.add(new SimpleGrantedAuthority("userpre"));

		
		UserDetails userDT = new User(u.getUser(), u.getPassword(), roles);
		return userDT;
	}

}
