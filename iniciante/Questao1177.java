package iniciante;

import java.util.Scanner;

public class Questao1177 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[1000];

        int valor = scanner.nextInt();

        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {

            if (cont == valor) {
                cont = 0;
            }

            vetor[i] = cont;

            cont++;

        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
        
    }
}
