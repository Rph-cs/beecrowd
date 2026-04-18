package iniciante;

import java.util.Scanner;

public class Questao1113 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String teste = "";

        int i = 0, a = 0, b = 0;

        while (true) {

            teste = scanner.nextLine();
            String[] numeros = teste.split(" ");

            a = Integer.parseInt(numeros[0]);
            b = Integer.parseInt(numeros[1]);

            if (a == b) {
                break;
            }

            if (a > b) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }

    }
}

