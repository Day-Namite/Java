package gen;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
			� Os n�meros pares digitados;
			� A soma dos n�meros pares digitados;
			� Os n�meros �mpares digitados;
			� A quantidade de n�meros �mpares digitados.*/
		int [] num = new int [6];
		int spar=0, simpar=0, pd=0, id=0, x;
		Scanner ler = new Scanner (System.in);
		
		for (x=0;x<num.length;x++)
		{
		
		System.out.println("Insira um n�mero: ");
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
				System.out.println(+num[x]+"-->� par");	
			}
			else
			{
				System.out.println(+num[x]+ "-->� �mpar");
			}
}

		System.out.println ("Quantidade de pares Digitados: " +pd);
		System.out.println ("Quantidade de �mpares Digitados: " +id);
		System.out.println ("Somat�rio de Pares: "+ spar);
		System.out.println ("Somat�rio de �mpares: "+ simpar);
		
	}

}
