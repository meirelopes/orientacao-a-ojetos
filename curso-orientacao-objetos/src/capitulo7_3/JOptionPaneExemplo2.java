package capitulo7_3;

import javax.swing.JOptionPane;

public class JOptionPaneExemplo2 {

	public static void main(String[] args) {
		Object[] opcoes = {"SIM", "NÃO", "Sim, com e-mail"};
 		
		int opcao = JOptionPane.showOptionDialog(null, "Você gostaria de terminar o cadastro agora?",
				"CONFIRMAÇÃO",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null,opcoes, opcoes[2]);// Se deixar null no lugar de opcoes fica "SIM", "NÃO", "CANCELAR"
		System.out.println("Opção selecionada: "+opcao);

	}

} 
