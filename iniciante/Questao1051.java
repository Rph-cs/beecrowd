package iniciante;

import java.util.Scanner;

public class Questao1051 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto = 0;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario > 4500.00) {
                imposto += (salario - 4500.00) * 0.28;
                imposto += (1500.00 * 0.18);
                imposto += (1000.00 * 0.08);
            } else if (salario > 3000.00) {
                imposto += (salario - 3000.00) * 0.18;
                imposto += (1000.00 * 0.08);
            } else {
                imposto += (salario - 2000.00) * 0.08;
            }
            
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
