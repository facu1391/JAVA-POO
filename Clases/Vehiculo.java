package POO.Clases;

public class Vehiculo {
    
    //1. Atributos
    protected String fabricante;
    protected String modeloVehiculo;
    protected double cc;
    protected int año;
    protected boolean sport;
    protected int velocidad;
    protected Motor motor;

    //2. Contructores
    public Vehiculo() {

    }

    public Vehiculo(String fabricante, String modeloVehiculo, double cc, int año, boolean sport, int velocidad,
            Motor motor) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modeloVehiculo;
        this.cc = cc;
        this.año = año;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modeloVehiculo = modelo;
    }

    public Vehiculo(String fabricante, int año) {
        this.fabricante = fabricante;
        this.año = año;
    }

    //3. Metodos (Comportamiento)
    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
    }

    //Getter y Setter


    //toString
}
