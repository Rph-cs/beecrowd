package iniciante;

import java.util.Scanner;

public class Questao1133 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        for(int i = menor + 1; i < maior; i++) {

            if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
        }

    }
}
