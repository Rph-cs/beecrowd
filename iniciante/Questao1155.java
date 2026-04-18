package iniciante;

public class Questao1155 {

    public static void main(String[] args) {

        double S = 0;
        int cont = 1;

        for (int i = 1; i <= 100; i++) {

            S += 1.00/i;

        }

        System.out.printf("%.2f\n", S);

    }

}

