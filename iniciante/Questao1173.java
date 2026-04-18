package iniciante;

import java.util.Scanner;

public class Questao1173 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        vetor[0] = scanner.nextInt();
        
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
        
    }
}

