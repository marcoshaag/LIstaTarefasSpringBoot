package com.listaTarefas.demo.repository;

import com.listaTarefas.demo.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
