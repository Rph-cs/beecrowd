package iniciante;

import java.util.Scanner;

public class Questao1042 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int numeroA = A;
        int numeroB = B;
        int numeroC = C;

        int armazenar = 0;
        
        if (A > B) {
            armazenar = A;
            A = B;
            B = armazenar;
        } 
        
        if (B > C) {
            armazenar = B;
            B = C;
            C = armazenar;
        }

        if (A > B) {
            armazenar = A;
            A = B;
            B = armazenar;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println();

        System.out.println(numeroA);
        System.out.println(numeroB);
        System.out.println(numeroC);

    }
}
