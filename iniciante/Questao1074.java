package iniciante;

import java.util.Scanner;

public class Questao1074 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int valor = 0;

        for (int i = 0; i < numero; i++) {
            valor = scanner.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
            } else if (valor % 2 == 0) {
                if (valor > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                } 
            } else {
                if (valor > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}