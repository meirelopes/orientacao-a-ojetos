package pacote1;

import static pacote1.Conta.situacaoConta;

public class Conta {
	protected String descricao;
	protected double valor;
	protected String dataVencimento;
	protected Fornecedor fornecedor;
	public static SituacaoConta situacaoConta;

	public SituacaoConta getSituacaoConta(SituacaoConta PENDENTE) {
		return situacaoConta;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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
	
	
	public Conta() {
		this.situacaoConta = situacaoConta.PENDENTE;
		
	}

	public void cancelar() {
		if(situacaoConta.equals(SituacaoConta.CANCELADA)||
				situacaoConta.equals(SituacaoConta.PAGA)){
				System.out.println("Não se pode cancelar uma conta que "
						+ "já foi cancelada ou paga.");
		} else {
			System.out.println("Cancelado com sucesso!!");
			this.situacaoConta = situacaoConta.CANCELADA;
		}
	}

}
