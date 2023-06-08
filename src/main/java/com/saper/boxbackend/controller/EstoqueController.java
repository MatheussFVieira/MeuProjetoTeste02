package com.saper.boxbackend.controller;

import com.saper.boxbackend.model.Estoque;
import com.saper.boxbackend.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {
    @Autowired
    private EstoqueRepository estoqueRepository;

    @GetMapping
    public List<Estoque> listar(){
        return estoqueRepository.findAll();
    }
    @PostMapping
    public Estoque adicionar(@RequestBody Estoque fornecedor){
        return estoqueRepository.save(fornecedor);
    }
}
