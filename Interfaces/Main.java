package Interfaces;

import POO.interfaces.Empleado;

public class Main {

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
    

    public static void main(String[] args) {
        
        empleadoCRUD.verTrabajador();
        empleadoCRUD.guaradar(new Empleado());

    }
}
