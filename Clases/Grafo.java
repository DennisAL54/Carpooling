 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
// now we must create graph object and implement dijkstra algorithm
public class Grafo {
  private Nodo[] nodos;
  private int numeroNodos;
  private Borde[] bordes;
  private int numeroBordes;
  public Grafo(Borde[] bordes) {
    this.bordes = bordes;
    // create all nodes ready to be updated with the edges
    this.numeroNodos = calculateNoOfNodes(bordes);
    this.nodos = new Nodo[this.numeroNodos];
    for (int n = 0; n < this.numeroNodos; n++) {
      this.nodos[n] = new Nodo();
    }
    // add all the edges to the nodes, each edge added to two nodes (to and from)
    this.numeroBordes = bordes.length;
    for (int bordeAgregado = 0; bordeAgregado < this.numeroBordes; bordeAgregado++) {
      this.nodos[bordes[bordeAgregado].getDesdeIndice()].getBordes().add(bordes[bordeAgregado]);
      this.nodos[bordes[bordeAgregado].getHaciaIndice()].getBordes().add(bordes[bordeAgregado]);
    }
  }
  
  private int calculateNoOfNodes(Borde[] bordes) {
    int numeroNodos = 0;
    for (Borde e : bordes) {
      if (e.getHaciaIndice() > numeroNodos)
        numeroNodos = e.getHaciaIndice();
      if (e.getDesdeIndice() > numeroNodos)
        numeroNodos = e.getDesdeIndice();
    }
    numeroNodos++;
    return numeroNodos;
  }
  // next video to implement the Dijkstra algorithm !!!
  public void calcularDistanciaCorta() {
    // node 0 as source
    this.nodos[0].setDistanciaDesdeRaiz(0);
    int siguiente = 0;
    // visit every node
    for (int i = 0; i < this.nodos.length; i++) {
      // loop around the edges of current node
      ArrayList<Borde> bordeActual = this.nodos[siguiente].getBordes();
      for (int nodoAgregado = 0; nodoAgregado < bordeActual.size(); nodoAgregado++) {
        int indiceVecino = bordeActual.get(nodoAgregado).getIndiceVecino(siguiente);
        // only if not visited
        if (!this.nodos[indiceVecino].isVisited()) {
          int tentative = this.nodos[siguiente].getDistanciaDesdeRaiz() + bordeActual.get(nodoAgregado).getLargo();
          if (tentative < nodos[indiceVecino].getDistanciaDesdeRaiz()) {
            nodos[indiceVecino].setDistanciaDesdeRaiz(tentative);
          }
        }
      }
      // all neighbours checked so node visited
      nodos[siguiente].setVisited(true);
      // next node must be with shortest distance
      siguiente = getDistanciaCorta();
   }
  }
  // now we're going to implement this method in next part !
  private int getDistanciaCorta() {
    int current = 0;
    int distanciaGuardada = Integer.MAX_VALUE;
    for (int i = 0; i < this.nodos.length; i++) {
      int currentDistancia = this.nodos[i].getDistanciaDesdeRaiz();
      if (!this.nodos[i].isVisited() && currentDistancia < distanciaGuardada) {
        distanciaGuardada = currentDistancia;
        current = i;
      }
    }
    return current;
  }
  // display result
  public void printResultado() {
    String output = "Numero de nodos = " + this.numeroNodos;
    output += "\nNumero de bordes = " + this.numeroBordes;
    for (int i = 0; i < this.nodos.length; i++) {
      output += ("\nLa distancia más corta desde la raíz al nodo " + i + " es " + nodos[i].getDistanciaDesdeRaiz());
    }
    System.out.println(output);
  }
  public Nodo[] getNodes() {
    return nodos;
  }
  public int getNumeroNodos() {
    return numeroNodos;
  }
  public Borde[] getBordes() {
    return bordes;
  }
  public int getNumeroBordes() {
    return numeroBordes;
  }
}