package com.BancoMalvader.model.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Usuario{
    @Id @GeneratedValue
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

    }
}
