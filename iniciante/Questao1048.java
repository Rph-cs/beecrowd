package iniciante;

import java.util.Scanner;

public class Questao1048 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double salarioNovo = 0;
        double reajusteGanho = 0;
        int percentual = 0;
        double salarioAntigo = scanner.nextDouble();
        
        if (salarioAntigo <= 400.00) {
            salarioNovo = salarioAntigo + (salarioAntigo * 0.15);
            reajusteGanho = salarioNovo - salarioAntigo;
            percentual = 15;
        } else if (salarioAntigo <= 800.00) {
            salarioNovo = salarioAntigo + (salarioAntigo * 0.12);
            reajusteGanho = salarioNovo - salarioAntigo;
            percentual = 12;
        } else if (salarioAntigo <= 1200.00) {
            salarioNovo = salarioAntigo + (salarioAntigo * 0.10);
            reajusteGanho = salarioNovo - salarioAntigo;
            percentual = 10;
        } else if (salarioAntigo <= 2000.00) {
            salarioNovo = salarioAntigo + (salarioAntigo * 0.07);
            reajusteGanho = salarioNovo - salarioAntigo;
            percentual = 7;
        } else {
            salarioNovo = salarioAntigo + (salarioAntigo * 0.04);
            reajusteGanho = salarioNovo - salarioAntigo;
            percentual = 4;
        }
        
        System.out.printf("Novo salario: %.2f\n", salarioNovo);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.println("Em percentual: "+ percentual +" %");
        
    }
}
