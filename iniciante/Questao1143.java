package iniciante;

import java.util.Scanner;

public class Questao1143 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        int a = 1, b = 1, c = 1;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println(a + " " + b + " " + c);

            a += 1;
            b = (i * a) + a;
            c = a * b;
        }
    }
}
