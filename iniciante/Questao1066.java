package iniciante;
import java.util.Scanner;

public class Questao1066 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] valores = new int[5];
        int totalPares = 0;
        int totalImpares = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;

        for(int i = 0; i < 5; i++) {

            valores[i] = scanner.nextInt();

            if (valores[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }

            if (valores[i] > 0) {
                totalPositivos++;
            } else if (valores[i] < 0) {
                totalNegativos++;
            }
        }

        System.out.println(totalPares + " valor(es) par(es)");
        System.out.println(totalImpares + " valor(es) impar(es)");
        System.out.println(totalPositivos + " valor(es) positivo(s)");
        System.out.println(totalNegativos + " valor(es) negativo(s)");
    }

}
