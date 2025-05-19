package com.BancoMalvader.model.Usuario;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public abstract class Usuario {
    @Id @GeneratedValue
    protected int idUsuario;
    protected String nome;
    protected String cpf;
    protected String dataNascimento; // ou LocalDate
    protected String telefone;
    protected String tipoUsuario; // CLIENTE ou FUNCIONARIO
    protected String senhaHash;
    protected String otpAtivo;
    protected LocalDateTime otpExpiracao;

    public Usuario(int idUsuario, String nome, String cpf, String dataNascimento, String telefone, String tipoUsuario, String senhaHash, String otpAtivo, LocalDateTime otpExpiracao) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.senhaHash = senhaHash;
        this.otpAtivo = otpAtivo;
        this.otpExpiracao = otpExpiracao;
    }
}
