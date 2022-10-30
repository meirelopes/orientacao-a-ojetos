package capitulo7_6.lib;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class SalvandoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("produto", Produto.class);
		xStream.aliasAttribute(Produto.class, "codigo","codigo");
		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));
		String xml = xStream.toXML(sabonete);
		System.out.println(xml);
		
		OutputStream os = new FileOutputStream("./produto2.xml");
		xStream.toXML(sabonete, os); 

	}

}
