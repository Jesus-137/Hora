package com.upchiapas.Hora.models;

public class Verificacion {
    Imprecion imprime = new Imprecion();
    public boolean verificacionH(int H){
        boolean bandera=true;
        if (H<1||H>24) {
            imprime.errorH();
            bandera=false;
        }
        else System.out.println("Hora corecta");
        return bandera;
    }
    public boolean verificacionM(int M){
        boolean bandera=true;
        if (M<0||M>59) {
            imprime.errorM();
            bandera=false;
        }
        else System.out.println("Minuto corecto");
        return bandera;
    }
    public boolean verificacionS(int S){
        boolean bandera=true;
        if (S<0||S>59) {
            imprime.errorS();
            bandera=false;
        }
        else System.out.println("segunto corecto");
        return bandera;
    }
}
