package GenEx;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		System.out.println("A Seguir, insira 3 n�meros inteiros...");
		
		System.out.println("Digite o Primeiro n�mero: ");
		n1=leia.nextInt();
		System.out.println("Digite o Segundo n�mero: ");
		n2=leia.nextInt();
		System.out.println("Digite o Terceiro n�mero: ");
		n3=leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("O maior n�mero �: "+ n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("O maior n�mero �: "+ n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("O maior n�mero �: "+ n3);
		}
		else
		{
			System.out.println("N�meros Iguais");
		}
	}

}
