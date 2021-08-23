import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double H = in.nextDouble(), C1 = in.nextDouble(), C2 = in.nextDouble();
		
        double tempA = Math.max(H, Math.max(C1, C2));
		double tempB = 0;
		double tempC = 0;
		
		if (tempA == H) {
			tempB =Math.max(C1, C2);
			tempC =Math.min(C1, C2);
		}
		if (tempA == C1) {
			tempB =Math.max(H, C2);
			tempC =Math.min(H, C2);
		}
		if (tempA == C2) {
			tempB =Math.max(C1, H);
			tempC =Math.min(C1, H);
		}
		
		if (tempA >= (tempB + tempC)) {
			System.out.print("NAO FORMA TRIANGULO\n");
			
		}else if (tempA*tempA > ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO OBTUSANGULO\n");
		}
		if (tempA*tempA == ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO RETANGULO\n");
		}

		if (tempA*tempA < ((tempB*tempB)+(tempC*tempC))) {
			System.out.print("TRIANGULO ACUTANGULO\n");
		}
		if ((tempA == tempB) &&(tempA == tempC)) {
			System.out.print("TRIANGULO EQUILATERO\n");
		}
		if (((tempA == tempB) &&(tempA != tempC)) || ((tempA == tempC) &&(tempA != tempB)) || ((tempB == tempC) &&(tempB != tempA)) ) {
			System.out.print("TRIANGULO ISOSCELES\n");
		}
	}

}