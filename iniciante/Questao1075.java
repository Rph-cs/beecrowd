package iniciante;

import java.util.Scanner;

public class Questao1075 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % numero == 2) {
                System.out.println(i);
            }
        }

    }
}