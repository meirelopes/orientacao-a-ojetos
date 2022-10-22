package capitulo6.exercicio6_5;

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
		
		ContaReceber contaReceber1 = new ContaReceber("Desenvolvimento de projeto de logística em Java", 39500d, "23/05/2012", atacadista);
		ContaReceber contaReceber2 = new ContaReceber("Manutenção em sistema de conta online", 23200d, "13/05/2012", telecom);
		
		try {
		contaPagar1.pagar();
		
		} catch (OperacaoContaException e) {
			e.getMessage();
			e.printStackTrace();
		}
		

		try {
		contaReceber1.receber();
		contaReceber1.cancelar();
		System.out.println("*****************************");
		} catch (OperacaoContaException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		try {
		contaReceber1.cancelar();
		System.out.println("*****************************");
		} catch (OperacaoContaException e) {
			e.getMessage();
			e.printStackTrace();
		}


	}
}
