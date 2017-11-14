package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registros")
public class Log {

	@Id
	@GeneratedValue
	@Column(name = "id_registro")
	private int id;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "nombre")
	private String nombre;

	public Log(int id, Date fecha, String nombre) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
