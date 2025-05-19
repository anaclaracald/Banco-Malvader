package com.BancoMalvader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Relatorio {
    @Id @GeneratedValue
    private int idRelatorio;
    private LocalDateTime dataGeracao;
    private String tipoRelatorio;
    private String conteudo;
    private int idFuncionario;

    public Relatorio(int idRelatorio, LocalDateTime dataGeracao, String tipoRelatorio, String conteudo, int idFuncionario) {
        this.idRelatorio = idRelatorio;
        this.dataGeracao = dataGeracao;
        this.tipoRelatorio = tipoRelatorio;
        this.conteudo = conteudo;
        this.idFuncionario = idFuncionario;
    }

    public void gerarRelatorio() {
        // lógica
    }

    public void exportarRelatorio() {
        // lógica
    }

}
