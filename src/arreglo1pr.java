/*Escribe un programa que lea un arreglo de enteros y encuentre el segundo mayor número en el arreglo.
Ejemplo:
Entrada: [12, 35, 1, 10, 34, 3]
Salida: El segundo mayor número es 34*/

import java.util.Arrays;

public class arreglo1pr {
    public static void main(String[] args) {
        int [] array1 = {12, 35, 1, 10, 34, 3};
        int segmenor=0,mayor=0;
        int posicion=0;
        // Ordenar el arreglo en orden ascendente
        Arrays.sort(array1);
        mayor = array1[array1.length-2];

        System.out.println(mayor);
        //Segundo mayor







    }


}
