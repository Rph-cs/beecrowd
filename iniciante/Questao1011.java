package iniciante;

import java.util.Scanner;

public class Questao1011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14159;
        double R = scanner.nextDouble();

        double volumeEsfera = (4.0/3) * pi * (R * R * R);

        System.out.printf("VOLUME = %.3f\n", volumeEsfera);
    }
}
