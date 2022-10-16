package capitulo5.exercicio5_13;

public class ContaPagar {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	public ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public ContaPagar(String descricao, double valor, String dataVencimento, Fornecedor fornecedor) {
		this();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}
	
	public void cancelar() {
		this.situacaoConta = SituacaoConta.CANCELADA;
		System.out.println("Conta cancelada com sucesso!");
	}
	
	public void pagar() {
		if(this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
			System.out.println("CONTA:");
			decricaoConta();
			System.out.println("A conta possui STATUS: CANCELADA e não pode ser paga.");
		} else if(this.situacaoConta.equals(SituacaoConta.PAGA)) {
			System.out.println("CONTA:");
			decricaoConta();
			System.out.println("A conta possui STATUS: PAGA e não pode ser paga.");
		} else {
		System.out.println("CONTA:");
		decricaoConta();
		System.out.println("Conta paga com sucesso!.");
		this.situacaoConta = SituacaoConta.PAGA;

	}
	}

	public void decricaoConta() {
		System.out.print("Descrição: "+getDescricao()+"\nValor: "+getValor()+"\nData de vencimento: "
				+getDataVencimento()+ "\nFornecedor: "+getFornecedor().getNome()+"\n---------------------------------------------\n");
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
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}


}
