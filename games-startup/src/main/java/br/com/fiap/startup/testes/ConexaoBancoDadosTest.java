package br.com.fiap.startup.testes;

import javax.persistence.Persistence;

public class ConexaoBancoDadosTest {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("games-startup").createEntityManager();

	}
}
