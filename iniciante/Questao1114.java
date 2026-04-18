package iniciante;

import java.util.Scanner;

public class Questao1114 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha = 0;

        while (senha != senhaCorreta) {
            senha = scanner.nextInt();
            if (senha == senhaCorreta) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }

    }

}

