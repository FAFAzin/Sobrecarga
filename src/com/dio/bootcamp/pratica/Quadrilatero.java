package com.dio.bootcamp.pratica;

/**
 * Exercícios Sobrecarga, práticado e entendendo.
 * **/

public class Quadrilatero {

    public static void area(double lado) {

        double result = lado * lado;

        System.out.println("A área do Quadrado é igual a " + result);
    }

    public static void area(double lado1, double lado2) {
        double result = lado1 * lado2;

        System.out.println("A área do Retangulo é " + result);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        double baseMedia = (baseMaior + baseMenor) / 2;
        //double baseMedia = somaDasBases / 2;
        double result = baseMedia * altura;
        System.out.println("A área do trapézio é " + result);
    }
}




