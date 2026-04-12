package iniciante;

import java.util.Scanner;

public class Questao1131 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int g = 0;
        int vitoriasI = 0;
        int vitoriasG = 0;
        int empates = 0;
        int grenais = 0;
        int op = 0;

        do {
            i = scanner.nextInt();
            g = scanner.nextInt();

            if (i == g) {
                empates++;
            } else if (i > g) {
                vitoriasI++;
            } else {
                vitoriasG++;
            }

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            op = scanner.nextInt();

        } while (op == 1);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriasI);
        System.out.println("Gremio:" + vitoriasG);
        System.out.println("Empates:" + empates);

        String ganhador = (vitoriasI > vitoriasG) ? "Inter venceu mais"
                : "Gremio venceu mais";

        System.out.println(ganhador);
    }
}
