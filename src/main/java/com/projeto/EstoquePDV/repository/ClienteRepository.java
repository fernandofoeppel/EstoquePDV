package com.projeto.EstoquePDV.repository;

import com.projeto.EstoquePDV.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
