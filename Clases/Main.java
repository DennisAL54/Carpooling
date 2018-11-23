/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class Main {
  public static void main(String[] args) {
    Borde[] bordes = {
      new Borde(0, 2, 1), new Borde(0, 3, 4), new Borde(0, 4, 2),
      new Borde(0, 1, 3), new Borde(1, 3, 2), new Borde(1, 4, 3),
      new Borde(1, 5, 1), new Borde(2, 4, 1), new Borde(3, 5, 4),
      new Borde(4, 5, 2), new Borde(4, 6, 7), new Borde(4, 7, 2),
      new Borde(5, 6, 4), new Borde(6, 7, 5)
    };
    Grafo g = new Grafo(bordes);
    g.calcularDistanciaCorta();
    g.printResultado(); // let's try it !
  }
}