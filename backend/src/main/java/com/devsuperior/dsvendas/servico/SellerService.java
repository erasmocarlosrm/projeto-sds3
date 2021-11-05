package com.devsuperior.dsvendas.servico;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entidade.Seller;
import com.devsuperior.dsvendas.repositorio.SellerRepositorio;

@Service
public class SellerService {

	@Autowired
	private SellerRepositorio repositorioSeller;
	
	
	public List<SellerDTO> listSellar(){
		List<Seller> result = repositorioSeller.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
}
