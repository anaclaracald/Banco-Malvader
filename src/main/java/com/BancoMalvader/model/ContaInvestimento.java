package com.BancoMalvader.model;

public class ContaInvestimento {
    private String perfilRisco;
    private double valorMinimo;
    private double taxaRendimentoBase;

    public String getPerfilRisco() {
        return perfilRisco;
    }

    public void setPerfilRisco(String perfilRisco) {
        this.perfilRisco = perfilRisco;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getTaxaRendimentoBase() {
        return taxaRendimentoBase;
    }

    public void setTaxaRendimentoBase(double taxaRendimentoBase) {
        this.taxaRendimentoBase = taxaRendimentoBase;
    }
}
