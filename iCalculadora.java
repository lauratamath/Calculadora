/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Intefaz que posee las operaciones que esta calculadora puede ejecutar
 * Se vincula al último nodo de la colección. 
 */
public interface iCalculadora{
	public int sumar(int operando2,int operando1);
		//pre: hay dos operandos
		/**
		 * @param operando2		Primer numero a sumar
		 * @param operando1     Segundo numero a sumar
		 * @return entero 		La suma de dos enteros
		 */

	public int restar(int operando2,int operando1);
		//pre: hay dos operandos
		/**
		 * @param operando2		Primer numero a restar
		 * @param operando1     Segundo numero a restar
		 * @return entero 		La resta de dos enteros
		 */

	public int multiplicar(int operando2,int operando1); 
		//pre: hay dos operandos
		/**
		 * @param operando2		Primer numero a multiplicar
		 * @param operando1     Segundo numero a multiplicar
		 * @return entero 		La multiplicacion de dos enteros
		 */
	public int dividir(int operando2,int operando1);
		//pre: hay dos operandos
		/**
		 * @param operando2		Primer numero a dividir
		 * @param operando1     Segundo numero a dividir
		 * @return entero 		La division de dos enteros
	*/
	
}
