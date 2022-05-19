/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unitech.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitech.banklineapi.dto.NovaMovimentacao;
import com.unitech.banklineapi.model.Movimentacao;
import com.unitech.banklineapi.repository.MovimentacaoRepository;
import com.unitech.banklineapi.service.MovimentacaoService;



/**
 *
 * @author carlos
 */
@RestController
 @RequestMapping ("/movimentacoes")
public class MovimentacaoController {
    
	@Autowired
    private MovimentacaoRepository repository;
    
    @Autowired
    private MovimentacaoService service;
    
    @GetMapping
    public List<Movimentacao> findAll(){
    return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
          service.save(movimentacao);
    }
}
