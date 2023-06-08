package com.saper.boxbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class NotaFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_nota;
    int cod_operacao;
    String tipo_nota;
    int id_funcionario;
    String data;
    double valor_total;
    String forma_pagamento;
    String situacao;

    public Long getId_nota() {
        return id_nota;
    }

    public void setId_nota(Long id_nota) {
        this.id_nota = id_nota;
    }

    public int getCod_operacao() {
        return cod_operacao;
    }

    public void setCod_operacao(int cod_operacao) {
        this.cod_operacao = cod_operacao;
    }

    public String getTipo_nota() {
        return tipo_nota;
    }

    public void setTipo_nota(String tipo_nota) {
        this.tipo_nota = tipo_nota;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscal that = (NotaFiscal) o;
        return cod_operacao == that.cod_operacao &&
                id_funcionario == that.id_funcionario &&
                Double.compare(that.valor_total, valor_total) == 0 &&
                Objects.equals(id_nota, that.id_nota) &&
                Objects.equals(tipo_nota, that.tipo_nota) &&
                Objects.equals(data, that.data) &&
                Objects.equals(forma_pagamento, that.forma_pagamento) &&
                Objects.equals(situacao, that.situacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_nota,
                cod_operacao,
                tipo_nota,
                id_funcionario,
                data,
                valor_total,
                forma_pagamento,
                situacao);
    }

    public NotaFiscal(){
    }
    public NotaFiscal(Long id_nota,
                      int cod_operacao,
                      String tipo_nota,
                      int id_funcionario,
                      String data,
                      double valor_total,
                      String forma_pagamento,
                      String situacao) {
        this.id_nota = id_nota;
        this.cod_operacao = cod_operacao;
        this.tipo_nota = tipo_nota;
        this.id_funcionario = id_funcionario;
        this.data = data;
        this.valor_total = valor_total;
        this.forma_pagamento = forma_pagamento;
        this.situacao = situacao;
    }
}

