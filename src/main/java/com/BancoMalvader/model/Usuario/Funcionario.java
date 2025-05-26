package com.BancoMalvader.model.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFuncionario;
    private String codigoFuncionario;

    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    private Integer idSupervisor;

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
        System.out.println("===== DADOS DO FUNCIONÁRIO =====");
        System.out.println("ID...............: " + idFuncionario);
        System.out.println("Código...........: " + codigoFuncionario);
        System.out.println("Cargo............: " + cargo);
        System.out.println("Supervisor.......: " + (idSupervisor != null ? idSupervisor : "Nenhum"));
    }

}
