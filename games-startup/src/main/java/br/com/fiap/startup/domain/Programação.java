package br.com.fiap.startup.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_programacao")

public class Programação {
	
	@Id
	@SequenceGenerator(name="programacao",sequenceName="sq_tbl_programacao",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="programacao")
	@Column(name = "id_programacao")
	private Integer programacao;
	
	@Column(name = "ling_java", length = 50)
	private String java;
	
	@Column(name = "ling_py", length = 50)
	private String py;
	
	@Column(name = "ling_sharp", length = 50)
	private String Csharp;
	
	@Column(name = "ling_Cplusplus", length = 50)
	private String linguagemCPlusPlus;
	
	public Integer getProgramacao() {
		return programacao;
	}

	public void setProgramacao(Integer programacao) {
		this.programacao = programacao;
	}

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getPy() {
		return py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public String getCsharp() {
		return Csharp;
	}

	public void setCsharp(String csharp) {
		Csharp = csharp;
	}

	public String getLinguagemCPlusPlus() {
		return linguagemCPlusPlus;
	}

	public void setLinguagemCPlusPlus(String linguagemCPlusPlus) {
		this.linguagemCPlusPlus = linguagemCPlusPlus;
	}

	@Override
	public String toString() {
		return "Programação [id_programacao=" + programacao + ", ling_java=" + java + ", ling_py=" + py + ", ling_sharp=" + Csharp + ", ling_Cplusplus=" + linguagemCPlusPlus + "]";
	}
	
}
