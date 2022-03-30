package com.nttdata.nttdatacenters_hibernate_t1_jmp;

import java.util.List;

import org.hibernate.Session;

import com.nttdatacenters_hibernate_t1_jmp.persistence.Cliente;
import com.nttdatacenters_hibernate_t1_jmp.persistence.Contrato;
import com.nttdatacenters_hibernate_t1_jmp.service.ClienteServiceI;
import com.nttdatacenters_hibernate_t1_jmp.service.ClienteServiceImpl;
import com.nttdatacenters_hibernate_t1_jmp.service.ContratoServiceI;
import com.nttdatacenters_hibernate_t1_jmp.service.ContratoServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	final Session session = Util.getSessionFactory().openSession();

		final ClienteServiceI clienteServiceI = new ClienteServiceImpl(session);
		final ContratoServiceI contratoServiceI = new ContratoServiceImpl(session);

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();

		c1.setNombre("Francisco Jose");
		c1.setApellido1("Garcia");
		c1.setApellido2("Villalon");
		c1.setDni("01223333E");

		c2.setNombre("Francisco Jose");
		c2.setApellido1("Garcia");
		c2.setApellido2("Villalon");
		c2.setDni("01223333E");

		c3.setNombre("Francisco Jose");
		c3.setApellido1("Garcia");
		c3.setApellido2("Villalon");
		c3.setDni("01223333E");;

		clienteServiceI.insert(c1);
		clienteServiceI.insert(c2);
		clienteServiceI.insert(c3);

		Contrato t1 = new Contrato();
		Contrato t2 = new Contrato();
		Contrato t3 = new Contrato();

		
		t1.setPrecioMensual(9.99);
		t1.setCliente(c1);
		

		
		t2.setPrecioMensual(19.99);
		t2.setCliente(c2);


		t3.setPrecioMensual(29.99);
		t3.setCliente(c3);
	

		contratoServiceI.insertContrato(t1);
		contratoServiceI.insertContrato(t2);
		contratoServiceI.insertContrato(t3);

		List<Contrato> list1 = contratoServiceI.searchAll();
		if (list1 != null && list1.size() > 0) {
			System.out.println("Total de contratos registrados: " + list1.size());
			for (Contrato contract : list1) {
				System.out.println(contract.toString());
			}
		}

		List<Contrato> list2 = contratoServiceI.searchByCustomer(c3);
		if (list2 != null && list2.size() > 0) {
			System.out.println(
					"Total de contratos asociados al cliente con ID " + c3.getPlayerId() + ": " + list2.size());
			for (Contrato contract : list2) {
				System.out.println(contract.toString());
			}
		}

		session.close();

	}

}