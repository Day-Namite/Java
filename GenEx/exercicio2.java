package GenEx;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2- Faça um programa que entre com três números e coloque em ordem crescente.
		Scanner leia = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println("Insira o Primeiro Número: ");
		n1=leia.nextInt();
		System.out.println("Insira o Segundo Número: ");
		n2=leia.nextInt();
		System.out.println("Insira o Terceiro Número: ");
		n3=leia.nextInt();
		
		if (n1<n2 && n2<n3)
		{
			System.out.println(n1+"," +n2+"e" +n3);
		}
		else if (n1<n3 && n3<n2)
		{
			System.out.println(n1+"," +n3+ "e" +n2);
		}
		else if (n2<n1 && n1<n3)
		{
			System.out.println(n2+"," +n1+ "e" +n3);
		}
		else if (n2<n3 && n3<n1)
		{
			System.out.println(n2+"," +n3+ "e" +n1);
		}
		else if (n3<n1 && n1<n2)
		{
			System.out.println(n3+"," +n1+ "e" +n2);
		}
		else if (n3<n2 && n2<n1)
		{
			System.out.println(n3+"," +n2+ "e" +n1);
		}
		else
		{
			System.out.println("Números Iguais");
		}
	}

}
