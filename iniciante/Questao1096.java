package iniciante;

public class Questao1096 {

    public static void main(String[] args) {
        int I = 1;
        int J = 7;
        int i = 0;
        
        while (true) {
            System.out.println("I="+I+ " J="+ J);
            J--;
            if (J == 4) {
                I += 2;
                J = 7;
            }
            if (I == 9) {
                i++;
                if (i == 3) {
                    System.out.println("I="+I+ " J="+ J);
                    break;
                }
            }

        }
    }
}
