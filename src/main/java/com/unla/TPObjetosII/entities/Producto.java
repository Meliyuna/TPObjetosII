package com.unla.TPObjetosII.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="producto")
public class Producto {
	@Id
	@GeneratedValue
	@Column(name="idProducto")
	private int idProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precio")
	private float precio;
	@Column(name="fechaAlta")
	private LocalDate fechaAlta;
	
	public Producto() {}
	
	public Producto(String nombre, String descripcion, float precio, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
	}

	public int getIdProducto() {
		return idProducto;
	}

	protected void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", fechaAlta=" + fechaAlta + "]\n";
	}
	

}