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
@Table(name = "rol", uniqueConstraints = @UniqueConstraint(columnNames = { "rol", "nombre" }))
public class Rol {

	@Id
	@GeneratedValue
	@Column(name = "rol_id", unique = true, nullable = false)
	private Integer rolId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nombre", nullable = false)
	private Usuarios usuario;

	@Column(name = "admin", nullable = false)
	private boolean admin;

	public Rol(Integer rolId, Usuarios usuario, boolean admin) {
		super();
		this.rolId = rolId;
		this.usuario = usuario;
		this.admin = admin;
	}

	public Rol() {

	}

	public Integer getRolId() {
		return rolId;
	}

	public void setRolId(Integer rolId) {
		this.rolId = rolId;
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
