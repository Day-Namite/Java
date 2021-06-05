package GenEx;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		int num=0, soma=0;
		Scanner leia = new Scanner (System.in);
		System.out.println("Para encerrar digite 0");
		
		do 
		{
		System.out.println("Digite um número: ");
		num=leia.nextInt();
		soma+=num;
		}
		
		while (num!=0);
		
		System.out.println("Soma dos valores inseridos: "+soma);


	}

}
