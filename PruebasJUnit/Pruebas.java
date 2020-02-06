import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Laura 
 * @author Walter 
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Prubas {

	@Test
	public void testSuma() {
		Calculadora test1 = new Calculadora();
		
		int operando1 = 10;
		int operando2 = 15;
		
		int resultado = test1.sumar(operando2, operando1); 
		
		assertEquals(25, resultado);
	}

	@Test
	public void testResta(){
		Calculadora test1 = new Calculadora();
		int resultado = cal.resta(5,1);
		int esperado = 4; // 5 - 1 = 4
		assertEquals(esperado, resultado);
	}


	@Test
	public void test(){
		Stack<Integer> vector = new Vector<Integer>();
		stack.push(5);
		stack.push(6);
		stack.push(13);

		int res = stack.peek();
		assertEquals(13, res);
	}
}
