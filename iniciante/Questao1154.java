package iniciante;

import java.util.Scanner;

public class Questao1154 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int soma = 0;
        int contador = 0;
        
        idade = scanner.nextInt();

        while (idade >= 0) {
            soma += idade;
            contador++;

            idade = scanner.nextInt();
        }

        double media = (double) soma / contador;

        System.out.printf("%.2f\n", media);


    }

}


