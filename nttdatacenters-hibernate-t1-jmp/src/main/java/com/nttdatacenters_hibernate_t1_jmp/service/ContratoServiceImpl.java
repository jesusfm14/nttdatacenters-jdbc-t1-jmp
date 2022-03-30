package com.nttdatacenters_hibernate_t1_jmp.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.nttdatacenters_hibernate_t1_jmp.persistence.Cliente;
import com.nttdatacenters_hibernate_t1_jmp.persistence.Contrato;
import com.nttdatacenters_hibernate_t1_jmp.persistence.ContratoDaoI;
import com.nttdatacenters_hibernate_t1_jmp.persistence.ContratoDaoImpl;

public class ContratoServiceImpl implements ContratoServiceI{
	
	private ContratoDaoI contratoDao;

	public ContratoServiceImpl(final Session session) {
		this.contratoDao = new ContratoDaoImpl(session);
	}
	
	@Override
	public void insertContrato(Contrato contrato) {
		// TODO Auto-generated method stub
		contratoDao.insertContrato(contrato);
	}

	@Override
	public List<Contrato> searchAll() {
		// TODO Auto-generated method stub
		List<Contrato> result = new ArrayList<Contrato>();
		result = contratoDao.searchAll();

		return result;
	}

	@Override
	public Contrato searchById(Long id) {
		// TODO Auto-generated method stub
		Contrato result = new Contrato();
		result = contratoDao.searchById(id);

		return result;

	}

	@Override
	public void updateCustomer(Contrato contrato) {
		// TODO Auto-generated method stub
		contratoDao.updateCustomer(contrato);
	}

	@Override
	public void deleteCustomer(Contrato contrato) {
		// TODO Auto-generated method stub
		contratoDao.deleteCustomer(contrato);
		
	}

	@Override
	public List<Contrato> searchByCustomer(Cliente cliente) {
		// TODO Auto-generated method stub
		List<Contrato> result = contratoDao.searchByCustomer(cliente);
		return result;
	}
	
	

}
