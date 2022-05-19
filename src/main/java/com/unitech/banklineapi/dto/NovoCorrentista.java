package com.unitech.banklineapi.dto;





public class NovoCorrentista {

    
  private String nome;
  private String cpf;
  private Integer numCel;
  private String email;
  private String senha;
  private String dataNasc;

  
  public String getDataNasc() {

	  
	  return dataNasc;
}


  public void setDataNasc(String dataNasc) {
	this.dataNasc = dataNasc;
}


  
  
  
  public Integer getNumCel(){
	return numCel;
}

public void setNumCel(Integer numCel) {
	this.numCel = numCel;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}


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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

  


}
