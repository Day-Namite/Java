package gen;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(4) imprimir as matrizes
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
		própria matriz.*/
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		float [][] matriz3 = new float [2][2];
		int num, op, l, c;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira um número: ");
		num=ler.nextInt();
		
		for (l=0;l<2;l++)
		{
			for (c=0;c<2;c++)
			{
				System.out.println("Insira o Valor da Primeira Matriz: ");
				matriz1[l][c]=ler.nextFloat();
				System.out.println("Insira o Valor da Segunda Matriz: ");
				matriz2[l][c]=ler.nextFloat();
			}
		}
		System.out.println("\t\t Menu de Opções: ");
		System.out.println("\t\t 1- Soma das Matrizes ");
		System.out.println("\t\t 2- Adicionar uma Constante");
		System.out.println("\t\t 3- Imprimir as Matrizes ");
		System.out.println("\t\t 0- Sair ");
		System.out.println(" Digite sua escolha: ");
		op=ler.nextInt();
		
		do
		{
			switch (op)
			{
			case 0:
				break;
			case 1:
				for (l=0;l<2;l++)
				{
					for (c=0;c<2;c++)
					{
				matriz3[l][c]=matriz1[l][c]+matriz2[l][c];
				System.out.println("Soma: "+matriz3[l][c]);
					}
				}
				break;
			case 2:
				for (l=0;l<2;l++)
				{
					for (c=0;c<2;c++)
					{
						matriz1[l][c]=matriz1[l][c]+num;
						matriz2[l][c]=matriz2[l][c]+num;
						
						System.out.println("Matriz 1: "+matriz1[l][c]);
						System.out.println("Matriz 2: "+matriz2[l][c]);
					}
				}
				break;
			case 3: 
				for (l=0;l<2;l++)
				{
					for (c=0;c<2;c++)
					{
						System.out.println("Matriz 1: "+matriz1[l][c]);
						System.out.println("Matriz 2: "+matriz2[l][c]);
					}
				}
				break;
				default:
					System.out.println("Opção Inválida...");
			}
			
			System.out.println("\t\t Menu de Opções: ");
			System.out.println("\t\t 1- Soma das Matrizes ");
			System.out.println("\t\t 2- Adicionar uma Constante");
			System.out.println("\t\t 3- Imprimir as Matrizes ");
			System.out.println("\t\t 0- Sair ");
			System.out.println(" Digite sua escolha: ");
			op=ler.nextInt();
		}
		while (op!=0);
	}
}


