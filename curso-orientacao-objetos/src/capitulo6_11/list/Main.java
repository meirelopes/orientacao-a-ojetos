package capitulo6_11.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("José");
		Aluno aluno4 = new Aluno("Pedro");

		
		List <Aluno> alunos = new ArrayList();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		
		System.out.println("Com método imprimir Alunos:");
		imprimirAlunos(alunos);
		System.out.println("****************************");
		System.out.println("Com for:");
		
		for (Aluno a : alunos) {
			System.out.println(a.getNome());
		}
		
		System.out.println(alunos.get(0).getNome());
	
		}
	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println(a.getNome());
		}
	}

}
