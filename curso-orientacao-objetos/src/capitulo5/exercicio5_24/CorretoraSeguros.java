package capitulo5.exercicio5_24;

public class CorretoraSeguros {

	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("-------------------------------");
		System.out.println("Corretora de Seguros - Proposta");
		System.out.println("-------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorDaApolice());
		System.out.println("-------------------------------\n");
	}

}

