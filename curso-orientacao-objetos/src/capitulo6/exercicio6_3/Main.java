package capitulo6.exercicio6_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de jogos: ");

		int quantidadeDeJogos = scanner.nextInt();
		for (int i = 0; i < quantidadeDeJogos; i++) {
			System.out.println("\nJogo "+(i+1)+": ");
			for (int j = 0; j < 6; j++) {
				double numeroAleatorio = Math.random() * 60;
				System.out.print(Math.round(numeroAleatorio)+"   ");
			}
		}
		scanner.close();
	}

}
