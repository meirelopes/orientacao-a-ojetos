package capitulo5.exercicio5_24;

public class Principal {
	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro carro1 = new Carro(45000d, 2012);
		Imovel casa1 = new Imovel(920000, 320);
		Barco barco1 = new Barco(50000, 2017);
		Notebook notebook1 = new Notebook(5000);
		
		corretora.fazerPropostaSeguro(notebook1);
		
	}

	}


