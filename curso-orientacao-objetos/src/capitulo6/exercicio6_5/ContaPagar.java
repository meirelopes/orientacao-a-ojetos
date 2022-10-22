package capitulo6.exercicio6_5;


public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		
	}
	
	public ContaPagar(String descricao, Double valor, 
			String dataVencimento,Fornecedor fornecedor) {
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
		this.fornecedor = fornecedor;
		
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
	public void pagar() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			decricaoConta();
			throw new OperacaoContaException("Não pode pagar uma conta que já está paga.");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			decricaoConta();
			throw new OperacaoContaException("Não pode pagar uma conta que está cancelada.");
		} else {
			decricaoConta();
			System.out.println("Conta paga com sucesso!");
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void decricaoConta() {
		super.decricaoConta();
		System.out.println("Fornecedor: "+getFornecedor().getNome()+"\n---------------------------------------------");
	}


	

}
