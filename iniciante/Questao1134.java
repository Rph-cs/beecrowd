package iniciante;

import java.util.Scanner;

public class Questao1134 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {

            valor = scanner.nextInt();

            if (valor < 1 || valor > 4) {
                continue;
            }

            if (valor == 1) {
                alcool++;
            } else if (valor == 2) {
                gasolina++;
            } else if (valor == 3) {
                diesel++;
            } else {
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
