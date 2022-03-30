package com.nttdatacenters_hibernate_t1_jmp.persistence;

import java.util.List;

public interface ClienteDaoI {
	
	public void insert(Cliente cliente);
	
	public List<Cliente> searchClients();

	public List<Cliente> searchByFullName(String nombre, String apellido1, String apellido2);
	

	
	

}
