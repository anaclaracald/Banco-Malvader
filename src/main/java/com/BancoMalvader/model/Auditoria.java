package com.BancoMalvader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Auditoria {
    @Id
    private int idAuditoria;
    private String acao;
    private LocalDateTime dataHora;
    private String detalhes;
    private int idUsuario;

    public Auditoria(int idAuditoria, String acao, LocalDateTime dataHora, String detalhes, int idUsuario) {
        this.idAuditoria = idAuditoria;
        this.acao = acao;
        this.dataHora = dataHora;
        this.detalhes = detalhes;
        this.idUsuario = idUsuario;
    }

    public void registrarAuditoria() {
        // lógica
    }

    public void exibirAuditoria() {
        // lógica
    }


}
