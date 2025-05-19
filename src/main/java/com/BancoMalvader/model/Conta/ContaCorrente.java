package com.BancoMalvader.model.Conta;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class ContaCorrente extends Conta {
    private double limite;
    private LocalDate dataVencimento;
    private double taxaManutencao;

    public ContaCorrente(int idConta, String numeroConta, BigDecimal saldo, String tipoConta, LocalDateTime dataAbertura, String status, int idAgencia, int idCliente, double limite, LocalDate dataVencimento, double taxaManutencao) {
        super(idConta, numeroConta, saldo, tipoConta, dataAbertura, status, idAgencia, idCliente);
        this.limite = limite;
        this.dataVencimento = dataVencimento;
        this.taxaManutencao = taxaManutencao;
    }
}
