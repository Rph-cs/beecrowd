package iniciante;

import java.util.Scanner;

public class Questao35 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        boolean valido =
                B > C &&
                        D > A &&
                        (C + D) > (A + B) &&
                        C > 0 &&
                        D > 0 &&
                        A % 2 == 0;

        if (valido) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        
    }
}
