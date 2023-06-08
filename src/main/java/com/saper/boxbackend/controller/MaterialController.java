package com.saper.boxbackend.controller;

import com.saper.boxbackend.model.Material;
import com.saper.boxbackend.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping
    public List<Material> listar(){
        return materialRepository.findAll();
    }
    @PostMapping
    public Material adicionar(@RequestBody Material material){
        return materialRepository.save(material);
    }
}