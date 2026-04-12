package iniciante;

import java.util.Scanner;

public class Questao1098 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        for (double i = 0; i <= 2.0001; i += 0.2) {

            for (int j = 1; j <= 3; j++) {

                double valorJ = j + i;

                if (Math.abs(i - Math.round(i)) < 0.0001) {
                    System.out.println("I=" + (int)Math.round(i) + " J=" + (int)Math.round(valorJ));
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, valorJ);
                }
            }
        }
        
    }
}
