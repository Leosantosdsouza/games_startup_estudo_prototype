package br.com.fiap.startup.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.startup.domain.Jogo;


public class JogoMergeTeste {

	public static void main(String[] args) {
			
			EntityManager em = null;
			
			try {
				em = Persistence.createEntityManagerFactory("games-startup").createEntityManager();
				Jogo jog1 = new Jogo();
				Jogo jog2 = new Jogo();
				jog1.setId(1);
				jog2.setId(2);
				jog1.setNome("Sekiro");
				jog2.setNome("Hogwards Legacy");
				em.merge(jog1);
				em.merge(jog2);
				em.getTransaction().begin();
				em.getTransaction().commit();
			}catch(Exception e) {
				e.printStackTrace();
			}
			if (em != null) {
				em.close();
			}
			System.exit(0);
	}

}
