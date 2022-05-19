/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unitech.banklineapi.service;

import com.unitech.banklineapi.dto.NovoCorrentista;
import com.unitech.banklineapi.model.Conta;
import com.unitech.banklineapi.model.Correntista;
import com.unitech.banklineapi.repository.CorrentistaRepository;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class CorrentistaService {
    @Autowired
    private CorrentistaRepository repository;
  public void save(NovoCorrentista novoCorrentista)  {
   Correntista correntista = new Correntista();
   correntista.setCpf(novoCorrentista.getCpf());
   correntista.setNomeCompleto(novoCorrentista.getNome());
   correntista.setDataNasc(novoCorrentista.getDataNasc());
   correntista.setNumCel(novoCorrentista.getNumCel());
   correntista.setEmail(novoCorrentista.getEmail());
   correntista.setSenha(novoCorrentista.getSenha());

   Conta conta = new Conta();
   conta.setSaldo(0.0);
   conta.setNumero(new Date().getTime());
   correntista.setConta(conta);
   repository.save(correntista);
  }
}
