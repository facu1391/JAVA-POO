package Interfaces;

import java.util.List;

import POO.interfaces.Empleado;

/*
 * Se declaran los metodos, no se implementan
 * 
 * Actua como un contrato, dice lo que hay que hacer pero no lo hace
 */

public interface EmpleadoCRUD {
    
    void guaradar(Empleado empleado);

    List<Empleado> verTrabajador();

    void delete(Empleado empleado);

}
