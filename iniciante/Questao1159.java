package iniciante;

import java.util.Scanner;

public class Questao1159 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        while (valor != 0) {

            int inicio = (valor % 2 == 0) ? valor : valor + 1;

            int soma = 0;

            for (int i = 0; i < 5; i++) {
                soma += inicio + (i * 2);
            }

            System.out.println(soma);

            valor = scanner.nextInt();
        }
        
    }

}


