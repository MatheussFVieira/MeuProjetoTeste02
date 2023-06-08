package com.saper.boxbackend.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_fornecedor;
    @Column(nullable = false)
    int matricula;
    @Column(nullable = false)
    String nome;
    String endereco;
    String telefone;
    String cnpj;
    int tempo_entrega;
    String email;

    public Long getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Long id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getTempo_entrega() {
        return tempo_entrega;
    }

    public void setTempo_entrega(int tempo_entrega) {
        this.tempo_entrega = tempo_entrega;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return id_fornecedor == that.id_fornecedor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_fornecedor);
    }

    public Fornecedor() {

    }

    public Fornecedor(Long id_fornecedor,
                      int matricula,
                      String nome,
                      String endereco,
                      String telefone,
                      String cnpj,
                      int tempo_entrega,
                      String email) {
        this.id_fornecedor = id_fornecedor;
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.tempo_entrega = tempo_entrega;
        this.email = email;
    }
}

