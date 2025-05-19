package com.BancoMalvader.model;

import java.time.LocalDateTime;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;
    private LocalDateTime ultimoRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public LocalDateTime getUltimoRendimento() {
        return ultimoRendimento;
    }

    public void setUltimoRendimento(LocalDateTime ultimoRendimento) {
        this.ultimoRendimento = ultimoRendimento;
    }
}
