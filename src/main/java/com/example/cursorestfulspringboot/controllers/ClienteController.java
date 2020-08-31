package com.example.cursorestfulspringboot.controllers;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    public List<Cliente> clientes;

    @PostConstruct 
    public void init(){
        Cliente c1 = new Cliente();
        c1.id = 01;
        c1.endereco = "Rua 04, 97";
        c1.nome = "Robson Silvestre";
        c1.saldo = 200;

        Cliente c2 = new Cliente();
        c2.id = 02;
        c2.endereco = "Rua 05, 98";
        c2.nome = "Maria Silvestre";
        c2.saldo = 3870;
        
        Cliente c3 = new Cliente();
        c3.id = 03;
        c3.endereco = "Rua 06, 99";
        c3.nome = "Carla Silvestre";
        c3.saldo = 3870;

        clientes = Arrays.asList(c1,c2,c3);
    }
    
    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clientes;
    }

    @GetMapping("/clientes/{codigo}")
    public String getClienteByCodigo(@PathVariable int codigo){
        return "Vai retornar o cliente de codigo: " + codigo ;
    }
}