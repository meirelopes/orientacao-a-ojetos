package capitulo7_7;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class MainGerandoJson {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua das Águas, 10", "São Paulo", "SP");
		Telefone telefone1 = new Telefone("Residencial", "(11)3232-3232");
		Telefone telefone2 = new Telefone("Comercial", "(11)3233-3333");
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(telefone1);
		telefones.add(telefone2);

		Cliente cliente1 = new Cliente("João Silva", 28, endereco1, telefones);
		
		Gson gson =new Gson();
		String json = gson.toJson(cliente1);
		System.out.println(json);

	}
	

}
