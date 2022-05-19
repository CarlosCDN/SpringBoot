package com.unitech.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tab_correntista")
public class Correntista {

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

     @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

     
    @Column (length = 60) 
    private String nomeCompleto;
   
    @Column (length = 60) 
    private String email;
    
    @Column (length = 6) 
    private String senha;
    
    @Column (length = 12)
    private String cpf;
    
    @Column (length = 9) 
    private Integer numCel;
    
    @Column (length = 9)
    private String dataNasc;
    
    public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}



	@Embedded
    private Conta conta;
    
    
    public Conta getConta() {
        return conta;
    }


    public void setConta(Conta conta) {
        this.conta = conta;
    }
    

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpf
     */
    

    /**
     * @return the numCel
     */
    public Integer getNumCel() {
        return numCel;
    }

    /**
     * @param numCel the numCel to set
     */
    public void setNumCel(Integer numCel) {
        this.numCel = numCel;
    }

}
