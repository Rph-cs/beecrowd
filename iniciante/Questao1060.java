package iniciante;

import java.util.Scanner;

public class Questao1060 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double[] numeros = new double[6];
        int quantidadePositivos = 0;
        
        for(int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > 0) {
                quantidadePositivos++;
            }
        }
        System.out.println(quantidadePositivos + " valores positivos");
    }
}
