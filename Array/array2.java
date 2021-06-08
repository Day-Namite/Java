package gen;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2- Faça um programa que receba 6 números inteiros e mostre:
			• Os números pares digitados;
			• A soma dos números pares digitados;
			• Os números ímpares digitados;
			• A quantidade de números ímpares digitados.*/
		int [] num = new int [6];
		int spar=0, simpar=0, pd=0, id=0, x;
		Scanner ler = new Scanner (System.in);
		
		for (x=0;x<num.length;x++)
		{
		
		System.out.println("Insira um número: ");
		num[x]=ler.nextInt();	
		if (num[x]%2==0)
		{
			spar+=num[x];
			pd++;
			
		}
		else 
		{
			simpar+=num[x];
			id++;
		}
		
		}
		for (x=0;x<num.length;x++)
		{
			if (num[x]%2==0)
			{
				System.out.println(+num[x]+"-->É par");	
			}
			else
			{
				System.out.println(+num[x]+ "-->É ímpar");
			}
}

		System.out.println ("Quantidade de pares Digitados: " +pd);
		System.out.println ("Quantidade de ímpares Digitados: " +id);
		System.out.println ("Somatório de Pares: "+ spar);
		System.out.println ("Somatório de Ímpares: "+ simpar);
		
	}

}
