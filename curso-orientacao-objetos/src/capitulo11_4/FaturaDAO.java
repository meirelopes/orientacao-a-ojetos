package capitulo11_4;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {
	
	public List<Fatura> buscarFaturas(){
		
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@joao.com", 350.00));
		faturas.add(new Fatura("maria@maria.com", 150.00));
		faturas.add(new Fatura("jose@jose.com", 290.00));
		return faturas;

		
	}

}
