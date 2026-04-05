package iniciante;

import java.util.Scanner;

public class Questao1065 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            valores[i] = scanner.nextInt();
            if (valores[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.println(quantidadePares + " valores pares");
    }

}
