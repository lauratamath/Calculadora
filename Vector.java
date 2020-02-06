/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Clase que modela un stack vectorial de elementos.
 * Se vincula al último nodo de la colección. 
 */

public class Vector<E> implements Stack<E>{
    //Atributos de clase
    private int n; //Numero de elementos en la colección
    private Nodo<E> tail; //Último nodo de la colección

    /**
     * Método constructor
     * Se inicia el tamaño de la colección en 0
     */
    public Vector(){
        this.n = 0;
    }

    /**
     * @param item   Elemento que se agregará a la colección
     * Agrega un elemento a la cola de la colección
     */
    public void push(E item){
        Nodo<E> nodo =  new Nodo<E>(item);
        if(!empty()){ //Si ya hay elementos previos en la colección referenciarlo
            Nodo<E> prevTail = getTail();
            nodo.setPrev(prevTail);
        }
        setTail(nodo);
        setN(getN()+1);
    }

    /**
     * El último elemento en ser ingresado es removido de la colección
     */
    public E pop(){
        Nodo<E> oldTail = this.getTail();
        Nodo<E> newTail = new Nodo<E>(null);
        if(this.empty()){
            return null
        }else{
            newTail = oldTail.prev();
            this.setTail(newTail);
            if(this.getN()>0){this.setN(this.getN()-1);}
            return oldTail.value();
        }
    }

    /**
     * @return Último elemento de la colección
     */
    public E peek(){
        return this.getTail().value();
    }

    /**
     * @return boolean si el stack esta vacío o no
     */
    public boolean empty(){
        if(this.getN()==0){
            return true;
        }else{
            return false;
        }
    }
   
    /**
     * @return Numero de elementos en el stack
     */
    public int size(){
        return this.getN();
    }



    //Setters y getters
    public void setN(int n){
        this.n = n;
    }

    public void setTail(Nodo<E> tail){
        this.tail = tail;
    }

    public int getN(){
        return this.n;
    }

    public Nodo<E> getTail(){
        return this.tail;
    }

    //Método toString
    public String toString(){
        String values = "";
        Nodo<E> nodo = getTail();
        for(int i=0; i<getN(); i++){
            values+=String.valueOf(nodo.value())+", ";
            nodo = nodo.prev();
        }
        //Retorna los elementos en formto:
        // [a, b, c, ... n]
        return "["+values.substring(0,values.length()-2)+"]";
    }
}