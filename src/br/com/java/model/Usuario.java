package br.com.java.model;

import java.sql.Date;

public class Usuario {

    private String uid; 
    private String pwd;
    private String dica;
    private String resposta;
    private String Pnome;
    private String Unome;
    // private Date nascimento;
    private String endereco;
    private String cidade;
    private int cep;
    private String estado;
    private String pais;
    private String ccnome;
    private String ccno;
    private String email;
    
    

    
    
    public Usuario() {
		super();
	}

	public Usuario(String uid, String pwd, String dica, String resposta, String pnome, String unome, 
			String endereco, String cidade, int cep, String estado, String pais, String ccnome, String ccno,
			String email) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.dica = dica;
		this.resposta = resposta;
		Pnome = pnome;
		Unome = unome;
		// this.nascimento = nascimento;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.pais = pais;
		this.ccnome = ccnome;
		this.ccno = ccno;
		this.email = email;
	}
    
	public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getPnome() {
		return Pnome;
	}
	public void setPnome(String pnome) {
		Pnome = pnome;
	}
	public String getUnome() {
		return Unome;
	}
	public void setUnome(String unome) {
		Unome = unome;
	}
	// public Date getNascimento() {
	// 	return nascimento;
	// }
	// public void setNascimento(Date nascimento) {
	// 	this.nascimento = nascimento;
	// }
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCcnome() {
		return ccnome;
	}
	public void setCcnome(String ccnome) {
		this.ccnome = ccnome;
	}
	public String getCcno() {
		return ccno;
	}
	public void setCcno(String ccno) {
		this.ccno = ccno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}  
}
