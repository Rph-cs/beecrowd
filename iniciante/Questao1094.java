package iniciante;

import java.util.Scanner;

public class Questao1094 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < N; i++) {

            int quantidade = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            total += quantidade;

            if (tipo == 'C') {
                coelhos += quantidade;
            } else if (tipo == 'R') {
                ratos += quantidade;
            } else if (tipo == 'S') {
                sapos += quantidade;
            }
        }

        double pCoelhos = (coelhos * 100.0) / total;
        double pRatos = (ratos * 100.0) / total;
        double pSapos = (sapos * 100.0) / total;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", pCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", pRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", pSapos);
    }
}