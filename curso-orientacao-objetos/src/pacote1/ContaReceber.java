package pacote1;

public class ContaReceber extends Conta {
	private Cliente cliente;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ContaReceber() {
		
	}
	public ContaReceber(Cliente cliente, String descricao, 
			double valor, String dataDeVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.dataVencimento = dataDeVencimento;
		this.valor = valor;
	}
		public void cancelar() {
			if(this.getValor()>50000d) {
				super.cancelar();
				} else {
					System.out.println("Conta abaixo do valor permitido");
				}
		}
		
		public void receber() {
			System.out.println("------------------------");
			System.out.println("Conta: " + this.getDescricao());
			System.out.println("Valor: " + this.getValor());
			System.out.println("Data de Vencimento: " + this.getDataVencimento());
			System.out.println("Fornecedor: " + this.getCliente().getNome());
			System.out.println("Status: RECEBIDA");
			System.out.println("------------------------");
		}
	

}
