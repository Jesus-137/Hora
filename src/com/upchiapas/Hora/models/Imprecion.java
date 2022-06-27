package com.upchiapas.Hora.models;

public class Imprecion {
    public void imprecionHora(int H, int M, int S){
        System.out.println("Hora ingresada: "+H+":"+M+":"+S);
    }
    public void errorH(){
        System.out.println("La hora solo esta de 1 a 24 favor de verificar");
    }
    public void errorM(){
        System.out.println("Los minutos solo pueden ser de 0 a 59 favor de verificar");
    }
    public void errorS(){
        System.out.println("Los seguntos solo pueden ser de 0 a 59 favor de verificar");
    }
}
