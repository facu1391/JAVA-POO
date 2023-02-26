package POO.Herencia;

import POO.Clases.Motor;
import POO.Clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    
    boolean baul;

    public Motocicleta() {
        
    }

    public Motocicleta(String fabricante, String modeloVehiculo, double cc, int año, boolean sport, int velocidad,
            Motor motor, boolean baul) {
        super(fabricante, modeloVehiculo, cc, año, sport, velocidad, motor);
        this.baul = baul;
    }

}
