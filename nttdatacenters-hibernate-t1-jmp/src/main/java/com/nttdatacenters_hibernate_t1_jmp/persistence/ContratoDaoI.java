package com.nttdatacenters_hibernate_t1_jmp.persistence;

import java.util.List;

public interface ContratoDaoI {
	
	public void insertContrato(Contrato contrato);

	public List<Contrato> searchAll();

	public Contrato searchById(Long id);
	
	public List<Contrato> searchByCustomer(Cliente cliente);

	public void updateCustomer(Contrato customer);

	public void deleteCustomer(Contrato customer);
	
	
}
