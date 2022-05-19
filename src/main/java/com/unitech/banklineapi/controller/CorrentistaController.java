/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unitech.banklineapi.controller;

import com.unitech.banklineapi.dto.NovoCorrentista;
import com.unitech.banklineapi.model.Correntista;
import com.unitech.banklineapi.repository.CorrentistaRepository;
import com.unitech.banklineapi.service.CorrentistaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlos
 */
@RestController
    @RequestMapping ("/correntista")

public class CorrentistaController {
    
    @Autowired
    private CorrentistaRepository repository;
    
    @Autowired
    private CorrentistaService service;
    
    @GetMapping
    public List<Correntista> findAll(){
    return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
           service.save(correntista);
    }
}
