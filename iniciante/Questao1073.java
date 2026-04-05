package iniciante;

import java.util.Scanner;

public class Questao1073 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + i*i);
            }

        }

    }
}