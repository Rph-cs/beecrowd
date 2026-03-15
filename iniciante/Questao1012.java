package iniciante;

import java.util.Scanner;

public class Questao1012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14159;
        double valor;

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        valor = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f\n", valor);

        valor = pi * (C * C);
        System.out.printf("CIRCULO: %.3f\n", valor);

        valor = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO: %.3f\n", valor);

        valor = B * B;
        System.out.printf("QUADRADO: %.3f\n", valor);

        valor = A * B;
        System.out.printf("RETANGULO: %.3f\n", valor);

    }

}

