/**
 * 
 */
package Actividad1;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * @author Borja
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	        //Elemento raíz
	        Document doc = docBuilder.newDocument();
	        Element rootElement = doc.createElement("alumnos");
	        doc.appendChild(rootElement);
	        //Primer elemento
	        Element elemento1 = doc.createElement("alumno");
	        rootElement.appendChild("alumno");
	        //Se agrega un atributo al nodo elemento y su valor
	        Attr attr = doc.createAttribute("Nie");
	        attr.setValue("aaaa");
	        elemento1.setAttributeNode(attr);
	        Element elemento2 = doc.createElement("nombre");
	        elemento2.setTextConten("BBB"));
	        Element elemento3 = doc.createElement("Apellido1");
	        elemento2.setTextConten("BBB"));
	        Element elemento4 = doc.createElement("Apellido2");
	        elemento2.setTextConten("ccc"));
	        Element elemento5 = doc.createElement("email");
	        elemento2.setTextConten("eee"));
	        rootElement.appendChild(elemento2);
	        //Se escribe el contenido del XML en un archivo
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        DOMSource source = new DOMSource(doc);
	        StreamResult result = new StreamResult(new File("/ruta/prueba.xml"));
	        transformer.transform(source, result);
	      } catch (ParserConfigurationException pce) {
	        pce.printStackTrace();
	      } catch (TransformerException tfe) {
	        tfe.printStackTrace();
	      }
    
	    }

}
