package com.saper.boxbackend.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_funcionario;
    int matricula;
    @Column(nullable = false)
    String nome;
    String endereco;
    String telefone;
    String cpf;
    String data_nascimento;
    String situacao;
    String email;
    String cargo;
    String login;
    String senha;

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return matricula == that.matricula &&
                Objects.equals(id_funcionario, that.id_funcionario) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(telefone, that.telefone) &&
                Objects.equals(cpf, that.cpf) &&
                Objects.equals(data_nascimento, that.data_nascimento) &&
                Objects.equals(situacao, that.situacao) &&
                Objects.equals(email, that.email) &&
                Objects.equals(cargo, that.cargo) &&
                Objects.equals(login, that.login) &&
                Objects.equals(senha, that.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_funcionario,
                matricula,
                nome,
                endereco,
                telefone,
                cpf,
                data_nascimento,
                situacao,
                email,
                cargo,
                login,
                senha);
    }

    public Funcionario(){
    }
    public Funcionario(Long id_funcionario,
                       int matricula,
                       String nome,
                       String endereco,
                       String telefone,
                       String cpf,
                       String data_nascimento,
                       String situacao,
                       String email,
                       String cargo,
                       String login,
                       String senha) {
        this.id_funcionario = id_funcionario;
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.situacao = situacao;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }
}

