package com.devsuperior.dsvendas.servico;


import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entidade.Sale;
import com.devsuperior.dsvendas.repositorio.SaleRepositorio;

@Service
public class SaleService {

	@Autowired
	private SaleRepositorio repositorioSaler;
	
	
	public Page<SaleDTO> listSellar(Pageable pageable){
		Page<Sale> result = repositorioSaler.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	
}
