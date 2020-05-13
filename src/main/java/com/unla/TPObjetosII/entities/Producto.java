package com.unla.TPObjetosII.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Producto {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="IDPRODUCTO")
	private int idProducto;

	private String nombre;

	private String descripcion;

	private float precio;
	@Column (name="FECHAALTA")
	private LocalDate fechaAlta;
	
	public Producto() {}
	
	public Producto(String nombre, String descripcion, float precio, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
	}
	
	

	public Producto(int idProducto, String nombre, String descripcion, float precio, LocalDate fechaAlta) {
		super();
		this.idProducto = idProducto;
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
