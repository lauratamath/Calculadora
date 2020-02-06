//Laura Tamath 19365
//Walter 

public class Calculadora implements iCalculadora{
	int operando1; //Es el primer número al que se operará
	int operando2; //Segundo número a operar

	//Metodo de suma
	public int sumar(int operando1, int operando2){
		//Pre: hay dos operandos 
		return operando1 + operando2;
		//Post: los operandos se suman
	}

	//metodo de resta
	public int restar(int operando1, int operando2){
		//Pre: hay dos operandos
		return operando1 - operando2;
		//Post: los operandos se restan
	}

	//metodo de multiplicacion
	public int multiplicar(int operando1, int operando2){
		//Pre: hay dos operandos
		return operando1 * operando2;
		//Post: los operandos se multiplican
	}

	//metodo de resta
	public int dividir(int operando1, int operando2){
		//Pre: hay dos operandos
		return operando1/operando2;
		//Post: los operandos se dividen
	}
	
}