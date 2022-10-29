package capitulo7_3;

import javax.swing.JOptionPane;

public class JOptionPaneExemplo3 {

	public static void main(String[] args) {
		Object[] possibilidades = {"Masculino", "Feminino"};
		String sexo = (String)JOptionPane.showInputDialog(null,"Selecione sexo", "Algaworks", JOptionPane.PLAIN_MESSAGE,
				null, possibilidades, possibilidades[0]);
		System.out.println("Sexo selecionado: "+sexo);

		String nome = (String)JOptionPane.showInputDialog(null,"Digite seu nome: ", "Algaworks", JOptionPane.PLAIN_MESSAGE,
				null, null, null);
		System.out.println("Nome informado: "+nome);


	}

}
