
package javaapplication4;

import java.util.ArrayList;



public class Nodo {
  private int distanciaDesdeRaiz = Integer.MAX_VALUE;
  private boolean visitado;
  private ArrayList<Borde> bordes = new ArrayList<Borde>(); // now we must create edges
  public int getDistanciaDesdeRaiz() {
    return distanciaDesdeRaiz;
  }
  public void setDistanciaDesdeRaiz(int distanciaDesdeRaiz) {
    this.distanciaDesdeRaiz = distanciaDesdeRaiz;
  }
  public boolean isVisited() {
    return visitado;
  }
  public void setVisited(boolean visitado) {
    this.visitado = visitado;
  }
  public ArrayList<Borde> getBordes() {
    return bordes;
  }
  public void setBordes(ArrayList<Borde> bordes) {
    this.bordes = bordes;
  }
}