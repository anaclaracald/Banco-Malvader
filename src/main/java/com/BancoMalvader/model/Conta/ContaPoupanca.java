package com.BancoMalvader.model.Conta;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private LocalDateTime ultimoRendimento;
}
