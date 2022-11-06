package capitulo11_1;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
		
		/*for (Fatura f : faturasVencidas) {
			enviadorDeEmail.enviar( f.getEmailDevedor(), f.resumo());
		}
*/
		// Lambda;
		faturasVencidas.forEach(f -> enviadorDeEmail.enviar( f.getEmailDevedor(), f.resumo()));

	}

}
