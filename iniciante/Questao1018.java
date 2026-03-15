package iniciante;

import java.util.Scanner;

public class Questao1018 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int valor = scanner.nextInt();
        int sobra = valor;

        int quantidade100 = sobra / 100;
        sobra = sobra % 100;

        int quantidade50 = sobra / 50;
        sobra = sobra % 50;

        int quantidade20 = sobra / 20;
        sobra = sobra % 20;

        int quantidade10 = sobra / 10;
        sobra = sobra % 10;

        int quantidade5 = sobra / 5;
        sobra = sobra % 5;

        int quantidade2 = sobra / 2;
        sobra = sobra % 2;

        int quantidade1 = sobra;
        
        System.out.println(valor);
        System.out.println(quantidade100 + " nota(s) de R$ 100,00");
        System.out.println(quantidade50 + " nota(s) de R$ 50,00");
        System.out.println(quantidade20 + " nota(s) de R$ 20,00");
        System.out.println(quantidade10 + " nota(s) de R$ 10,00");
        System.out.println(quantidade5 + " nota(s) de R$ 5,00");
        System.out.println(quantidade2 + " nota(s) de R$ 2,00");
        System.out.println(quantidade1 + " nota(s) de R$ 1,00");
        System.out.print("");
        
    }
    
}
