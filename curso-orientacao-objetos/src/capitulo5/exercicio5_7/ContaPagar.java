package capitulo5.exercicio5_7;

public class ContaPagar {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	public ContaPagar() {
	}

	public ContaPagar(String descricao, double valor, String dataVencimento, Fornecedor fornecedor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void pagar() {
		System.out.print("Descrição: "+getDescricao()+"\nValor: "+getValor()+"\nData de vencimento: "
				+getDataVencimento()+ "\nFornecedor: "+getFornecedor().getNome()+"\n---------------------------------------------\n");
	}
	

}
