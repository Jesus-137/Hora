package com.upchiapas.Hora.models;

import java.util.Scanner;

public class Lectura {
    int H,M,S;
    Scanner entrada = new Scanner(System.in);
    Verificacion verificar=new Verificacion();
    public void lecturaDatos(){
        do {
            System.out.println("Ingrese la hora");
            H = entrada.nextInt();
        }while (!verificar.verificacionH(H));
        do {
            System.out.println("Ingrese los minutos");
            M = entrada.nextInt();
        }while (!verificar.verificacionM(M));
        do {
            System.out.println("Ingrese los seguntos");
            S = entrada.nextInt();
        }while (!verificar.verificacionS(S));
        verificar.imprime.imprecionHora(H,M,S);
    }
}
