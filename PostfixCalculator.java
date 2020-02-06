/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Clase que realiza operaciones tipo postfix
 */

public class PostfixCalculator{
    //Atributos de clase
    private Vector<Integer> vector;
    private String postfix;

    /**
     * Método constructor
     * Inicializa los atributos
     * @param postfix  Operación postfix a realizar
     */
    public PostfixCalculator(String postfix){
        this.vector = new Vector<Integer>();
        this.postfix = postfix;
    }

    /**
     * Método constructor sobrecargado
     * sin parámetros
     */
    public PostfixCalculator(){
        this.vector = new Vector<Integer>();
    }

    /**
     * Método que realiza la operación postfix
     */
    public int calcular(){
        Calculadora calculadora = new Calculadora();
        String[] valores = this.getPostfix().split(" ");
        for(int i=0; i<valores.length; i++){
            if(valores[i].equals("+") || valores[i].equals("-") || valores[i].equals("*") || valores[i].equals("/")){
                int a = vector.pop();
                int b = vector.pop();
                int c = 0;
                switch (valores[i]) {
                    case "+":
                        c = calculadora.sumar(a,b);
                        break;
                    case "-":
                        c = calculadora.restar(a,b);
                        break;
                    case "*":
                        c = calculadora.multiplicar(a,b);
                        break;
                    case "/":
                        c = calculadora.dividir(a,b);
                        break;
                    default:
                        break;
                }
                vector.push(c);
            }else{
                vector.push(Integer.parseInt(valores[i]));
            }
        }
        return vector.peek();
    }

    //Setters y getters
    public void setPostfix(String postfix){
        this.postfix = postfix;
    }

    public void setVector(Vector<Integer> vector){
        this.vector = vector;
    }

    public String getPostfix(){
        return this.postfix;
    }

    public Vector<Integer> getVector(){
        return this.vector;
    }

    //Método toString
    public String toString(){
        return "Postfix: "+this.getPostfix()+", Vector: "+this.getVector().toString();
    }
}