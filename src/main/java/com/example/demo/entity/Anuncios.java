package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "anuncios", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Anuncios {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "titulo", unique = false, nullable = false, length = 20)
    private String titulo;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarios_fk")
    private Usuarios usuario;
    
    public Anuncios(Integer id, String titulo, Usuarios usuarios, String descripcion) {
	super();
	this.id = id;
	this.titulo = titulo;
	this.usuario = usuarios;
	this.descripcion = descripcion;

    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }
    /*
    public Usuarios getUsuarios() {
	return this.usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
	this.usuarios = usuarios;
    }
    */
    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    /*
     * DESCARTADO
     * 
     * @Lob
     * 
     * @Column(name = "anuncio_imagen", nullable = true)
     * 
     * private byte[] imagen; public void setImagen(String filename) { this.imagen =
     * Anuncios.getByteImage(filename);
     * 
     * } public static byte[] getByteImage(String filename) throws IOException {
     * byte[] retorno = Files.readAllBytes(new File(filename).toPath()); return
     * retorno; }
     */
}
