package capitulo5.exercicio5_22;

public class RelatorioContas {
	
	public void exibirListagem(Conta[] contas) {
		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
		
	}

}
