/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Variación de un nodo simple, difiriendo en la dirección del vector:
 * Cada nodo apunta al nodo que lo antecede (inverso a un nodo común). 
 */

public class Nodo<E>{
   //Atributos de clase
   protected E data; // Valor que se almacena en este nodo
   protected Nodo<E> prevElement; // Refiere al nodo anterior


   /**
    * @param v      valor del elemento del nodo
    * @param prev   referencia al nodo anterior
    * Se construye un nuevo nodo como la cola de la lista
    */
   public Nodo(E v, Nodo<E> prev){
       data = v;
       prevElement = prev;
   }


   /**
    * @param v   valor del elemento del nodo
    * Construye un nuevo nodo en la cabeza de la lista
    */
   public Nodo(E v){
      this(v,null);
   }


   /**
    * @return Referencia al nodo anterior
    */
   public Nodo<E> prev(){
      return prevElement;
   }


   /**
    * @param prev  El nodo en posición anterior en la lista
    * Establece el nodo que antecede a este
    */
   public void setprev(Nodo<E> prev){
      prevElement = prev;
   }


   /**
    * @return Valor del elemento de este nodo
    */
   public E value(){
      return data;
   }


   /**
    * @param value  Elemento asociado al tipo de dato de la lista
    * Asigna el valor del elemento asociado a este nodo
    */
   public void setValue(E value){
      data = value;
   }
}