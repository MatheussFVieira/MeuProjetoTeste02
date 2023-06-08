package com.saper.boxbackend.controller;

import com.saper.boxbackend.model.Fornecedor;
import com.saper.boxbackend.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping
    public List<Fornecedor> listar(){
        return fornecedorRepository.findAll();
    }
    @PostMapping
    public Fornecedor adicionar(@RequestBody Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }
}