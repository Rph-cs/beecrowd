package iniciante;

import java.util.Scanner;

public class Questao19 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int horas = N / 3600;
        int resto = N % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        
    }
}
