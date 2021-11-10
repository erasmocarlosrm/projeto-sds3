package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSucessesDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.servico.SaleService;

@RestController
@RequestMapping(value ="/sales")
public class SaleControle {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.listSellar(pageable);
		return ResponseEntity.ok(list);

	}

	@GetMapping("/soma")
	public ResponseEntity<List<SaleSumDTO>> amoutGroupedBySeller() {
		List<SaleSumDTO> list = service.amountGroupdBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/sucesso")
	public ResponseEntity<List<SaleSucessesDTO>> sucessoGroupedBySeller() {
		List<SaleSucessesDTO> list = service.successGroupdBySeller();
		return ResponseEntity.ok(list);
	}

}
