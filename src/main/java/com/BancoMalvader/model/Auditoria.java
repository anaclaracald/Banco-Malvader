package com.BancoMalvader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Auditoria {
    @Id
    private int idAuditoria;
    private String acao;
    private LocalDateTime dataHora;
    private String detalhes;
    private int idUsuario;

    public void registrarAuditoria() {
        // lógica
    }

    public void exibirAuditoria() {
        // lógica
    }


}
