package ciclos;

import javax.swing.JOptionPane;

public class Ejercicio1DoWhile {
	/*
	 * Algoritmo que imprima la suma de los 10 primeros numeros
	 * usando el ciclo do-while
	 */
	public static void main(String[] args) {
		
		int i=0, suma=0, cantidad=0;
		
		cantidad=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese la cantidad"));
		
		do {
			suma=suma+i;
			
			i++;
		} while (i<=cantidad);
			
		
		System.out.println("La suma de los "+cantidad+" primeros numeros es: "+suma);
		//0+1+2+3 = 6 

	}

}
