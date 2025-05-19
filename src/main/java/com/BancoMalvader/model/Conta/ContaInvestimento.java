package com.BancoMalvader.model.Conta;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ContaInvestimento extends Conta{
    private String perfilRisco;
    private double valorMinimo;
    private double taxaRendimentoBase;

    public ContaInvestimento(int idConta, String numeroConta, BigDecimal saldo, String tipoConta, LocalDateTime dataAbertura, String status, int idAgencia, int idCliente, String perfilRisco, double valorMinimo, double taxaRendimentoBase) {
        super(idConta, numeroConta, saldo, tipoConta, dataAbertura, status, idAgencia, idCliente);
        this.perfilRisco = perfilRisco;
        this.valorMinimo = valorMinimo;
        this.taxaRendimentoBase = taxaRendimentoBase;
    }
}
