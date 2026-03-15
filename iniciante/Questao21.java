package iniciante;

import java.util.Scanner;

public class Questao21 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double entrada = scanner.nextDouble();

        int valor = (int) (entrada * 100);

        int n100 = valor / 10000;
        valor = valor % 10000;

        int n50 = valor / 5000;
        valor = valor % 5000;

        int n20 = valor / 2000;
        valor = valor % 2000;

        int n10 = valor / 1000;
        valor = valor % 1000;

        int n5 = valor / 500;
        valor = valor % 500;

        int n2 = valor / 200;
        valor = valor % 200;

        int m1 = valor / 100;
        valor = valor % 100;

        int m50 = valor / 50;
        valor = valor % 50;

        int m25 = valor / 25;
        valor = valor % 25;

        int m10 = valor / 10;
        valor = valor % 10;

        int m5 = valor / 5;
        valor = valor % 5;

        int m01 = valor;

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m5 + " moeda(s) de R$ 0.05");
        System.out.println(m01 + " moeda(s) de R$ 0.01");
    }
}
