package iniciante;

import java.util.Scanner;

public class Questao1052 { 
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        String mes = "";

        if (numero == 1) {
            mes = "Jnuary";
        } else if (numero == 2) {
            mes = "February";
        } else if (numero == 3) {
            mes = "March";
        } else if (numero == 4) {
            mes = "April";
        } else if (numero == 5) {
            mes = "May";
        } else if (numero == 6) {
            mes = "June";
        } else if (numero == 7) {
            mes = "July";
        } else if (numero == 8) {
            mes = "August";
        } else if (numero == 9){
            mes = "September";
        } else if (numero == 10) {
            mes = "October";
        } else if (numero == 11) {
            mes = "November";
        } else {
            mes = "December";
        }

        System.out.println(mes);
    }
}
