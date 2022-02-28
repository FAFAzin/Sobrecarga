package com.dio.bootcamp.pratica;

public class main {
    public static void main(String[] args) {

        System.out.println("Resultado das àreas :");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("A área do Quadrado é " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4,8);
        System.out.println("A área do Retangulo é " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10,8,12);
        System.out.println("A área do Trapezio é " + areaTrapezio);

    }
}
