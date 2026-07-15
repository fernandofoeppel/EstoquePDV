package com.projeto.EstoquePDV.repository;

import com.projeto.EstoquePDV.model.ProdutoCarrinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoCarrinhoRepository extends JpaRepository<ProdutoCarrinho, Long> {
}
