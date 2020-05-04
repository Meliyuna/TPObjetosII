package com.unla.TPObjetosII.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity 
@Table(name="SOLICITUDSTOCK")
public class SolicitudStock {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDSOLICITUDSTOCK")
	private int idSolicitudStock;

	private LocalDate fecha;

	private boolean aceptado;
	
	@Transient
	private Pedido pedido;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name="IDLOCAL")
	private Local local;
	
	public SolicitudStock() {}
	
	public SolicitudStock(LocalDate fecha, boolean aceptado, Pedido pedido, Local local) {
		super();
		this.fecha = fecha;
		this.aceptado = aceptado;
		this.pedido = pedido;
		this.local = local;
	}

	public int getIdSolicitudStock() {
		return idSolicitudStock;
	}

	protected void setIdSolicitudStock(int idSolicitudStock) {
		this.idSolicitudStock = idSolicitudStock;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "SolicitudStock [idSolicitudStock=" + idSolicitudStock + ", fecha=" + fecha + ", aceptado=" + aceptado
				+ ", pedido=" + pedido + ", local=" + local + "]\n";
	}
	
	
	

}
