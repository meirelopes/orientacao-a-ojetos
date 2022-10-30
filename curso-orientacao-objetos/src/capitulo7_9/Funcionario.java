package capitulo7_9;

/**
 * 
 * Representa um funcionário da empresa...
 * 
 * @author Jucemeire Lopes
 *
 */
public class Funcionario {
	
	private String nome;
	private double salario;
	
	
	/**
	 * 
	 * Não utilize mais, pois o salário é entrada obrigatória.
	 * 
	 * @deprecated
	 * 
	 * @param nome
	 */
	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Calcula o adiantamento em dinheiro que deverá ser pago ao funcionário.
	 * 
	 * <p>O valor da diária é calculada dividindo-se o <b>salário base por 30</b>(dias do mês)</p>
	 * 
	 * Caso o destino seja uma capital, é adicionado 20% no valor do adinatamento.
	 * 
	 * @param dias
	 * 
	 *        Quantidade de dias da viagem
	 * 
	 * @param capital
	 * 
	 *        Indica se é ou não uma capital brasileira
	 * 
	 * @return O valor em reais do adiantamento
	 * 
	 * @since 1.1.0
	 * 
	 * @throws IllegalArgumentException
	 *  	   Caso {@code dias} for menor ou igual a zero
	 *  
	 *  @see Viagem
	 */
	
	public double adiantamentoViagem(int dias, boolean capital) {
		if(dias<=0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero");
		}
		double valorDiaria = salario/30;
		double valorAdiantamento = valorDiaria*dias;
		if(capital) {
			valorAdiantamento*=1.2;
		}
		return valorAdiantamento;
	}

}
