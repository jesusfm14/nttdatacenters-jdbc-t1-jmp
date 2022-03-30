package com.nttdata.nttdatacenters_hibernate_t1_jmp;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Util {

	private static final SessionFactory SESSION_FACTORY;

	static {
		try {
			SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
		} catch (final Throwable ex) {
			System.err.println("[ERROR] Configuración de Hibernate - " + ex);
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
