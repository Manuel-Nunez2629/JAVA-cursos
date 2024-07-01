import java.util.Scanner;
/*En la empresa “Tecnología Rex” necesitan obtener cierta información de los empleados para generar el
reporte de nómina mensual. Por eso, te piden que codifiques un programa con las siguientes características:
 * Debe pedir el nombre completo y el sueldo de cada empleado.
 * Debe mostrar cuál es el empleado con mayor y menor sueldo.
 * Debe mostrar el promedio de sueldos en la empresa.
 * Empleado	Sueldo (usd)
Hugo	2000
Josefina 1000
Elías	2300
Daniela	1100
Juan	1450*/
public class Nomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String empleados [] = new String [5];
        double sueldos [] = new double[5];
        double prom = 0.0;
        double sumatoria = 0.0;
        double mayor = 0.0, menor = 0.0;
        int posicion = 0, posicion2= 0;

        System.out.println("Comenzaremos a pedir los nombres y sueldos de cada empleado.");
        for(int i=0;i<5;i++) {
            System.out.println("Nombre del empleado: ");
            empleados[i] = sc.next();
            System.out.println("Ingrese el sueldo del empleado: "+empleados[i]);
            sueldos[i]= sc.nextDouble();
            sumatoria += sueldos[i];
        }
        mayor = sueldos[0];
        for(int r=0;r<sueldos.length;r++){
            if(mayor<sueldos[r]){
                mayor = sueldos[r];
                posicion = r;

            }
        }
        menor = sueldos[0];
        for(int j=0;j<sueldos.length;j++){
            if(menor>sueldos[j]){
                menor = sueldos[j];
                posicion2 = j;

            }
        }
        prom = sumatoria/5;
        System.out.println(empleados[posicion]+"es el empleado que mas dinero gana: "+mayor+"$");
        System.out.println("Y el empleado que menos dinero gana es: "+empleados[posicion2]+" con: "+menor+"$");
        System.out.println("Promedio de sueldos en la Empresa: "+prom);
        sc.close();

    }
}
