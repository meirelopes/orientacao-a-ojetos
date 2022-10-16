package capitulo4.exercicio4_5;

import java.util.Scanner;

public class MainExercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Quantos produtos?");
		int quantidadeProdutos = scanner.nextInt();
		scanner.nextLine();

		Estoque estoque = new Estoque();
		estoque.produtos= new Produto[quantidadeProdutos];
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\nProduto " + i);
			System.out.println("------------------------");
			
			System.out.println("Descrição:");
			estoque.produtos[i].descricao = scanner.nextLine();
			
			System.out.println("Quantidade de itens:");			
			estoque.produtos[i].quantidade = scanner.nextInt();
			scanner.nextLine();

		}
		scanner.close();	
		estoque.listarProdutos();
		}	
}