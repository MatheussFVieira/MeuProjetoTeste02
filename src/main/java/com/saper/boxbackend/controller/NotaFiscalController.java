package com.saper.boxbackend.controller;

import com.saper.boxbackend.model.NotaFiscal;
import com.saper.boxbackend.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/nota_fiscal")
public class NotaFiscalController {
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @GetMapping
    public List<NotaFiscal> listar(){
        return notaFiscalRepository.findAll();
    }
    @PostMapping
    public NotaFiscal adicionar(@RequestBody NotaFiscal material){
        return notaFiscalRepository.save(material);
    }
}
