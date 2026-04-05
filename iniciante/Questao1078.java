package iniciante;

import java.util.Scanner;

public class Questao1078 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (i*numero));
        }


    }
}