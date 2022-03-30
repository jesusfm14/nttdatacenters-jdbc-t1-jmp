package com.nttdatacenters_hibernate_t1_jmp.service;

import java.util.List;

import com.nttdatacenters_hibernate_t1_jmp.persistence.Cliente;
import com.nttdatacenters_hibernate_t1_jmp.persistence.Contrato;

public interface ContratoServiceI {

	public void insertContrato(Contrato contrato);

	public List<Contrato> searchAll();
	
	public List<Contrato> searchByCustomer(Cliente cliente);

	public Contrato searchById(Long id);

	public void updateCustomer(Contrato contrato);

	public void deleteCustomer(Contrato contrato);
}
