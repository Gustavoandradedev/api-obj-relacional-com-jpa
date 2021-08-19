package dominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aplicacao.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Gustavo", "gustavo@hotmail.com");
		Pessoa p2 = new Pessoa(null, "Larissa", "larissa@hotmail.com");
		Pessoa p3 = new Pessoa(null, "Paulo", "paulo@hotmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();
		
		
	}

}
