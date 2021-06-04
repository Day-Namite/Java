package GenEx;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		System.out.println("A Seguir, insira 3 números inteiros...");
		
		System.out.println("Digite o Primeiro número: ");
		n1=leia.nextInt();
		System.out.println("Digite o Segundo número: ");
		n2=leia.nextInt();
		System.out.println("Digite o Terceiro número: ");
		n3=leia.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("O maior número é: "+ n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("O maior número é: "+ n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("O maior número é: "+ n3);
		}
		else
		{
			System.out.println("Números Iguais");
		}
	}

}
