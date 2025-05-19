package com.BancoMalvader.model;

public class Cliente {
    private int idCliente;
    private double scoreCredito;
    private int idUsuario;

    public void cadastrarCliente() {
        // Lógica para cadastrar cliente
    }

    public void loginCliente() {
        // Verifica senha + OTP
    }

    public void alterarCliente() {
        // Altera dados do cliente
    }

    public void exibirCliente() {
        // Exibe dados do cliente
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getScoreCredito() {
        return scoreCredito;
    }

    public void setScoreCredito(double scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
