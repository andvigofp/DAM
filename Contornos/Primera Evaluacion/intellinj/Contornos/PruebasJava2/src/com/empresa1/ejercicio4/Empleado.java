package com.empresa1.ejercicio4;

public class Empleado {
     String nombre;
    private int edad;

    public void setEdad(int edadParam) {
        if (edad > 0) edad=edadParam;
        else mensajeError();
    }

    private static void mensajeError() {
        System.err.println("ERROR");
    }

}
