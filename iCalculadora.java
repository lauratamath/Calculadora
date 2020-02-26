/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Intefaz que posee las operaciones que esta calculadora puede ejecutar
 * Se vincula al último nodo de la colección. 
 */
public interface iCalculadora{

	/**
	 * @param operando1		Segundo numero a sumar
	 * @param operando2     Primer numero a sumar
	 * @return Valor de la suma
	 * Método de suma
	*/
	public int sumar(int operando2,int operando1);
		

	/**
	 * @param operando1		Segundo numero a restar
	 * @param operando2     Primer numero a restar
	 * @return Valor de la resta
	 * Método de resta aritmética
	*/
	public int restar(int operando2,int operando1);

	/**
	 * @param operando1		Segundo numero a multiplicar
	 * @param operando2     Primer numero a multiplicar
	 * @return Valor de la multiplicación
	 * Método de multiplicación
	*/
	public int multiplicar(int operando2,int operando1); 
		//pre: hay dos operandos

	/**
	 * @param operando1		Segundo numero a dividir
	 * @param operando2     Primer numero a dividir
	 * @return Valor de la división
	 * Método de división
	*/
	public int dividir(int operando2,int operando1);
		//pre: hay dos operandos
	
}
