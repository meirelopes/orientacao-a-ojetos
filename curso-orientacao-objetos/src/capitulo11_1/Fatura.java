package capitulo11_1;

public class Fatura {
	
	private String emailDevedor;
	private double valor;
	
	public Fatura(String emailDevedor, double valor) {
		super();
		this.emailDevedor = emailDevedor;
		this.valor = valor;
	}
	public String getEmailDevedor() {
		return emailDevedor;
	}
	public void setEmailDevedor(String emailDevedor) {
		this.emailDevedor = emailDevedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String resumo() {
		return ("Valor devido: "+ this.valor);
	}
	
	

}
