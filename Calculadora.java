/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Intefaz que posee las operaciones que esta calculadora puede ejecutar
 * Se vincula al último nodo de la colección. 
 */

public class Calculadora implements iCalculadora{
	//int operando1; //Es el primer número al que se operará
	//int operando2; //Segundo número a operar

	/**
	 * @param operando1		Segundo numero a sumar
	 * @param operando2     Primer numero a sumar
	 * @return Valor de la suma
	 * Método de suma
	*/
	public int sumar(int operando1, int operando2){
		//Pre: hay dos operandos 
		return operando1 + operando2;
		//Post: los operandos se suman
	}

	/**
	 * @param operando1		Segundo numero a restar
	 * @param operando2     Primer numero a restar
	 * @return Valor de la resta
	 * Método de resta aritmética
	*/
	public int restar(int operando1, int operando2){
		//Pre: hay dos operandos
		return operando1 - operando2;
		//Post: los operandos se restan
	}

	/**
	 * @param operando1		Segundo numero a multiplicar
	 * @param operando2     Primer numero a multiplicar
	 * @return Valor de la multiplicación
	 * Método de multiplicación
	*/
	public int multiplicar(int operando1, int operando2){
		//Pre: hay dos operandos
		return operando1 * operando2;
		//Post: los operandos se multiplican
	}

	/**
	 * @param operando1		Segundo numero a dividir
	 * @param operando2     Primer numero a dividir
	 * @return Valor de la división
	 * Método de división
	*/
	public int dividir(int operando1, int operando2){
		//Pre: hay dos operandos
		try {
			return operando1/operando2;
		} catch (Exception e) {
			return 0; //Para divisiones entre cero
		}
		//Post: los operandos se dividen
	}
	
}