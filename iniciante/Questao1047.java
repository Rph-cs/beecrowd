package iniciante;

import java.util.Scanner;

public class Questao1047 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        int horaDurada = 0;
        int minutoDurado = 0;
        
        if (horaInicial == horaFinal) {
           horaDurada = 00;
        } else if (horaInicial > horaFinal) {
            horaDurada = 24 - horaInicial + horaFinal;
        } else {
            horaDurada = horaFinal - horaInicial;
        }
        
        if (minutoInicial == minutoFinal) {
            minutoDurado = 0;
            horaDurada =+ 1;
        } else if (minutoInicial > minutoFinal){
            minutoDurado = 60 - minutoInicial + minutoFinal;
        } else {
            minutoDurado = minutoFinal + minutoInicial;
        }


        System.out.println("O JOGO DUROU " + horaDurada + " HORA(S) E " + minutoDurado + " MINUTO(S)");



    }
}
