package GenEx;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 2-  Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		Scanner read = new Scanner (System.in);
		float n;
		int impar=0,par=0;
		
		System.out.println("A seguir, insira 10 números...");
		
		for(int i=1;i<=10;i++)
			
		{
			System.out.println("Insira um número: ");
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
		 System.out.println("Quantidade de ímpares= "+impar);

	}

}
