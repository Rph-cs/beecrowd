package iniciante;

import java.util.Scanner;

public class Questao1164 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {

            int valor = scanner.nextInt();
            
            int total = 0;
            
            for (int j = 1; j < valor; j++) {

                if (valor % j == 0) {
                    total += j;
                }
            }

            if (total == valor) {
                System.out.println(valor + " eh perfeito");
            } else {
                System.out.println(valor + " nao eh perfeito");
            }

        }
        
    }
}
