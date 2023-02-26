package POO.Clases;

import POO.Herencia.Camion;
import POO.Herencia.Coche;
import POO.Herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        
        //Clase identificador = new Clase();

        //1. Clases y objetos
        //Crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        Vehiculo forMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
        System.out.println(forMondeo.fabricante);
        System.out.println(forMondeo.año);
        System.out.println(forMondeo.velocidad); //0
        forMondeo.acelerar(50);
        System.out.println(forMondeo.velocidad); //50

        //2. Herencia
        //Creando el constructor motocilelta herdedada de vehiculo
        Motocicleta KawasakiNinja = new Motocicleta();
        KawasakiNinja.fabricante = "Kawasaki";


        System.out.println("Fin del programa");

        //3. Polimorfimo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(100);

        vehiculo = new Camion();
        vehiculo.acelerar(150);

        //4. Clases obstractas: no se pueden instanciar, solo instancian las clases hijas
    }
}
