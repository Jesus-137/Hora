package com.upchiapas.Hora;

import com.upchiapas.Hora.models.Lectura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        String opcion;
        do {
            Lectura leer = new Lectura();
            leer.lecturaDatos();
            System.out.println("Quiere ingresar otra hora?");
            opcion=entrada.next();
        }while (opcion.equals("si")|| opcion.equals("Si"));
    }
}
