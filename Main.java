/**
 * @author Walter Saldaña #19897
 * @author Laura Tamath   #19365
 * 
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Sección 20
 * 
 * Programa que realiza cálculos en formato Postfix.
 * Se ingresa un documento de texto txt con una operación Postfix 
 * y se retorna el resultado numérico.
 */

//Importación de clases
import java.util.Scanner; //Leer la entrada de texto
import java.io.File; //Representa un archivo 
import java.io.FileNotFoundException; //Intento fallido al abrir un archivo


public class Main{
    public static void main(String[] args){
    	iCalculadora calcu = new Calculdora();
    	Stack<Integer> vector = new Vector<Integer>;
    	Scanner sc = new Scanner(System.in); 

    	String [] operaciones; //Operaciones establecidas en el txt
        String datos = "" //Lo que se encuentre en el txt se establecera en esta.
        int operando1, operando2, num;
        int result=0;

        //Apertura del archivo con defensa
        try{
        	Scanner ver = new Scanner(new File("datos.txt"));//Leer el archivo
        	datos += ver.nextLine();
        	ver.close();
        } catch(FileNotFoundException e){//Si el archivo txt no se encuentra
        	e.printStackTrace();
        }operaciones= datos.split(" ");

    }
}