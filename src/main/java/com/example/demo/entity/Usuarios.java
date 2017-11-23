package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "nombre", unique = true, nullable = false, length = 10)
    private String usuario;
    
    @Column(name = "contraseña", nullable = false, length = 65)
    private String contrasena;
    
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rol_fk")
    private Rol rol;
    
    public Usuarios(String usuario, String contrasena, Boolean estado) {
	super();
	this.usuario = usuario;
	this.contrasena = Usuarios.sha256(contrasena);
	this.estado = estado;
    }
    
    public Usuarios(String usuario, String contrasena, Boolean estado, Rol rol) {
	super();
	this.usuario = usuario;
	this.contrasena = Usuarios.sha256(contrasena);
	this.estado = estado;
	this.rol = rol;
    }

    public String getUsuario() {
	return usuario;
    }

    public void setUsuario(String usuario) {
	this.usuario = usuario;
    }

    public String getContrasena() {
	return contrasena;
    }

    public void setContrasena(String contrasena) {

	this.contrasena = Usuarios.sha256(contrasena);
    }

    public boolean isEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }

    public Rol getUserRol() {
	return rol;
    }

    public void setUserRole(Rol rol) {
	this.rol = rol;
    }

    public static String sha256(String base) {
	try {
	    MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    byte[] hash = digest.digest(base.getBytes("UTF-8"));
	    StringBuffer hexString = new StringBuffer();

	    for (int i = 0; i < hash.length; i++) {
		String hex = Integer.toHexString(0xff & hash[i]);
		if (hex.length() == 1) {
		    hexString.append('0');
		}
		hexString.append(hex);
	    }

	    return hexString.toString();
	} catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
	    throw new RuntimeException(ex);
	}
    }

}
