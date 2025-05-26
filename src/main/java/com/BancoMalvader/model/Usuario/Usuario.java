package com.BancoMalvader.model.Usuario;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
}
