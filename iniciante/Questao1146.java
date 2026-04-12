package iniciante;

import java.util.Scanner;

public class Questao1146 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            int quantidade = scanner.nextInt();

            if (quantidade == 0) {
                break;
            }

            for (int i = 1; i <= quantidade; i++) {

                if (i == quantidade) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }

            }
        }
        
    }
}
