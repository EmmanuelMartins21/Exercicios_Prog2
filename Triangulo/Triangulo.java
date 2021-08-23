import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {

public static void main(String[] args) {

Scanner ler = new Scanner(System.in);

 	float A,B,C,P,area;

	A = ler.nextFloat();
		
	B = ler.nextFloat();
	
	C = ler.nextFloat();

	if (((abs(B - C) < A) & (A < B + C)) & ((abs(A - C) < B) & (B < A + C)) & ((abs(A - B) < C) & (C < A + B))) 
	{
	    System.out.println("Perimetro = " + (A + B + C));
	}
		
	else 
	{
	    System.out.println("Area = " + (((A + B) * C)/2));
	}
    

    }
}