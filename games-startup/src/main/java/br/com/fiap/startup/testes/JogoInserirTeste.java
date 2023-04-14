package br.com.fiap.startup.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import br.com.fiap.startup.domain.Jogo;


public class JogoInserirTeste {

	public static void main(String[] args) {

		
		EntityManager em = null;

		try { 
			
			em = Persistence.createEntityManagerFactory("games-startup").createEntityManager();
			em.getTransaction().begin();			
			Jogo jogo1 = new Jogo();
			Jogo jogo2 = new Jogo();
			jogo1.setNome("League of Legends");
			jogo2.setNome("Elden Ring");
			em.persist(jogo1);
			em.persist(jogo2);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
}
