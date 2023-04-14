package br.com.fiap.startup.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.startup.domain.Jogo;


public class JogoRemoverTeste {

	public static void main(String[] args) {
		
		EntityManager em = null;

		try { 
			
			int idProcurado = 2;
			
			em = Persistence.createEntityManagerFactory("games-startup").createEntityManager();
			Jogo jogo1 = em.find(Jogo.class, idProcurado);
			
			
			em.getTransaction().begin();
			em.remove(jogo1);
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
