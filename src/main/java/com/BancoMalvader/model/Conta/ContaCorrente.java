package com.BancoMalvader.model.Conta;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContaCorrente extends Conta {
    private double limite;
    private LocalDate dataVencimento;
    private double taxaManutencao;

}
