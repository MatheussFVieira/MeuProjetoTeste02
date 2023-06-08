package com.saper.boxbackend.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class NotaFiscalItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_item;
    @Column(nullable = false)
    int id_nota;
    @Column(nullable = false)
    int id_material;
    @Column(nullable = false)
    int quantidade;
    @Column(nullable = false)
    double valor_unitario;
    @Column(nullable = false)
    double valor_total;

    public Long getId_item() {
        return id_item;
    }

    public void setId_item(Long id_item) {
        this.id_item = id_item;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
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

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalItem that = (NotaFiscalItem) o;
        return id_nota == that.id_nota &&
                id_material == that.id_material &&
                quantidade == that.quantidade &&
                Double.compare(that.valor_unitario, valor_unitario) == 0 &&
                Double.compare(that.valor_total, valor_total) == 0 &&
                Objects.equals(id_item, that.id_item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_item,
                id_nota,
                id_material,
                quantidade,
                valor_unitario,
                valor_total);
    }

    public NotaFiscalItem(){
    }
    public NotaFiscalItem(Long id_item,
                          int id_nota,
                          int id_material,
                          int quantidade,
                          double valor_unitario,
                          double valor_total) {
        this.id_item = id_item;
        this.id_nota = id_nota;
        this.id_material = id_material;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
    }
}

