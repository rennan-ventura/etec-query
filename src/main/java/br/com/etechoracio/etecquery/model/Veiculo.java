package br.com.etechoracio.etecquery.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.etecquery.enums.TipoCambioEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_veiculo")
@Getter
@Setter
public class Veiculo {

	@Id
	@Column(name = "ID_VEICULO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NR_ANO_FABRICACAO")
	private Integer anoFabricacao;
	
	@Column(name = "NR_ANO_MODELO")
	private Integer anoModelo;
	
	@Column(name = "TX_FABRICANTE")
	private String fabricante;	
	
	@Column(name = "TX_MODELO")
	private String modelo;
	
	@Column(name = "NR_VALOR")
	private float valor;
	
	@Column(name = "TP_CAMBIO")
	@Enumerated(EnumType.STRING)
	private TipoCambioEnum tipoCambio;
	
	@Column(name = "TX_FONE")
	private String fone;
	
}




