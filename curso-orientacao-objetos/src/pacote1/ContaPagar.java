package pacote1;

public class ContaPagar extends Conta {
	
	public ContaPagar() {
		
	}
	public ContaPagar( Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}


	public void pagar() {
		if(situacaoConta.equals(SituacaoConta.PENDENTE)){
			System.out.println("Descrição da conta: "+ descricao);
			System.out.println("Valor: "+ valor);
			System.out.println("Data de vencimento: "+ dataVencimento);
			System.out.println("Fornecedor: "+fornecedor.getNome());
			System.out.println("----------------------------------------");
			this.situacaoConta = situacaoConta.PAGA;

		} else {
			System.out.println("ERRO: Conta paga ou cancelada!");
		}
		

	}
	
	
}
