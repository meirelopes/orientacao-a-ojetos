package capitulo6.exercicio6_5;


public class Conta {
	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() throws OperacaoContaException{
		if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			this.decricaoConta();
			throw new OperacaoContaException("Não é possível cancelar uma conta que já está cancelada.");
		} else {
		this.situacaoConta = SituacaoConta.CANCELADA;
		this.decricaoConta();
		System.out.println("Conta cancelada com sucesso!");
	}
	}
	
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void decricaoConta() {
		System.out.print("\nCONTA:\nDescrição: "+getDescricao()+"\nValor: "+getValor()+"\nData de vencimento: "
				+getDataVencimento()+"\n");
	}

	

}
