package Pacote03;

import java.util.Scanner;

public class Classe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1 = 0, nota2 = 0, nota3 = 0, notaTotal = 0, frequencia = 0;
		double notaCorte = 50, freqCorte =60;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Digite o valor para a variável n1: ");
		nota1 =  entrada.nextDouble();
		System.out.println(" Digite o valor para a variável n2: ");
		nota2 =  entrada.nextDouble();
		System.out.println(" Digite o valor para a variável n3: ");
		nota3 =  entrada.nextDouble();
		System.out.println(" Digite a frequencia ");
		frequencia =  entrada.nextDouble();
		
		notaTotal = nota1 + nota2 + nota3;
		System.out.println((notaCorte - notaCorte * 0.20));
		
		if(notaTotal >=  notaCorte && frequencia>= freqCorte)
			System.out.println("Aprovado.");
		else if(notaTotal >=  (notaCorte - notaCorte * 0.20) && frequencia>= freqCorte)
			System.out.println("Prova Especial.");
		else if(notaTotal >=  80)
			System.out.println("Aprovado direto.");
		else
			System.out.println("Reprovado.");
	}

}