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
@Table(name ="tbl_desenvolvimento")

public class Desenvolvimento {
	
	@Id
	@SequenceGenerator(name="desenvolvimento",sequenceName="sq_tbl_desenvolvimento",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="desenvolvimento")
	@Column(name = "id_desenvolvimento")
	private Integer id;
	
	@Column(name = "nm_desenvolvedor", length = 50)
	private String nomeDesenvolvedor;
	
	@Column(name = "id_dev", length = 50)
	private Integer idDev;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_desenvolvimento")
	private Calendar dataDesenvolvimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeDesenvolvedor() {
		return nomeDesenvolvedor;
	}

	public void setNomeDesenvolvedor(String nomeDesenvolvedor) {
		this.nomeDesenvolvedor = nomeDesenvolvedor;
	}

	public Integer getIdDev() {
		return idDev;
	}

	public void setIdDev(Integer idDev) {
		this.idDev = idDev;
	}

	public Calendar getDataDesenvolvimento() {
		return dataDesenvolvimento;
	}

	public void setDataDesenvolvimento(Calendar dataDesenvolvimento) {
		this.dataDesenvolvimento = dataDesenvolvimento;
	}
	
	@Override
	public String toString() {
		return "Desenvolvimento [id_desenvolvimento=" + id + ", nm_desenvolvedor=" + nomeDesenvolvedor + ", id_dev=" + idDev + ", dt_desenvolvimento=" + dataDesenvolvimento + "]";
	}

}
