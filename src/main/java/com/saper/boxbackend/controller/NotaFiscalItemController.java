package com.saper.boxbackend.controller;

import com.saper.boxbackend.model.NotaFiscalItem;
import com.saper.boxbackend.repository.NotaFiscalItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nota_fiscal_item")
public class NotaFiscalItemController {
    @Autowired
    private NotaFiscalItemRepository notafiscalitemRepository;

    @GetMapping
    public List<NotaFiscalItem> listar(){
        return notafiscalitemRepository.findAll();
    }
    @PostMapping
    public NotaFiscalItem adicionar(@RequestBody NotaFiscalItem fornecedor){
        return notafiscalitemRepository.save(fornecedor);
    }
}
