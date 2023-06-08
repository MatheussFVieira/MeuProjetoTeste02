package com.saper.boxbackend.controller;

import com.saper.boxbackend.model.Funcionario;
import com.saper.boxbackend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listar(){
        return funcionarioRepository.findAll();
    }
    @PostMapping
    public Funcionario adicionar(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }
}
