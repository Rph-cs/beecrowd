package iniciante;

import java.util.Scanner;

public class Questao08 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();
        
        double salario = valorPorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
    }
}
