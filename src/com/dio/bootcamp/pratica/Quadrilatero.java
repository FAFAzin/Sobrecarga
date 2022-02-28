package com.dio.bootcamp.pratica;

/**
 * Exercícios Sobrecarga, práticado e entendendo.
 * **/

public class Quadrilatero {

    public static double area(double lado) {

        double result = lado * lado;
        return result; // adicionado o retorno

    }

    public static double area(double lado1, double lado2) {
        double result = lado1 * lado2;
        return result;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        double baseMedia = (baseMaior + baseMenor) / 2;
        double result = baseMedia * altura;
        return result;

    }
}




