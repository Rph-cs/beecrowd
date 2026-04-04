package iniciante;

import java.util.Scanner;

public class Questao1049 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();
        
        if (palavra1.equalsIgnoreCase("vertebrado")) {
            
            if (palavra2.equalsIgnoreCase("ave")) {
                
                if (palavra3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (palavra2.equalsIgnoreCase("inseto")) {

                if (palavra3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (palavra3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                } else {
                    System.out.println("sanguessuga");
                }
            }
        }
        
    }
}
