package com.nttdatacenters_hibernate_t1_jmp.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTRATO")
public class Contrato {

	private Long contratoId;
	
	private Date fechaVigencia;
	
	private Date fechaCaducidad;
	
	private double precioMensual;
	
	private Cliente cliente;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CONTRATO_ID")
	public long getContratoId() {
		return contratoId;
	}

	public void setContratoId(long contratoId) {
		this.contratoId = contratoId;
	}

	@Column(name="FECHAVIGENCIA")
	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	@Column(name="FECHACADUCIDAD")
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Column(name="PRECIOMENSUAL")
	public double getPrecioMensual() {
		return precioMensual;
	}

	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	@Column(name="CLIENTE")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
