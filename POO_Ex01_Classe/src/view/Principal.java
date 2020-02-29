package view;

import java.util.Date;

import model.CaixaEletronico;
import model.Conta;
import model.Transacao;

public class Principal {

	public static void main(String[] args) {
	
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		Conta conta = caixaEletronico.autenticar("1113", "123");
		
		Date dataInicio = new Date();
		
		if (conta != null) {
			System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
			conta.efetuarDeposito(200.00f);
			System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
			conta.efetuarSaque(1000.00f);
			System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
			conta.efetuarPagamento("Boleto internet", 159.90f);
			System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
			
			Date dataFinal = new Date();
			dataFinal.setHours(dataFinal.getHours() + 1);
			
			for (Transacao transacao : conta.efetuarExtrato(dataInicio, dataFinal)) {
				System.out.println(transacao.toString());
			}
			
		}
	}
	
}
