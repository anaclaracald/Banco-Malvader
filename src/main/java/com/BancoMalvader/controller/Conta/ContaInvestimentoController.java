package com.BancoMalvader.controller.Conta;

import com.BancoMalvader.dao.Conta.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ContaInvestimento")
public class ContaInvestimentoController {
    @Autowired
    private ContaCorrenteRepository contaCorrenteRepository;
}
