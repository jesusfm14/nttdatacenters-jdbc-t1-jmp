package com.nttdatacenters_hibernate_t1_jmp.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.nttdatacenters_hibernate_t1_jmp.persistence.Cliente;
import com.nttdatacenters_hibernate_t1_jmp.persistence.ClienteDaoI;
import com.nttdatacenters_hibernate_t1_jmp.persistence.ClienteDaoImpl;

public class ClienteServiceImpl implements ClienteServiceI {

private ClienteDaoI clienteDao;
	
	public ClienteServiceImpl(final Session session) {
		this.clienteDao = new ClienteDaoImpl(session);
	}

	@Override
	public List<Cliente> searchClients() {
		// TODO Auto-generated method stub
		List<Cliente> result = new ArrayList<Cliente>();
		result = clienteDao.searchClients();

		return result;
	}

	@Override
	public Cliente searchByNameClient(String name, String apellido1, String apellido2) {
		List<Cliente> result = new ArrayList<Cliente>();
		result = clienteDao.searchByFullName(name, apellido1, apellido2);

		return (Cliente) result;
	}

	@Override
	public void insert(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.insert(cliente);
	}
	
	
	


}