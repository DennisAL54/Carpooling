/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


public class Borde {
  private int desdeIndice;
  private int haciaIndice;
  private int length;
  public Borde(int desdeIndice, int haciaIndice, int largo) {
    this.desdeIndice = desdeIndice;
    this.haciaIndice = haciaIndice;
    this.length = largo;
  }
  public int getDesdeIndice() {
    return desdeIndice;
  }
  public int getHaciaIndice() {
    return haciaIndice;
  }
  public int getLargo() {
    return length;
  }
  // determines the neighbouring node of a supplied node, based on the two nodes connected by this edge
  public int getIndiceVecino(int nodoIndice) {
    if (this.desdeIndice == nodoIndice) {
      return this.haciaIndice;
    } else {
      return this.desdeIndice;
   }
  }
}