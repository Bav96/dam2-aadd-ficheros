/**
 * 
 */
package Actividad1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Borja
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		  try{
	            // crea el fichero si no existe
	            FileWriter fw=new FileWriter("C:\\xampp\\htdocs\\aadd\\recursos\\info-alumnos.txt ");
	           
	            
	            //Escribimos en el fichero un String y un caracter 
	            fw.write("NOMBRE, APELLIDOS, CURSO  \n");
	           AñadirInformacion(fw);
	            //Cierro el stream
	            fw.close(); 
	           
	                //Abro el stream, el fichero debe existir
	            FileReader fr=new FileReader("C:\\xampp\\htdocs\\aadd\\recursos\\info-alumnos.txt ");
	            //Leemos el fichero y lo mostramos por pantalla
	            int valor=fr.read();
	            while(valor!=-1){
	                System.out.print((char)valor);
	                valor=fr.read();
	            }
	            
	        }catch(IOException e){
	            System.out.println("Error E/S: "+e);
	
	        }
		 
	
		  		
		  
	}
			public static void AñadirInformacion (FileWriter fw) throws IOException{
				
				try {
					
		           
		            
		            //Escribimos en el fichero un String y un caracter 
		            fw.write("Borja,Argibay Vázquez,DAM2  \n");
		            
		            
				
				}catch(IOException e){
		            System.out.println("Error E/S: "+e);
		        	
		       
		        }
				
	    }
	

	
		
}
