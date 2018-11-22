package Estructuras;

import Usuarios.*;

/**
 * Representacion de una Lista
 *
 * @author Rubén Salas
 * @version 1.0
 *
 */
public class Lista {

    private Estudiante head;
    private int size;

    /**
     * Constructor de Lista.
     */
    public Lista(){
        this.head = null;
        this.size = 0;
    }

    //Métodos setters y getters

    public Estudiante getHead() {
        return head;
    }

    public void setHead(Estudiante head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Consulta si la lista está vacía.
     * @return true si el primer Estudiante (head), no apunta a otro Estudiante.
     */
    public boolean itsEmpty(){
        return this.head == null;
    }

    /**
     * Agrega una nueva Line al final de la lista.
     * @param newLine - nueva Line por ingresar en lista
     */
    public void add(Estudiante newLine){
        if (this.itsEmpty()) { //Verifica que la lista esté vacia
            this.setHead(newLine); //Agrega como head a newFila
        }
        else { //Recorre la lista hasta llegar a la última Fila
            Estudiante temp = this.getHead(); //Crea una Fila temporal para referencia
            while(temp.getNext() != null){ //Recorre la lista hasta llegar a la ultima Fila
                temp = temp.getNext();
            }
            temp.setNext(newLine); //Agrega a newLine al final de la lista
        }
        this.setSize(this.getSize()+1);
    }


}