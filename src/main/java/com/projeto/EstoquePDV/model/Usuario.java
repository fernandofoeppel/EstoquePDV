package com.projeto.EstoquePDV.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    private String cargo;

    @OneToMany(mappedBy = "usuario")
    private List<Venda> vendas = new ArrayList<>();
}
