package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuarios {

	@Id
	@Column(name = "nombre", unique = true, nullable = false, length = 10)
	private String usuario;

	@Column(name = "contraseña", nullable = false, length = 15)
	private String contraseña;

	@Column(name = "estado", nullable = false)
	private boolean estado;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private Set<Rol> rol = new HashSet<Rol>();

	public Usuarios(String usuario, String contraseña, Boolean estado) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.estado = estado;
	}
	
	public Usuarios(String usuario, String contraseña, Boolean estado, Set<Rol> rol) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.estado = estado;
		this.rol = rol;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Set<Rol> getUserRol() {
		return rol;
	}
	public void setUserRole(Set<Rol> rol) {
		this.rol = rol;
	}
	
	
	

}
