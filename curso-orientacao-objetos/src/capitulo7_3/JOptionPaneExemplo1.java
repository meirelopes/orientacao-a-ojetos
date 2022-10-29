package capitulo7_3;


import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneExemplo1 {

	public static void main(String[] args) {
		
	JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
	
	JOptionPane.showMessageDialog(null, "Atenção e-mail não informado!", "ATENÇÃO",
			JOptionPane.WARNING_MESSAGE);
	
	JOptionPane.showMessageDialog(null, "CPF informado não existe!", "ERRO",
			JOptionPane.ERROR_MESSAGE);

	JOptionPane.showMessageDialog(null, "Obrigado!", "OBRIGADO",
			JOptionPane.PLAIN_MESSAGE);
	
	URL url =  capitulo7_3.JOptionPaneExemplo1.class.getResource("shield_PNG1257.png");
	Icon icone = new ImageIcon(url);
	
	JOptionPane.showMessageDialog(null, "Teste da imagem", "TESTE",
			JOptionPane.INFORMATION_MESSAGE, icone);

	

	}

}
