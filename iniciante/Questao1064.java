package iniciante;

import java.util.Scanner;

public class Questao1064 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[6];
        int quantidadePositivos = 0;
        double somaPositivos = 0;
        
        for (int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextDouble();
            
            if (numeros[i] > 0) {
                quantidadePositivos++;
                somaPositivos += numeros[i];
            }
        }
        System.out.println(quantidadePositivos + " valores positivos");
        somaPositivos = somaPositivos / quantidadePositivos;
        System.out.printf("%.1f\n", somaPositivos);

    }
}
