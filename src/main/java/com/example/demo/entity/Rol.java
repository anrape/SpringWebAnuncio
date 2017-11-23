package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

;

@Entity
@Table(name = "rol", uniqueConstraints = @UniqueConstraint(columnNames = { "rol_id", "nombre" }))
public class Rol {

	@Id
	@GeneratedValue
	@Column(name = "rol_id", unique = true, nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nombre", nullable = false)
	private Usuarios usuario;

	@Column(name = "admin", nullable = false)
	private boolean admin;

	public Rol(Integer id, Usuarios usuario, boolean admin) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.admin = admin;
	}

	public Rol() {

	}

	public Integer getRolId() {
		return id;
	}

	public void setRolId(Integer id) {
		this.id = id;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
}
