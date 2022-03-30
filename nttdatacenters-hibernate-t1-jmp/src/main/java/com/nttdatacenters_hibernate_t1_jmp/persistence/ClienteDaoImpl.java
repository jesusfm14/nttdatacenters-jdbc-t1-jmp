package com.nttdatacenters_hibernate_t1_jmp.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ClienteDaoImpl implements ClienteDaoI {

	private Session session;

	public ClienteDaoImpl (Session session) {
		this.session = session;
	}
	
	@Override
	public List<Cliente> searchByFullName(String nombre, String apellido1, String apellido2) {

		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		List<Cliente> result = session
		        .createQuery("FROM Cliente WHERE nombre='" + nombre + "' AND apellido1='" + apellido1 + "' AND apellido2='" + apellido2 + "'").list();
		return result;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> searchClients() {
		List<Cliente> res = new ArrayList<Cliente>();
		
		if(!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		
		res = session.createQuery("FROM " + Cliente.class).list();
		return null;
	}

	@Override
	public void insert(Cliente cliente) {
		// TODO Auto-generated method stub
		if (!session.getTransaction().isActive())
			session.getTransaction().begin();

		session.save(cliente);
		session.getTransaction().commit();
		
	}

}
