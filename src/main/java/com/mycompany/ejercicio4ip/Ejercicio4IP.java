
package com.mycompany.ejercicio4ip;
//Copyright:Ruth Bautista(202320050047).
//En este programa se define un arreglo de cadenas que contiene una lista de nombres
//numerados. Utilicé un bucle for para recorrer el arreglo y 
//mostrar cada nombre en la consola.

public class Ejercicio4IP {

    public static void main(String[] args) {
      
        String[] nombres = {
            "1: Lisny Aguilar",
            "2: Blanca Da Costa",
            "3: Jose Pineda",
            "4: Ludin Baquedano",
            "5: Carlos Quintero",
            "6: Mayely Serrano",
            "7: Michel Castillo",
            "8: Jasson Ortega",
            "9: Carlos Portillo",
            "10: Sindy Rodriguez",
        };

        for (String nombre : nombres) {
            System.out.println(nombre);
        }    
    }
}
