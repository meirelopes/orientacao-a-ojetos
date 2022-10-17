package capitulo5.exercicio5_22;

import capitulo5.exercicio5_13.SituacaoConta;

public abstract class Conta {
	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	public abstract void exibirDetalhes();
	
	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() {
		this.situacaoConta = SituacaoConta.CANCELADA;
		System.out.println("Conta cancelada com sucesso!");
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
	
	

}
