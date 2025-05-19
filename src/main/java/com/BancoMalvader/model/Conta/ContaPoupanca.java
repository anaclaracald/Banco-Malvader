package com.BancoMalvader.model.Conta;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private LocalDateTime ultimoRendimento;

    public ContaPoupanca(int idConta, String numeroConta, BigDecimal saldo, String tipoConta, LocalDateTime dataAbertura, String status, int idAgencia, int idCliente, double taxaRendimento, LocalDateTime ultimoRendimento) {
        super(idConta, numeroConta, saldo, tipoConta, dataAbertura, status, idAgencia, idCliente);
        this.taxaRendimento = taxaRendimento;
        this.ultimoRendimento = ultimoRendimento;
    }
}
