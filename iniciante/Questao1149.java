package iniciante;

import java.util.Scanner;

public class Questao1149 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int quantidade = 0;

        do {
            quantidade = scanner.nextInt();
        } while (quantidade <= 0);

        int total = 0;

        for (int i = 0; i < quantidade; i++) {

            total += numero + i;
        }

        System.out.println(total);

    }

}
