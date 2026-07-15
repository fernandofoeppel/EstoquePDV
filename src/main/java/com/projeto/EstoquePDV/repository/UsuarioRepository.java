package com.projeto.EstoquePDV.repository;

import com.projeto.EstoquePDV.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
