package iniciante;

import java.util.Scanner;

public class Questao1010 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor[] = new double[2];

        for(int i = 0; i < 2; i++) {

            int codigoPeca = scanner.nextInt();
            int numeroPeca = scanner.nextInt();
            double valorPeca = scanner.nextDouble();

            valor[i] = numeroPeca * valorPeca;
        }

        double total = valor[0] + valor[1];

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
    }
}
