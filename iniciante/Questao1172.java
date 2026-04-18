package iniciante;

import java.util.Scanner;

public class Questao1172 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();

            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }


    }

}

