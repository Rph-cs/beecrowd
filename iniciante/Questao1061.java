package iniciante;

import java.util.Scanner;

public class Questao1061 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String dia = scanner.nextLine();
        String horario = scanner.nextLine();

        String[] diaInicioSplit = dia.split(" ");
        String[] horarioInicioSplit = horario.split(" : ");

        int diaInicio = Integer.parseInt(diaInicioSplit[1]);
        int horaInicio = Integer.parseInt(horarioInicioSplit[0]);
        int minutoInicio = Integer.parseInt(horarioInicioSplit[1]);
        int segundoInicio = Integer.parseInt(horarioInicioSplit[2]);

        dia = scanner.nextLine();
        horario = scanner.nextLine();

        String[] diaFimSplit = dia.split(" ");
        String[] horarioFimSplit = horario.split(" : ");

        int diaFim = Integer.parseInt(diaFimSplit[1]);
        int horaFim = Integer.parseInt(horarioFimSplit[0]);
        int minutoFim = Integer.parseInt(horarioFimSplit[1]);
        int segundoFim = Integer.parseInt(horarioFimSplit[2]);

        int inicioTotal = diaInicio * 86400
                + horaInicio * 3600
                + minutoInicio * 60
                + segundoInicio;

        int fimTotal = diaFim * 86400
                + horaFim * 3600
                + minutoFim * 60
                + segundoFim;

        int duracao = fimTotal - inicioTotal;

        int dias = duracao / 86400;
        duracao %= 86400;

        int horas = duracao / 3600;
        duracao %= 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
