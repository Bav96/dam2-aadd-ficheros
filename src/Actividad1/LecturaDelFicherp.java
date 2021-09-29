/**
 * 
 */
package Actividad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Borja
 *
 */
public class LecturaDelFicherp {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		   
		try (//Abro el stream, el fichero debe existir
		FileReader fr = new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\infoinstitutodam2.json ")) {
			//Leemos el fichero y lo mostramos por pantalla
			int valor=fr.read();
			while(valor!=-1){
			    System.out.print((char)valor);
			    valor=fr.read();
			}
		}
        
	}

}
