package iniciante;

import java.util.Scanner;

public class Questao1118 {

    public static void executar(Scanner scanner) {
        
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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int op;

        do {
            executar(scanner);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                op = scanner.nextInt();
            } while (op != 1 && op != 2);

        } while (op == 1);

    }

}