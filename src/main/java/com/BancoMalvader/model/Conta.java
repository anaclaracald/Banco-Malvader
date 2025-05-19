package com.BancoMalvader.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Conta {
    protected int idConta;
    protected String numeroConta;
    protected BigDecimal saldo;
    protected String tipoConta;
    protected LocalDateTime dataAbertura;
    protected String status;
    protected int idAgencia;
    protected int idCliente;

    public void abrirConta() {
        // lógica
    }

    public void encerrarConta() {
        // lógica
    }

    public void exibirConta() {
        // lógica
    }

    public void alterarConta() {
        // lógica
    }

    public void exibirSaldo() {
        // lógica
    }

    public void depositar() {
        // lógica
    }

    public void sacar() {
        // lógica
    }

    public void transferir() {
        // lógica
    }

    public void exibirExtrato() {
        // lógica
    }

    public void consultarLimite() {
        // lógica
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


}



