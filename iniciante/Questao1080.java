package iniciante;

import java.util.Scanner;

public class Questao1080 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[100];
        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < 100; i++) {
            valores[i] = scanner.nextInt();

            if (i == 0) {
                maior = valores[i];

            } else if (valores[i] > maior) {
                maior = valores[i];
                posicao = i + 1;
            }

        }

        System.out.println(maior);
        System.out.println(posicao);

    }
}