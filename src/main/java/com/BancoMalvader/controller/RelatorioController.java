package com.BancoMalvader.controller;

import com.BancoMalvader.dao.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Relatorio")
public class RelatorioController {
    @Autowired
    private RelatorioRepository relatorioRepository;


}
