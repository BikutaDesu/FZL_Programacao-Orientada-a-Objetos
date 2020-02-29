package model;

import java.util.Date;

public class Transacao {

	private Double valor;
	private Date data;
	
	public Transacao(Double valor, Date data) {
		this.valor = valor;
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Transacao [valor=" + valor + ", data=" + data + "]";
	}
}
