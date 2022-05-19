package com.unitech.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unitech.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
