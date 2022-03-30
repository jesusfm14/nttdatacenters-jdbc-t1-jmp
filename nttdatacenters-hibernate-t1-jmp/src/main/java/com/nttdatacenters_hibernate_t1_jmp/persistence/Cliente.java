package com.nttdatacenters_hibernate_t1_jmp.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="CLIENTE")
public class Cliente implements Serializable{
	
	private Long playerId;
	
	private String nombre;
	
	private  String apellido1;
	
	private  String apellido2;
	
	private String dni;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CLIENTE_ID")
	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	@Column(name="NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name="APELLIDO1")
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name="APELLIDO2")
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name="DNI", unique = true, nullable= false, length=9)
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
