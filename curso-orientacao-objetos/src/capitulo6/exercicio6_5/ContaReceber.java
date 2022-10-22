package capitulo6.exercicio6_5;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber(String descricao, double valor, 
			String dataVencimento,Cliente cliente) {
		this.setDescricao(descricao);
	    this.setValor(valor);
		this.setDataVencimento(dataVencimento);
		this.cliente = cliente;
		
	}
	
	
	public void receber() throws OperacaoContaException{
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			this.decricaoConta();
			throw new OperacaoContaException("Não pode receber uma conta que já está paga.");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			this.decricaoConta();
			throw new OperacaoContaException("Não pode receber uma conta que está cancelada.");
		} else {
			this.decricaoConta();
			System.out.println("Conta recebida com sucesso!");
			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

		@Override
	public void cancelar() throws OperacaoContaException {
		if(this.getValor()>=50000) {
			this.decricaoConta();
			throw new OperacaoContaException("Não é possível cancelar a conta. Valor acima de R$50.000,00");
		} else {
			super.cancelar();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void decricaoConta() {
		super.decricaoConta();
		System.out.println("Cliente: "+getCliente().getNome()+"\n---------------------------------------------");
	}


}
