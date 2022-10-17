package capitulo5.exercicio5_24;

public class Carro implements Seguravel{
	
	private double valorMercado;
	private int anoFabricacao;
	

	public Carro(double valorMercado, int anoFabricacao) {
		super();
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	
	@Override
	public double calcularValorDaApolice() {
		double valorDaApolice = 0.84*this.valorMercado;
		if(this.anoFabricacao<2000) {
			valorDaApolice = valorDaApolice*0.90;
		}
		return valorDaApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro ano: "+this.anoFabricacao
		+"\nValor de mercado: "+this.valorMercado;
	}

}
