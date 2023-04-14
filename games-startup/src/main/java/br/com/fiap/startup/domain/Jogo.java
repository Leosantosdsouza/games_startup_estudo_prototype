package br.com.fiap.startup.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name ="tbl_jogo")

public class Jogo {
	
	@Id
	@SequenceGenerator(name="jogo",sequenceName="sq_tbl_jogo",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="jogo")
	@Column(name = "id_jogo")
	private Integer id;
	
	@Column(name = "nome_jogo", length = 50)
	private String nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_criacao")
	private Calendar dataCriacao;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	@Override
	public String toString() {
		return "Jogo [id=" + id + ", nome=" + nome + ", dataCriacao=" + dataCriacao + "]";
	}
}
