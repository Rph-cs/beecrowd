package iniciante;

import java.util.Scanner;

public class Questao1132 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int total = 0;

        for (int i = menor; i < maior; i++) {

            if (i % 13 != 0) {
                total += i;
            }
        }

        System.out.println(total);
    }
}
