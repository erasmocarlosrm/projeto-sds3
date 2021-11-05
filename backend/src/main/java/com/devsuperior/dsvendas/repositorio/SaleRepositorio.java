package com.devsuperior.dsvendas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entidade.Sale;

public interface SaleRepositorio extends JpaRepository<Sale, Long> {

}
