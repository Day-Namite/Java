//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
package PacoteJava;

import java.util.Scanner;

public class DiasEmIdade {
	public static void main(String[] args) {
	
	int a,m,d,id;
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Insira sua idade em Dias: ");
	id=ler.nextInt();
	
	a=id/365;
	System.out.println("Quantidade de Anos: "+a);
	
	m=(id%365)/30;
	System.out.println("Quantidade de Meses: "+m);
	
	d=(id%365)%30;
	System.out.println("Quantidade de Dias: "+d);
	
	}
}
