package iniciante;

import java.util.Scanner;

public class Questao1145 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int num = 1;
        
        while (num <= Y) {
            
            for (int j = 0; j < X && num <= Y; j++) {

                if (j == X - 1 || num == Y) {
                    System.out.print(num);
                } else {
                    System.out.print(num + " ");
                }

                num++;
            }

            System.out.println();
        }
    }
}
