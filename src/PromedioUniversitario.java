import java.util.Scanner;
public class PromedioUniversitario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float prom= 0, sumatoria = 0;
        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.nextLine();
        for(int i =1; i<=5; i++){
            System.out.println("Ingrese sus notas:"+i);
            float notas = sc.nextFloat();
            sumatoria = sumatoria + notas;
            prom = sumatoria/5;
        }
        System.out.println("Hola "+nombre+"\nTu promedio es de: "+prom);

    }
}
