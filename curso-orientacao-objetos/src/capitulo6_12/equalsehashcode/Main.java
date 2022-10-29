package capitulo6_12.equalsehashcode;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Aluno> alunos = new SimuladorDeBancoDeDados().buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Maria");
		
		// Usa equals para comparação
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns "+alunoSorteado.getNome()+", você ganhou um brinde!");
		} else {
			System.out.println("Aluno não cadastrado no banco de dados!");
		}
		
		
		System.out.println("*************************************");
		
		 for (Aluno a : alunos) {
			 
			 System.out.println(a.getNome());
			
		}
	}

}
