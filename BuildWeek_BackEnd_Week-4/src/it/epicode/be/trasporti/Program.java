package it.epicode.be.trasporti;

import it.epicode.be.trasporti.utils.JpaUtil;

public class Program {

	public static void main(String[] args) {
		var emf = JpaUtil.getEntityManagerFactory();
		var em = emf.createEntityManager();
		// test
	}

}
