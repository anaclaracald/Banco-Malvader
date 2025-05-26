package com.BancoMalvader.model.Conta;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Conta {
    @Id
    @GeneratedValue
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

}



