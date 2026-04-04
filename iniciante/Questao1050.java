package iniciante;

import java.util.Scanner;

public class Questao1050 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ddd = scanner.nextInt();
        String mensagem = "";

        if (ddd == 61) {
            mensagem = "Brasilia";
        } else if (ddd == 71) {
            mensagem = "Salvador";
        } else if (ddd == 11) {
            mensagem = "Sao Paulo";
        } else if (ddd == 21) {
            mensagem = "Rio de Janeiro";
        } else if (ddd == 32) {
            mensagem = "Juiz de Fora";
        } else if (ddd == 19) {
            mensagem = "Campinas";
        } else if (ddd == 27) {
            mensagem = "Vitoria";
        } else if (ddd == 31) {
            mensagem = "belo horizonte";
        } else {
            mensagem = "DDD nao cadastrado";
        }
        System.out.println(mensagem);
    }
}
