package capitulo5.exercicio5_13;


public class Main {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		ContaPagar conta1 = new ContaPagar("Aluguel da matriz", 1230d, "10/05/2012", imobiliaria);
		ContaPagar conta2 = new ContaPagar("Compras do mês", 390d, "19/05/2012", mercado);
		ContaPagar conta3 = new ContaPagar("Aluguel da filial", 700d, "11/05/2012", imobiliaria);
		
		conta1.pagar();
		System.out.println("*******************");		
		System.out.println("*******************");
		conta2.cancelar();
		System.out.println("*******************");		
		System.out.println("*******************");
		conta2.pagar();
		System.out.println("*******************");		
		System.out.println("*******************");
		conta3.pagar();
		System.out.println("*******************");		
		System.out.println("*******************");
		conta3.pagar();


		
	}

}
