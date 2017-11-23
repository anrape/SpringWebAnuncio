package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.example.demo.entity.Usuarios;

@Entity
@Table(name = "rol", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Rol {
    
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "rol_fk")
    private Set<Usuarios> usuarios = new HashSet<Usuarios>();
    
    @Column(name = "admin", nullable = false)
    private boolean admin;
    
    public Rol(Long id, boolean admin) {
	super();
	this.id = id;
	this.admin = admin;
    }
    
    public Rol() {
	
    }
    
    public Long getRolId() {
	return id;
    }
    
    public void setRolId(Long id) {
	    this.id = id;
    }
    
    public boolean isAdmin() {
	return admin;
    }
    
    public void setAdmin(boolean admin) {
	this.admin = admin;
    }
	
	
}
