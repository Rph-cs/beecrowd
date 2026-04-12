package iniciante;

import java.util.Scanner;

public class Questao1144 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        int a = 1, b = 1, c = 1;
        System.out.println(a + " " + b + " " + c);

        for (int i = 2; i <= 2 * quantidade; i++) {

            if (i % 2 == 0) {
                b += 1;
                c += 1;
            } else {
                a += 1;
                b = a * a;
                c = a * b;
            }

            System.out.println(a + " " + b + " " + c);
        }
    }
}
