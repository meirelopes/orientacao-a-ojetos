package capitulo8_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmailsComBufferedWriter {

	public static void main(String[] args) {
		String [] emails = {"joao@joao.com2", "maria@maria.com2", "ricardo@ricardo.com2",
				"meire@meire.com2" };

		/* Antes do java 7
		BufferedWriter writer = null;
		try {
		writer = new BufferedWriter(new FileWriter("emails.txt"));
		for (String email : emails) {
			writer.write(email);
			writer.newLine();
		}		
	} catch (IOException e){
		System.err.println("Não foi possível gravar o arquivo."+ e.getMessage());
	} finally {
		try {
			writer.close();
		} catch (IOException e) {
		}
	}
		*/ 
		//Depois do java 7
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) {
		for (String email : emails) {
			writer.write(email);
			writer.newLine();
		}		
	} catch (IOException e){
		System.err.println("Não foi possível gravar o arquivo."+ e.getMessage());
	} 
		
	}
}
