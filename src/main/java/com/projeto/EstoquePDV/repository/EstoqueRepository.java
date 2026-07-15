package com.projeto.EstoquePDV.repository;

import com.projeto.EstoquePDV.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}
