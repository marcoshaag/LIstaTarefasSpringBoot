package com.listaTarefas.demo.service;

import com.listaTarefas.demo.model.Tarefas;
import com.listaTarefas.demo.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {

    @Autowired
    private TarefasRepository tarefasRepository;

    public List<Tarefas> listarTodos(){
        return tarefasRepository.findAll();
    }

    public Tarefas consultarPorid(long id){
        return tarefasRepository.findById(id).get();
    }

    public Tarefas inserir(Tarefas tarefas) {
        this.tarefasRepository.save(tarefas);
        return (Tarefas) listarTodos();
    }

    public Tarefas atualizar(Tarefas atualizarTarefa){
        return tarefasRepository.save(atualizarTarefa);
    }
    public boolean deletar(Integer id){
         this.tarefasRepository.deleteById(id.longValue());
         return true;
    }
}
