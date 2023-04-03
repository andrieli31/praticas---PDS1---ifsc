package ex1;

import java.sql.Date;

public class Pessoa {
	private Long cpf;
	private String nome;
	private String sobrenome;
	private String dataNasc;
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	@Override
	public String toString() {
		return " nome: " + this.nome + " Sobrenome: \n"+ this.sobrenome + " CPF: "+ this.cpf + " Data de nascimento: "+ this.dataNasc;
		
	}

}
