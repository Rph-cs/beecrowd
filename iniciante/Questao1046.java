package iniciante;

import java.util.Scanner;

public class Questao1046 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaInicial == horaFinal) {
            duracao = 24;
        } else if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        
    }
}
