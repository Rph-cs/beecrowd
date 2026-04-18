package iniciante;

import java.util.Scanner;

public class Questao1116 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        scanner.nextLine();
        String recebimento = "";
        int x = 0;
        int y = 0;
        double divisao = 0;

        for (int i = 0; i < quantidade; i++) {

            recebimento = scanner.nextLine();

            String[] numeros = recebimento.split(" ");

            x = Integer.parseInt(numeros[0]);
            y = Integer.parseInt(numeros[1]);

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = (double)x / y;
                System.out.printf("%.1f\n", divisao);
            }
        }

    }

}