package capitulo5.exercicio5_22;

public class ContaReceber extends Conta {
	
	private Cliente cliente;
	
	public ContaReceber(String descricao, double valor, 
			String dataVencimento,Cliente cliente) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.cliente = cliente;
		
	}
	
	public void receber() {
		System.out.println("CONTA:");
		exibirDetalhes();
		System.out.println("Conta recebida com sucesso");
	}
	
	public void cancelar() {
		if(this.valor>=50000) {
			System.out.println("Não é possível cancelar a conta. Valor acima de R$50.000,00");
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
	
	@Override
	public void exibirDetalhes() {
		System.out.print("Descrição: "+getDescricao()+"\nValor: "+getValor()+"\nData de vencimento: "
				+getDataVencimento()+ "\nCliente: "+getCliente().getNome()+"\nSituação da conta: "+this.getSituacaoConta()+"\n---------------------------------------------\n");
		
	}


}
