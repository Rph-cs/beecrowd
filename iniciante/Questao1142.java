package iniciante;

import java.util.Scanner;

public class Questao1142 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        int a = 1, b = 2, c = 3;
        String mensagem = "PUM";

        for (int i = 0; i < quantidade; i++) {
            System.out.println(a + " " + b + " " + c + " " + mensagem);

            a += 4;
            b += 4;
            c += 4;
        }
    }
}
