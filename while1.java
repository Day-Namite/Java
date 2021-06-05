package GenEx;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		int age=0, sumpl21=0,sumpm50=0;
		Scanner read =new Scanner (System.in);
		System.out.println("Digite sua idade: ");
		age=read.nextInt();
		
		while (age!=-99)
		{
			if (age>0 && age<21)
			{
				sumpl21++;
			}
			if  (age>50)
			{
				sumpm50++;
			}
			System.out.println("Digite sua idade: ");
			age=read.nextInt();
			
		}
		System.out.printf("\nTotal de Pessoas com menos de 21 anos:%d",sumpl21);
		System.out.printf("\nTotal de Pessoas com mais de 50 anos: %d",sumpm50);
			
		

	}
}
