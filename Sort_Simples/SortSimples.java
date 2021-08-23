import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A, B, C, m1, m2 = 0, m3 = 0;
		Scanner in = new Scanner(System.in);
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		
        m1 = Math.min(A, Math.min(B, C));
		
        if (m1 == A) {
			m2 =Math.min(B, C);
			m3 =Math.max(B, C);
		}
		
        if (m1 == B) {
			m2 =Math.min(A, C);
			m3 =Math.max(A, C);
		}

		if (m1 == C) {
			m2 =Math.min(A,B);
			m3 =Math.max(A, B);
		}

    		System.out.print(m1+"\n"+m2+"\n"+m3+"\n\n");
    		System.out.print(A+"\n"+B+"\n"+C+"\n");
	}

} 