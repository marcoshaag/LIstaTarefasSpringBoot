package com.listaTarefas.demo.controller;


import com.listaTarefas.demo.model.Tarefas;
import com.listaTarefas.demo.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TarefasController {

    @Autowired
    private TarefasService tarefasService;

    @GetMapping
    public List<Tarefas> listarTodos(){
        List<Tarefas> tarefas = tarefasService.listarTodos();
        return tarefas;
    }

    @GetMapping("/{id}")
    public Tarefas consultarPorid(@PathVariable Integer id){
        Tarefas tarefas = tarefasService.consultarPorid(id);
        return tarefas;
    }

    @PostMapping()
    public Tarefas inserir(@RequestBody Tarefas novo){
        return tarefasService.inserir(novo);
    }

    @PutMapping()
    public Tarefas atualizar(@RequestBody Tarefas atualizarTarefa){
        return tarefasService.atualizar(atualizarTarefa);
    }

    @DeleteMapping("/{id}")
    public boolean deleta(@PathVariable Integer id){
        return tarefasService.deletar(id);
    }


}
