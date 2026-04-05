package iniciante;

import java.util.Scanner;

public class Questao1067 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}
