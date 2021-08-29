package com.laserairlines.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laserairlines.prueba.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByUser(String User);
}
