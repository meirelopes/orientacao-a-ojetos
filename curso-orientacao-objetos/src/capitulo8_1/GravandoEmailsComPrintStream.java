package capitulo8_1;

import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmailsComPrintStream {

	public static void main(String[] args) {
		String [] emails = {"joao@joao.com2", "maria@maria.com2", "ricardo@ricardo.com2",
				"meire@meire.com2" };
		
		try (PrintStream writer = new PrintStream("emails2.txt")) {
		for (String email : emails) {
			writer.println(email);
		}		
	} catch (IOException e){
		System.err.println("Não foi possível gravar o arquivo."+ e.getMessage());
	} 
		
	}
}
