package capitulo7_7;

import com.google.gson.Gson;

public class MainLendoJson {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		String json ="{\"nome\":\"João Silva\",\"idade\":28,\"endereco\":"
				+ "{\"rua\":\"Rua das Águas, 10\",\"cidade\":\"São Paulo\",\"estado\""
				+ ":\"SP\"},\"telefones\":[{\"tipo\":\"Residencial\",\"numero\""
				+ ":\"(11)3232-3232\"},{\"tipo\":\"Comercial\",\"numero\""
				+ ":\"(11)3233-3333\"}]}\r\n"
				+ "";
		
		Cliente cliente = gson.fromJson(json, Cliente.class);
		System.out.println("------CLIENTE-------");
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Endereço: "+cliente.getEndereco().getRua()+". "+
		cliente.getEndereco().getCidade()+" - "+cliente.getEndereco().getEstado());
		System.out.println("Telefone: "+cliente.getTelefones().get(0).getTipo()+". Número: "+cliente.getTelefones().get(0).getNumero());
		System.out.println("Telefone: "+cliente.getTelefones().get(1).getTipo()+". Número: "+cliente.getTelefones().get(1).getNumero());


	}

}
