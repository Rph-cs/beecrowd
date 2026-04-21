package iniciante;

import java.util.Scanner;

public class Questao1180 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];
        int menor = 0;
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = scanner.nextInt();

            if (i == 0) {
                menor = vetor[i];
                posicao = i;
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: "+ menor);
        System.out.println("Posicao: "+ posicao);
    }
}
