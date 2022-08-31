package com.example;

public class Main {
    public static void main(String[] args) {
        String[] municipios = {"Acajete", "Acatlán", "Ajalpan", "Caltepec", "Chapulco", "Coxcatlán", "Cañada Morelos", "Palmar de Bravo",
                "Puebla", "Tepeaca", "Santiago Miahuatlán", "Tehuacán", "Tepexco"};
        String cadena = "";

        for(int i = 0; i < municipios.length; i++){
            if(i < (municipios.length - 1)){
                cadena += municipios[i] + " - ";
            }else {
                cadena += municipios[i];
            }
        }
        System.out.println("Algunos municipios de Puebla son: \n" + cadena);
    }
}
