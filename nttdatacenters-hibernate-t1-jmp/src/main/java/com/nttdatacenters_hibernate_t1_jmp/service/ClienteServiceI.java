package com.nttdatacenters_hibernate_t1_jmp.service;

import java.util.List;

import com.nttdatacenters_hibernate_t1_jmp.persistence.Cliente;

public interface ClienteServiceI {
	
	public void insert(Cliente Cliente);

	public List<Cliente> searchClients();

	public Cliente searchByNameClient(String nombre, String apellido1, String apellido2);
}
