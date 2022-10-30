package capitulo7_9;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João Silva", 3000);
		Funcionario funcionario2 = new Funcionario(null);
		System.out.println(funcionario.adiantamentoViagem(5, true));
		
	}

}
