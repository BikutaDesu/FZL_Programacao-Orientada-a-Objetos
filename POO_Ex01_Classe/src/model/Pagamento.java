package model;

import java.util.Date;

public class Pagamento extends Transacao{

	private String boleto;
	
	public Pagamento(Double valor, Date data, String boleto) {
		super(valor, data);
		this.boleto = boleto;
	}

	@Override
	public String toString() {
		
		return super.toString().replaceFirst("]", (", boleto=" + boleto + "]"));
	}
	
}
