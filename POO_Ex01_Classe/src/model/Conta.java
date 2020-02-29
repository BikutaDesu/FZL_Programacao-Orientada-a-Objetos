package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Conta {

	private double saldo;
	private String numero;
	private String senha;
	private List<Transacao> historico;

	public Conta(String numero, String senha) {
		historico = new ArrayList<>();
		this.numero = numero;
		this.senha = senha;
		this.saldo = new Random().nextDouble() * 5000;
	}

	public boolean efetuarSaque(double valor) {
		if (valor > saldo) {
			return false;
		} else {
			saldo -= valor;
			Transacao saque = new Saque(valor, getDataAtual());
			historico.add(saque);
			return true;
		}
	}

	public boolean efetuarDeposito(double valor) {
		saldo += valor;
		Transacao deposito = new Deposito(valor, getDataAtual());
		historico.add(deposito);
		return true;
	}

	public boolean efetuarPagamento(String boleto, double valor) {
		if (valor > saldo) {
			return false;
		} else {
			saldo -= valor;
			Transacao pagamento = new Pagamento(valor, getDataAtual(), boleto);
			historico.add(pagamento);
			return true;
		}
	}

	public List<Transacao> efetuarExtrato(Date dataInicio, Date dataFinal){
		List<Transacao> extrato = new ArrayList<>();
		for (Transacao transacao : historico) {
			if (transacao.getData().after(dataInicio) && transacao.getData().before(dataFinal)) {
				extrato.add(transacao);
			}
		}
		return extrato;
	}
	
	private Date getDataAtual() {
		return new Date();
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
