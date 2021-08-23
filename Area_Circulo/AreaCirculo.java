import java.util.Scanner;
public class Main { 
    public static void main (String [] args) {

        Scanner in = new Scanner (System.in);

        double raio, A;
        
        raio = in.nextDouble();
         

        A=(raio * raio) * 3.14159;

 System.out.printf("A=%.4f\n",A);
    }
}