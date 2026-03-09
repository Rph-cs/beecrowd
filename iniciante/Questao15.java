package iniciante;

import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double X1 = scanner.nextDouble();
        double Y1 = scanner.nextDouble();

        double X2 = scanner.nextDouble();
        double Y2 = scanner.nextDouble();

        double distancia = ((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1));

        double raizQuadrada = Math.sqrt(distancia);
        
        System.out.printf("%.4f\n", raizQuadrada);

    }
}
