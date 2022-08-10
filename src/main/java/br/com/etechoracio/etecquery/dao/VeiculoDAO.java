package br.com.etechoracio.etecquery.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.etecquery.enums.TipoCambioEnum;
import br.com.etechoracio.etecquery.model.Veiculo;

public interface VeiculoDAO extends JpaRepository<Veiculo, Long> {
	List<Veiculo> findByTipoCambio(TipoCambioEnum tipo);

	List<Veiculo> buscarPorFabricante(String fabricante);
	
	List<Veiculo> buscarPorTipoCambioEFabricante(TipoCambioEnum tipo, String fabricante);
	
	List<Veiculo> buscarPorAnoFabricacao(Integer anoFabricação);
	
	List<Veiculo> buscarPorValor(BigDecimal min, BigDecimal max);
	
	List<Veiculo> buscarComTelefones(String fone);
}
