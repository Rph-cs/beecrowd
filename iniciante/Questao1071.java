package iniciante;

import java.util.Scanner;

public class Questao1071 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int totalImpares = 0;
        int i = 1;
        int diferenca = Math.abs(valor1 - valor2);
        
        if (valor1 == valor2) {
            System.out.println(totalImpares);
        } else if (valor1 > valor2) {
            i += valor2;
            while (i != valor1) {
                
                if (i % 2 != 0 && i < valor1) {
                    totalImpares += i;
                }
                i++;
            }
            System.out.println(totalImpares);
        } else {
            i += valor1;
            while (i != valor2) {
                
                if (i % 2 != 0 && i > valor1) {
                    totalImpares += i;
                }
                i++;
            }
            System.out.println(totalImpares);
        }

    }
}