package iniciante;

import java.util.Scanner;

public class Questao1045 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double temp;

        if (A < B) {
            temp = A;
            A = B;
            B = temp;
        }

        if (A < C) {
            temp = A;
            A = C;
            C = temp;
        }

        if (B < C) {
            temp = B;
            B = C;
            C = temp;
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {

            double a2 = A * A;
            double soma = B * B + C * C;

            if (a2 == soma) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (a2 > soma) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (a2 < soma) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}
