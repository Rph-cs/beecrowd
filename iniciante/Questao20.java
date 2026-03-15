package iniciante;

import java.util.Scanner;

public class Questao20 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int dias = scanner.nextInt();
        
        int anos = dias / 365;
        int sobra = dias % 365;
        
        int meses = sobra / 30;
        int diasRestantes = sobra % 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(diasRestantes + " dia(s)");
    }
}
