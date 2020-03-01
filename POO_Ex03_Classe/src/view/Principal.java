package view;

import java.util.Scanner;

import model.Dinossauro;

public class Principal {

	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro(80, 10, 30, 80);
		Scanner scan = new Scanner(System.in);

		do {
			System.out.printf("\t<----------STATUS---------->\n");
			System.out.printf("Humor: \t\t%d\n", skeep.getHumor());
			System.out.printf("Energia: \t%d\n", skeep.getEnergia());
			System.out.printf("Velocidade: \t%d\n", skeep.getVelocidade());
			System.out.printf("Temperatura: \t%.2f\n\n", skeep.getTemperatura());

			System.out.printf("\t<----------AÇÕES---------->\n");
			System.out.printf("(P)ular \t(C)orrer \tCo(M)er\n");
			System.out.printf("(A)tirar \tTomar (S)ol \tFica na S(O)mbra\n");
			System.out.printf("Digite a letra correspondente a ação desejada: ");
			char op = scan.next().toUpperCase().charAt(0);

			switch (op) {
			case 'P':
				skeep.pular();
				break;
			case 'C':
				skeep.correr();
				break;
			case 'M':
				skeep.comer();
				break;
			case 'A':
				skeep.atirar();
				break;
			case 'S':
				skeep.tomarSol();
				break;
			case 'O':
				skeep.ficarNaSombra();
				break;
			default:
				System.out.println("Digite uma opção válida!");
			}
		} while (true);
	}

}
