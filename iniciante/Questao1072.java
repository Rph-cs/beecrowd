package iniciante;

import java.util.Scanner;

public class Questao1072 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        int[] valores= new int[quantidade];
        int totalDentro = 0;
        int totalFora = 0;

        for (int i = 0; i < quantidade; i++) {
            valores[i] = scanner.nextInt();

            if (valores[i] >= 10 && valores[i] <= 20) {
                totalDentro++;
            } else {
                totalFora++;
            }
        }
        System.out.println(totalDentro+ " in");
        System.out.println(totalFora + " out");
    }
}