public class Persona {
    String Nombre;
    int edad;
    double estatura;
    
    public Persona(String _Nombre, int _edad, double _estatura){
        this.Nombre = _Nombre;
        this.edad = _edad;
        this.estatura = _estatura;
    }
    public void imprimir_datos(){
        System.out.println("El nombre es: "+Nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("La estatura es: "+estatura);
    }
    
}
