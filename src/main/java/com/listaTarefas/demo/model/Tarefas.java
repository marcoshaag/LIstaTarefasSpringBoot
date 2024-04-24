package com.listaTarefas.demo.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tarefas")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome", length = 20)
    private String nome;
    @Column(name="descricao")
    private String descricao;
    @Column(name = "dataVencimento")
    private LocalDate datavencimento;
    @Column(name = "dataCriacao", columnDefinition = "DATE DEFAULT CURRENT_DATE")
    private LocalDate dataCriacao;
}
