package com.BancoMalvader.controller.Usuario;

import com.BancoMalvader.dao.Usuario.ClienteRepository;
import com.BancoMalvader.model.Usuario.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente){ return clienteRepository.save(cliente);}

    @GetMapping
    public List<Cliente> listarTodos(){ return clienteRepository.findAll(); }
}
