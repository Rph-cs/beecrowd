package iniciante;

import java.util.Scanner;

public class Questao1117 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double numero = 0;
        double[] numerosValidos = new double[2];
        int i = 0;

        while (i < 2) {
            numero = scanner.nextDouble();

            if (numero >= 0 && numero <= 10) {
                numerosValidos[i] = numero;
                i++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = (numerosValidos[0] + numerosValidos[1]) / numerosValidos.length;

        System.out.printf("media = %.2f\n", media);
    }
}
