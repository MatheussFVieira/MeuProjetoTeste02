package com.saper.boxbackend.model;

import jakarta.persistence.*;
import java.util.Objects;
@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_material;
    @Column(nullable = false)
    String nome;
    String codigo_barras;
    double valor_compra;
    int id_fornecedor;
    int qt_minima;
    String fabricante;
    String descricao;

    public Long getId_material() {
        return id_material;
    }

    public void setId_material(Long id_material) {
        this.id_material = id_material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getQt_minima() {
        return qt_minima;
    }

    public void setQt_minima(int qt_minima) {
        this.qt_minima = qt_minima;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Double.compare(material.valor_compra, valor_compra) == 0 &&
                id_fornecedor == material.id_fornecedor &&
                qt_minima == material.qt_minima &&
                Objects.equals(id_material, material.id_material) &&
                Objects.equals(nome, material.nome) &&
                Objects.equals(codigo_barras, material.codigo_barras) &&
                Objects.equals(fabricante, material.fabricante) &&
                Objects.equals(descricao, material.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_material,
                nome,
                codigo_barras,
                valor_compra,
                id_fornecedor,
                qt_minima,
                fabricante,
                descricao);
    }

    public Material(){
    }
    public Material(Long id_material,
                    String nome,
                    String codigo_barras,
                    double valor_compra,
                    int id_fornecedor,
                    int qt_minima,
                    String fabricante,
                    String descricao) {
        this.id_material = id_material;
        this.nome = nome;
        this.codigo_barras = codigo_barras;
        this.valor_compra = valor_compra;
        this.id_fornecedor = id_fornecedor;
        this.qt_minima = qt_minima;
        this.fabricante = fabricante;
        this.descricao = descricao;
    }
}

