package model;

import java.util.Date;

public class Aluno {
	
	private long id;
	private String nome;
	private String ra;
	private Date nascimento;
	
	public Aluno(long id, String nome, String ra, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.ra = ra;
		this.nascimento = nascimento;
	}
	
	public void exibir() {
		System.out.printf("\nID: %d\nNome: %s\nRA: %s\nData de nascimento: %s\n\n",id, nome, ra, nascimento.toString());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
