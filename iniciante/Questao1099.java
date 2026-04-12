package iniciante;

import java.util.Scanner;

public class Questao1099 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int soma = 0;

            int menor = Math.min(x, y);
            int maior = Math.max(x, y);

            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }
    }
}