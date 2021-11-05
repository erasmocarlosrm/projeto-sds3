package com.devsuperior.dsvendas.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entidade.Seller;

public interface SellerRepositorio extends JpaRepository<Seller, Long> {

	

}
