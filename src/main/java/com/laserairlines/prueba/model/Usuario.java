package com.laserairlines.prueba.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private int id;
	@Column(length = 10)
	private String user;
	@Column(length = 100)
	private String password;
	@Column(length = 10)
	private String rol;
	public int getId() {
		return id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", password=" + password + ", rol=" + rol + "]";
	}

	

	
}
