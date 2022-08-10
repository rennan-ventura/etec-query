package br.com.etechoracio.etecquery.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.etecquery.enums.TipoCambioEnum;
import br.com.etechoracio.etecquery.model.Veiculo;

public interface VeiculoDAO extends JpaRepository<Veiculo, Long> {
	List<Veiculo> findByTipoCambio(TipoCambioEnum tipo);

	List<Veiculo> findByFabricante(String fabricante);
	
	List<Veiculo> findByTipoCambioAndFabricante(TipoCambioEnum tipo, String fabricante);
	
	List<Veiculo> findByAnoFabricacao(Integer anoFabricação);
	
	List<Veiculo> findByValorBetween(BigDecimal min, BigDecimal max);
	
	List<Veiculo> findByTelefonesIsNotNull();
}
