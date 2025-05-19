package com.BancoMalvader.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter @Getter
public class Cliente extends Usuario{
    @Id @GeneratedValue
    private int idCliente;
    private double scoreCredito;
    private int idUsuario;

    public Cliente(int idUsuario, String nome, String cpf, String dataNascimento, String telefone, String tipoUsuario, String senhaHash, String otpAtivo, LocalDateTime otpExpiracao, int idCliente, double scoreCredito, int idUsuario1) {
        super(idUsuario, nome, cpf, dataNascimento, telefone, tipoUsuario, senhaHash, otpAtivo, otpExpiracao);
        this.idCliente = idCliente;
        this.scoreCredito = scoreCredito;
        this.idUsuario = idUsuario1;
    }

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

    }
}
