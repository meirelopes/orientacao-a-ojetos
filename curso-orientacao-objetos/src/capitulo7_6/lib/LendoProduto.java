package capitulo7_6.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

public class LendoProduto {
	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo","codigo");
		
		Produto p = (Produto) xstream.fromXML(new FileInputStream("./produto2.xml"));
        XStream.setupDefaultSecurity(xstream); 
        xstream.allowTypes(new Class[]{Produto.class, LendoProduto.class}); 

        xstream.addPermission(NoTypePermission.NONE);
     // allow some basics
     xstream.addPermission(NullPermission.NULL);
     xstream.addPermission(PrimitiveTypePermission.PRIMITIVES);
     xstream.allowTypeHierarchy(Collection.class);
     // allow any type from the same package
     xstream.allowTypesByWildcard(new String[] {
         "capitulo7_6.lib"
     });
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());
		

}
}
