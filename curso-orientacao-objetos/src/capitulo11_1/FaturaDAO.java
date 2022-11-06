package capitulo11_1;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {
	
	public List<Fatura> buscarFaturasVencidas(){
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@joao.com", 350.0));
		faturas.add(new Fatura("maria@maria.com", 150.0));
		faturas.add(new Fatura("jose@jose.com", 190.0));
			return faturas;
	}

}
