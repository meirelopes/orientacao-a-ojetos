package capitulo5.exercicio5_22;


public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar(String descricao, double valor, 
			String dataVencimento,Fornecedor fornecedor) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
		
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	

	public void pagar() {
		if(this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
			System.out.println("CONTA:");
			exibirDetalhes();
			System.out.println("A conta possui STATUS: CANCELADA e não pode ser paga.");
		} else if(this.situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println("CONTA:");
			exibirDetalhes();
			System.out.println("A conta possui STATUS: PAGA e não pode ser paga.");
		} else {
			System.out.println("CONTA:");
			exibirDetalhes();
			System.out.println("Conta paga com sucesso!.");
			this.situacaoConta = situacaoConta.PAGA;
	}
	}

	@Override
	public void exibirDetalhes() {
		System.out.print("Descrição: "+getDescricao()+"\nValor: "+getValor()+"\nData de vencimento: "
				+getDataVencimento()+ "\nFornecedor: "+getFornecedor().getNome()+"\nSituação da conta: "+this.getSituacaoConta()+"\n---------------------------------------------\n");

		
	}


	

}
