package iniciante;

import java.util.Scanner;

public class Questao1009 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        salario += totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salario);
    }
}
