package com.saper.boxbackend.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_estoque;
    @Column(nullable = false)
    int id_material;
    @Column(nullable = false)
    int quantidade;

    public Long getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(Long id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque = (Estoque) o;
        return id_material == estoque.id_material &&
                quantidade == estoque.quantidade &&
                Objects.equals(id_estoque, estoque.id_estoque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_estoque,
                id_material,
                quantidade);
    }

    public Estoque(){
    }
    public Estoque(Long id_estoque, int id_material, int quantidade) {
        this.id_estoque = id_estoque;
        this.id_material = id_material;
        this.quantidade = quantidade;
    }
}

