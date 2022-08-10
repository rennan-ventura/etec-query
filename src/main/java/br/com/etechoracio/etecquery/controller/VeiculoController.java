package br.com.etechoracio.etecquery.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.etecquery.dao.VeiculoDAO;
import br.com.etechoracio.etecquery.enums.TipoCambioEnum;
import br.com.etechoracio.etecquery.model.Veiculo;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	
	@Autowired
	private VeiculoDAO dao;
	
	@GetMapping("/cambio/{cambio}")
	public List<Veiculo> buscarPorTipoCambio(@PathVariable TipoCambioEnum cambio) {
		return dao.findByTipoCambio(cambio) ;
	}
	
	@GetMapping("/fabricante/{fabricante}")
	public List<Veiculo> buscarPorFabricante(@PathVariable String fabricante) {
		return dao.buscarPorFabricante(fabricante);
	}
	
	@GetMapping("/cambio/{cambio}/fabricante/{fabricante}")
	public List<Veiculo> buscarPorTipoCambioEFabricante(@PathVariable TipoCambioEnum cambio,
														@PathVariable String fabricante) {
		return dao.buscarPorTipoCambioEFabricante(cambio, fabricante);
	}
	
	@GetMapping("/ano-fabricacao/{anoFabricacao}")
	public List<Veiculo> buscarPorAnoFabricacao(@PathVariable Integer anoFabricacao) {
		return dao.buscarPorAnoFabricacao(anoFabricacao);
	}
	
	@GetMapping("/valor")
	public List<Veiculo> buscarPorValor(@RequestParam BigDecimal min, 
										@RequestParam BigDecimal max) {
		return dao.buscarPorValor(min, max);
	}
	
	@GetMapping("/telefones")
	public List<Veiculo> buscarComTelefones(@PathVariable String fone) {
		return dao.buscarComTelefones(fone);
	}
	
}
