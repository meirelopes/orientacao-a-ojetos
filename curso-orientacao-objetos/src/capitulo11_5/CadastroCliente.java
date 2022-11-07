package capitulo11_5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(2012, Month.AUGUST, 13));
		int idade= Period.between(cliente.getDataNascimento(),
				LocalDate.now()).getYears();
		if(idade >= 18) {
		System.out.println("OK. Pode ser cadastrado.");
		} else {
			System.err.printf("Sua idade é %d. Então não pode ter cadastro no sistema.", idade);
		}
	}
	

}
