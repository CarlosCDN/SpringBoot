
package com.unitech.banklineapi.dto;

import com.unitech.banklineapi.model.MovimentacaoTipo;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author carlos
 */
public class NovaMovimentacao {

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the saldo
     */
  

    /**
     * @return the tipo
     */
    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the idConta
     */
    public Integer getIdConta() {
        return idConta;
    }

    /**
     * @param idConta the idConta to set
     */
    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;

}
