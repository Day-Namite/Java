package gen;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		final int linha=3, coluna=3;
		int [][] numero = new int [linha][coluna];
		int l, c, s10=0;
		Scanner ler = new Scanner (System.in);
		
		for (l=0;l<linha;l++)
		{
			for (c=0;c<coluna;c++)
			{
				System.out.println("Insira um número: ");
				numero[l][c] = ler.nextInt();
				if (numero[l][c]>10)
				{
					s10++;
					
				}
				
			}
			
		}
		
		System.out.println("Valores Maior que 10: " + s10);
	}

}
