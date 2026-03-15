package iniciante;

import java.util.Scanner;

public class Questao1044 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        boolean saoMultiplos = B % A == 0;

        if (saoMultiplos) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
