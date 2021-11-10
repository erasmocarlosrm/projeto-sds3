package com.devsuperior.dsvendas.servico;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSucessesDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entidade.Sale;
import com.devsuperior.dsvendas.repositorio.SaleRepositorio;
import com.devsuperior.dsvendas.repositorio.SellerRepositorio;

@Service
public class SaleService {

	@Autowired
	private SaleRepositorio repositorioSaler;
	
	@Autowired
	private SellerRepositorio sellerRepository;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> listSellar(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repositorioSaler.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupdBySeller(){
		return repositorioSaler.amountGroupdBySeller();
		
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessesDTO> successGroupdBySeller(){
		return repositorioSaler.successGroupdBySeller();
		
	}
	
}
