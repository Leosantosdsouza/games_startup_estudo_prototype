package br.com.fiap.startup.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.startup.domain.Jogo;

public class JogoConsultarTeste {

	public static void main(String[] args) {

		
		EntityManager em = null;

		try { 
			
			int idProcurado = 1;
			
			em = Persistence.createEntityManagerFactory("games-startup").createEntityManager();
			Jogo jogo1 = em.find(Jogo.class, idProcurado);

			System.out.println("Jogo Encontrado! " + jogo1);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
