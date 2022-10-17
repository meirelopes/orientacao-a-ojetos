package capitulo5.exercicio5_22;

public class Main {
	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		Cliente atacadista = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("FoneNet Telecomunicações");
		
		ContaPagar contaPagar1 = new ContaPagar("Aluguel da matriz", 1230d, "10/05/2012", imobiliaria);
		ContaPagar contaPagar2 = new ContaPagar("Compras do mês", 390d, "19/05/2012", mercado);
		
		ContaReceber contaReceber1 = new ContaReceber("Desenvolvimento de projeto de logística em Java", 89500d, "23/05/2012", atacadista);
		ContaReceber contaReceber2 = new ContaReceber("Manutenção em sistema de conta online", 23200d, "13/05/2012", telecom);
		
		RelatorioContas relatorioContas = new RelatorioContas();
		Conta[] contas = new Conta[] {contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		
		relatorioContas.exibirListagem(contas);
	}
}
