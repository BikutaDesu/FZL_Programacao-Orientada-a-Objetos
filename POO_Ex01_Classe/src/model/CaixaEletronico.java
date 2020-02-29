package model;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {

	private List<Conta> lista = new ArrayList<>();
	
	public CaixaEletronico() {
		lista.add(new Conta("1111", "123"));
		lista.add(new Conta("1112", "123"));
		lista.add(new Conta("1113", "123"));
		lista.add(new Conta("1114", "123"));
		lista.add(new Conta("1115", "123"));
	}
	
	public Conta autenticar(String numero, String senha) {
		Conta retornoConta = null;
		for (Conta conta : lista) {
			if ((conta.getNumero().equals(numero)) && (conta.getSenha().equals(senha))) {
				retornoConta = conta;
			}
		}
		return retornoConta;
	}
	
}
