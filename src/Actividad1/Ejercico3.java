/**
 * 
 */
package Actividad1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Borja
 *
 */
public class Ejercico3 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

	
			int c;
			try {
				FileReader in = new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\info-alumnos.txt");
				FileWriter out = new FileWriter("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt ");
				while( (c = in.read()) != -1) {
					out.write(c);
				}
				in.close();
				out.close();
				} catch(FileNotFoundException e1) {
				System.err.println("Error: No se encuentra el fichero");
				} catch(IOException e2) {
				System.err.println("Error leyendo/escribiendo fichero"); 
		
		}
			try (//Abro el stream, el fichero debe existir
					FileReader fr = new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\alumnos-dam2-nuevos.txt ")) {
						//Leemos el fichero y lo mostramos por pantalla
						int valor=fr.read();
						while(valor!=-1){
						    System.out.print((char)valor);
						    valor=fr.read();
						}
					}
	}

}
