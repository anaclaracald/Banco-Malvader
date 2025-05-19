package com.BancoMalvader.model;

public class Funcionario {
    private int idFuncionario;
    private String codigoFuncionario;
    private String cargo;
    private Integer idSupervisor;
    private int idUsuario;

    public void cadastrarFuncionario() {
        // Cadastro com permissão
    }

    public void loginFuncionario() {
        // Login com OTP
    }

    public void alterarFuncionario() {
        // Atualiza dados do funcionário
    }

    public void exibirFuncionario() {
        // Exibe dados
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Integer idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
