package GenEx;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2-  Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		Scanner read = new Scanner (System.in);
		float n;
		int impar=0,par=0;
		
		System.out.println("A seguir, insira 10 n�meros...");
		
		for(int i=1;i<=10;i++)
			
		{
			System.out.println("Insira um n�mero: ");
			n=read.nextFloat();
			
			if (n%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		
		}
		 System.out.println("\nQuantidade de pares= "+par);
		 System.out.println("Quantidade de �mpares= "+impar);

	}

}
