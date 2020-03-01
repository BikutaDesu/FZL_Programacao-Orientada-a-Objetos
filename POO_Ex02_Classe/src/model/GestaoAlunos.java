package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos {

	private int indice;
	private Aluno[] alunos;

	public GestaoAlunos() {
		indice = 0;
		alunos = new Aluno[50];
	}

	private void criar(Scanner sc) {
		long id;
		String nome;
		String ra;
		Date nascimento;

		System.out.println("Digite a ID do Aluno: ");
		id = sc.nextLong();
		System.out.println("Digite o nome do Aluno: ");
		nome = sc.next();
		System.out.println("Digite o RA do Aluno: ");
		ra = sc.next();
		System.out.println("Digite a data de nascimento do Aluno: ");
		String strNascimento = sc.next();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			nascimento = sdf.parse(strNascimento);

			Aluno aluno = new Aluno(id, nome, ra, nascimento);
			alunos[indice] = aluno;
			indice++;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void atualizar(Scanner sc) {
		System.out.println("Digite o RA do Aluno:");
		String ra = sc.next();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					System.out.println("Digite o nome do Aluno: ");
					alunos[i].setNome(sc.next());
					System.out.println("Digite a data de nascimento do Aluno: ");
					String strNascimento = sc.next();
					try {
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						alunos[i].setNascimento(sdf.parse(strNascimento));
					} catch (ParseException e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}

	private void excluir(Scanner sc) {
		System.out.println("Digite o RA do Aluno:");
		String ra = sc.next();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					alunos[i] = null;
					indice--;
				}
			}
		}
	}

	private void exibir(Scanner sc) {
		System.out.println("Digite o RA do Aluno:");
		String ra = sc.next();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].getRa().equals(ra)) {
					alunos[i].exibir();
				}
			}
		}
	}

	public void menu() {
		char opc = ' ';
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("<----------Gereciador de Alunos---------->");
			System.out.println("\tOPÇÕES:");
			System.out.println("(C)riar\n(E)xibir\n(R)emover\n(A)tualizar\n(S)air");
			System.out.println("Informe a opção desejada");
			opc = sc.next().toUpperCase().charAt(0);

			switch (opc) {
			case 'C':
				criar(sc);
				break;
			case 'E':
				exibir(sc);
				break;
			case 'R':
				excluir(sc);
				break;
			case 'A':
				atualizar(sc);
				break;
			case 'S':
				System.exit(0);
			}
		} while (true);
	}

}
