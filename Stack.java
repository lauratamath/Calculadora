/**
 * @author Walter Saldaña
 * @author Laura Tamath
 * 
 * Interfáz de un stack para una colección de datos
 */

public interface Stack<E>{
    
    /**
     * @param item   Elemento que se agregará a la colección
     * Agrega un elemento a la cola de la colección
     */
    public void push(E item);

    /**
     * El último elemento en ser ingresado es removido de la colección
     */
    public E pop();

    /**
     * @return Último elemento de la colección
     */
    public E peek();

    /**
     * @return boolean si el stack esta vacío o no
     */
    public boolean empty();
   
    /**
     * @return Numero de elementos en el stack
     */
    public int size();
}