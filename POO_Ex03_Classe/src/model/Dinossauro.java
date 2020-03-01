package model;

public class Dinossauro {

	private int energia;
	private int velocidade;
	private float temperatura;
	private int humor;

	public Dinossauro(int energia, int velocidade, float temperatura, int humor) {
		super();
		this.energia = energia;
		this.velocidade = velocidade;
		this.temperatura = temperatura;
		this.humor = humor;
	}

	public void pular() {
		setHumor(getHumor() + 6);
		setEnergia(getEnergia() - 6);
	}

	public void correr() {
		if (getVelocidade() > 0) {
			setVelocidade(getVelocidade() - 10);
			setEnergia(getEnergia() - 12);
			setHumor(getHumor() + 12);
		} else {
			System.out.println("O dinossauro precisa tomar Sol para ter velocidade");
		}

	}

	public void comer() {
		setEnergia(getEnergia() + 10);
		setHumor(getHumor() + 5);
	}

	public void atirar() {
		setHumor(getHumor() + 10);
		setEnergia(getEnergia() - 10);
	}

	public void tomarSol() {
		setTemperatura(getTemperatura() + (float)Math.random() * 4f);
		setHumor(getHumor() + 6);
		setVelocidade(getVelocidade() + 5);
	}

	public void ficarNaSombra() {
		setTemperatura(getTemperatura() - (float)Math.random() * 6f);
		setEnergia(getEnergia() + 8);
		setHumor(getHumor() - 10);
	}

	private void setEnergia(int energia) {
		this.energia = energia;
		if (this.energia <= 0) {
			this.energia = 0;
			System.out.println("\nO dinossauro ficou tão cansado que morreu. :c\n");
			System.exit(0);
		} else if (this.energia >= 100) {
			this.energia = 100;
			System.out.println("\nO dinossauro está cheio de energia!!\n");
		}
	}

	private void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
		if (this.velocidade <= 0) {
			this.velocidade = 0;
		} else if (this.velocidade >= 20) {
			this.velocidade = 20;
			System.out.println("\nO dinossauro está a todo vapor!!\n");
		}
	}

	private void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
		if (this.temperatura >= 50) {
			this.temperatura = 50;
			System.out.println(
					"\nO dinossauro ficou tão quente que acabou morrendo, pelo menos agora você tem dinossauro assado para a janta!!\n");
			System.exit(0);
		} else if (this.temperatura <= -10) {
			this.temperatura = -10;
			System.out.println("\nO dinossauro morreu de frio!! :c\n");
			System.exit(0);
		}
	}

	private void setHumor(int humor) {
		this.humor = humor;
		if (this.humor >= 100) {
			this.humor = 100;
			System.out.println("\nO dinossauro está super feliz!!\n");
		} else if (this.humor <= 0) {
			this.humor = 0;
			System.out.println("\nO dinossauro ficou triste demais e cometeu suicídio. :c\n");
			System.exit(0);
		}
	}

	public int getVelocidade() {
		return velocidade;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public int getHumor() {
		return humor;
	}

	public int getEnergia() {
		return energia;
	}

}
