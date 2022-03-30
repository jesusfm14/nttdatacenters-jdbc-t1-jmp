package com.nttdatacenters_hibernate_t1_jmp.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class ContratoDaoImpl implements ContratoDaoI {

	private Session session;
	
	public ContratoDaoImpl(Session session) {
		this.session = session;
	}
	
	@Override
	public void insertContrato(Contrato contrato) {
		// TODO Auto-generated method stub
		if (!session.getTransaction().isActive())
			session.getTransaction().begin();

		session.save(contrato);
		session.getTransaction().commit();
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Contrato> searchAll() {
		// TODO Auto-generated method stub
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		@SuppressWarnings("unchecked")
		List<Contrato> result = session.createQuery("FROM Contrato").list();
		return result;
		
	}

	@Override
	public Contrato searchById(Long id) {
		// TODO Auto-generated method stub		
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		
		Contrato result = (Contrato) session.get(Contrato.class, id);
		return result;
	}

	@Override
	public void updateCustomer(Contrato contrato) {
		// TODO Auto-generated method stub
		if (!session.getTransaction().isActive())
			session.getTransaction().begin();

		session.saveOrUpdate(contrato);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteCustomer(Contrato contrato) {
		// TODO Auto-generated method stub
		if (!session.getTransaction().isActive())
			session.getTransaction().begin();

		session.delete(contrato);
		session.getTransaction().commit();
		
	}

	@Override
	public List<Contrato> searchByCustomer(Cliente cliente) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}


		List<Contrato> result = session.createQuery("FROM Contrato WHERE Cliente.idCliente=" + cliente.getPlayerId()).list();
		return result;
	}

	
	
	

}