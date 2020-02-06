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

public class Main{
    public static void main(String[] args){
        PostfixCalculator pc = new PostfixCalculator("6 2 3 + *");
        System.out.println(String.valueOf(pc.calcular()));
    }
}