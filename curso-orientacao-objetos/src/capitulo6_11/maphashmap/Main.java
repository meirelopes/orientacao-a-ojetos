package capitulo6_11.maphashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import capitulo6_11.list.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("José");
		Aluno aluno4 = new Aluno("Pedro");

		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		
		alunos.put("1", aluno1);
		alunos.put("2", aluno2);
		alunos.put("3", aluno3);
		alunos.put("4", aluno4);
		alunos.put("5", aluno4);

		
		System.out.println("Com método imprimir Alunos:");
		imprimirAlunos(alunos);
		System.out.println("****************************");
		System.out.println("Com for:");
		
		for (Aluno a : alunos.values()) {
			System.out.println(a.getNome());
		}
		
		Aluno alunoRecuperado = alunos.get("3");
		System.out.println("Aluno de chave 3: "+ alunoRecuperado.getNome());
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for(Aluno a : alunos.values()) {
			System.out.println("Nome: "+ a.getNome());
		}
		
	}	
	}


