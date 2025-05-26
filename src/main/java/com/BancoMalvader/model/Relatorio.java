package com.BancoMalvader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class Relatorio {
    @Id @GeneratedValue
    private int idRelatorio;
    private LocalDateTime dataGeracao;
    private String tipoRelatorio;
    private String conteudo;
    private int idFuncionario;

    public void gerarRelatorio() {
        // lógica
    }

    public void exportarRelatorio() {
        // lógica
    }

}
