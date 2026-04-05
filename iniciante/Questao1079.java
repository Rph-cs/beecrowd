package iniciante;

import java.util.Scanner;

public class Questao1079 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f\n", media);
        }
        
    }
}
