package iniciante;

public class Questao1097 {

    public static void main(String[] args) {

        int I = 1;
        int J = I + 6;
        int i = 0;

        while (true) {
            System.out.println("I="+I+ " J="+ J);
            
            if ((J - 4) == I) {
                I += 2;
                J = I + 6;
            } else {
                J--;
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
