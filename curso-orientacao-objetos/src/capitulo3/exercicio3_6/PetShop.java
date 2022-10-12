package capitulo3.exercicio3_6;

public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.setNome("Bidu");
		cachorro1.setRaca("Boxer");
		cachorro1.setIdade(1);
		cachorro1.setSexo('M');
		String sexo;
		if(cachorro1.getSexo()=='M') {
			sexo = "Macho";
		} else {
			sexo = "Fêmea";
		}
		
		System.out.println("----------------------");
		System.out.println("Cachorro 1:");
		System.out.println("Nome: "+cachorro1.getNome());
		System.out.println("Idade: "+cachorro1.getIdade());
		System.out.println("Raça: "+cachorro1.getRaca());
		System.out.println("Raça: "+sexo);
	}

}
