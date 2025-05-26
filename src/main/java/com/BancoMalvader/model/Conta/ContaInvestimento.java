package com.BancoMalvader.model.Conta;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaInvestimento extends Conta{
    private String perfilRisco;
    private double valorMinimo;
    private double taxaRendimentoBase;

}
