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
@Table(name ="tbl_financeiro")

public class Financeiro {
	
	@Id
	@SequenceGenerator(name="financeiro",sequenceName="sq_tbl_financeiro",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="financeiro")
	@Column(name = "id_financeiro")
	private Integer financeiro;
	
	@Column(name = "vl_lucro")
	private float valorLucro;
	
	@Column(name = "vl_custo")
	private float valorCusto;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_custo")
	private Calendar dataCusto;
	
	@Column(name = "vl_folhapagamento")
	private float valorFolhaPàgamento;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_folhapagamento")
	private Calendar dataFolhaPagamento;

	public Integer getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Integer financeiro) {
		this.financeiro = financeiro;
	}

	public float getValorLucro() {
		return valorLucro;
	}

	public void setValorLucro(float valorLucro) {
		this.valorLucro = valorLucro;
	}

	public float getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(float valorCusto) {
		this.valorCusto = valorCusto;
	}

	public Calendar getDataCusto() {
		return dataCusto;
	}

	public void setDataCusto(Calendar dataCusto) {
		this.dataCusto = dataCusto;
	}

	public float getValorFolhaPàgamento() {
		return valorFolhaPàgamento;
	}

	public void setValorFolhaPàgamento(float valorFolhaPàgamento) {
		this.valorFolhaPàgamento = valorFolhaPàgamento;
	}

	public Calendar getDataFolhaPagamento() {
		return dataFolhaPagamento;
	}

	public void setDataFolhaPagamento(Calendar dataFolhaPagamento) {
		this.dataFolhaPagamento = dataFolhaPagamento;
	}
	
	@Override
	public String toString() {
		return "Financeiro [id_financeiro=" + financeiro + ", vl_lucro="
	+ valorLucro + ", vl_custo=" + valorCusto + ", dt_custo=" + dataCusto 
	+ ", vl_folhapagamento=" + valorFolhaPàgamento + ", dt_folhapagamento=" + dataFolhaPagamento + "]";
	}
}


