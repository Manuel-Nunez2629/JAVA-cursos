import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Descuentos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String comprador = sc.nextLine();

        System.out.println("Introduzca monto de compra: ");
        double Monto = sc.nextDouble();
        if (Monto < 80){
            System.out.println("Bienvenido "+comprador+ "\nMonto de compra muy bajo para aplicar descuento");

            System.out.println("Su Monto total de compra es: "+ Monto+"$");
        }else if(Monto >= 80 && Monto < 170){
            System.out.println("Bienvenido "+comprador+ "\nEl descuento aplicado a su compra es de: 10%");
            double descuento = Monto*0.10;
            double mt = Monto- descuento;

            System.out.println("Su monto sin descuento seria de: "+Monto+"$");
            System.out.println("Su Monto total de compra con descuento es de: "+ mt+"$");
        }else if(Monto >=170 && Monto <=350){
            System.out.println("Bienvenido "+comprador+ "\nEl descuento aplicado a su compra es de: 15%");
            double descuento = Monto*0.15;
            double mt = Monto- descuento;

            System.out.println("Su monto sin descuento seria de: "+Monto+"$");
            System.out.println("Su Monto total de compra con descuento es de: "+ mt+"$");
        }else if(Monto >350 && Monto <600){
            System.out.println("Bienvenido "+comprador+ "\nEl descuento aplicado a su compra es de: 20%");
            double descuento = Monto*0.20;
            double mt = Monto- descuento;

            System.out.println("Su monto sin descuento seria de: "+Monto+"$");
            System.out.println("Su Monto total de compra con descuento es de: "+ mt+"$");
        }else{
            System.out.println("Bienvenido "+comprador+ "\nMonto de compra muy alto para aplicar descuento");
            System.out.println("Su Monto total de compra con descuento es de: "+ Monto+"$");
        }





    }


}

