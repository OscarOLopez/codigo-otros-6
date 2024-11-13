package com.revisioncodigo6;

public class Codigo6 {

    public static void main(String[] args) {

    	int[] n =new int[20]; //Se agrega new para pueda crearlo

	    for (int i = 0; i < 20; i++) { //Se le agrega un "+" para que i pueda ir aumentando
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //Se agrega .out para mandar a imprimir
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //Se agrega "n" al final de print para que imprima y haga salto de linea
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine()); //Se agrega un parentesis de cierre 

	    int multiplo = (opcion == 1) ? 5 : 7; //Se invierte : y ? dado que ? cuestiona lo anterior evaluado y lo siguiente son las respuestas al falso y verdadero

	    for (int e : n) { //se cambia por for y se cambia char por int para que pueda ser evaluado
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else { //Se cierra la llave de if
	        System.out.print(e + " "); //Se cambia el valor de .in a .out
	      }
	    }
    }

}
