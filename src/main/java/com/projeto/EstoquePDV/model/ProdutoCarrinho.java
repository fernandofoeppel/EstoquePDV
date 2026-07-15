package com.projeto.EstoquePDV.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class ProdutoCarrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int quantidade;
    private double precoUnitario;


    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Estoque produto;

    @ManyToOne
    @JoinColumn(name = "venda_id")
    private Venda venda;

}
