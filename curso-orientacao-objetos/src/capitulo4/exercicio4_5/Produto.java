package capitulo4.exercicio4_5;

public class Produto {
	String descricao;
	int quantidade;
	
	public void descrever() {
		System.out.println("ESTOQUE:");
		System.out.println("Descrição do produto: "+descricao);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("----------------------------------");
	}

}
