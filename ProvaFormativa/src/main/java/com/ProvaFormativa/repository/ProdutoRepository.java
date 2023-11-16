package com.ProvaFormativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProvaFormativa.entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{

}
