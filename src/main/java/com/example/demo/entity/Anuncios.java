package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "anuncios")
public class Anuncios {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Integer ID;
	@Column(name = "titulo", unique = false, nullable = false, length = 20)
	private String titulo;
	@Column(name = "usuario_id", nullable = false)
	private Integer userId;
	@Column(name = "descripcion", length = 500)
	private String descripcion;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "")
	private Set<Usuarios> id = new HashSet<Usuarios>();

	public Anuncios(Integer anuncioId, String titulo, Integer userId, String descripcion) {
		super();
		this.id = anuncioId;
		this.titulo = titulo;
		this.userId = userId;
		this.descripcion = descripcion;

	}

	public Anuncios(Integer anuncioId, String titulo, Integer userId, String descripcion, Set<Usuarios> id) {
		super();
		this.anuncioId = anuncioId;
		this.titulo = titulo;
		this.userId = userId;
		this.descripcion = descripcion;
		this.id = id;

	}

	public Integer getAnuncioId() {
		return anuncioId;
	}

	public void setAnuncioId(Integer anuncioId) {
		this.anuncioId = anuncioId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Usuarios> getId() {
		return id;
	}

	public void setId(Set<Usuarios> id) {
		this.id = id;
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
