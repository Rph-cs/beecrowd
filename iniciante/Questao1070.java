package iniciante;
import java.util.Scanner;

public class Questao1070 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int impares = 0;
        
        int i = valor;
        while (true) {
            if (i % 2 != 0) {
                System.out.println(i);
                impares++;
                if (impares == 6) {
                    break;
                }
            }
            i++;
        }
        
    }
}