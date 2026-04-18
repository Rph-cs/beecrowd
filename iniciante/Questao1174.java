package iniciante;

import java.util.Scanner;

public class Questao1174 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[100];

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = scanner.nextDouble();

        }

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }

    }

}

