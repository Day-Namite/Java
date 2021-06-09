//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
package PacoteJava;
import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, m, d, id;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a Quantidade de Anos: ");
		a= ler.nextInt();
		System.out.println("Digite a Quantidade de Meses: ");
		m= ler.nextInt();
		System.out.println("Digite a Quantidade de Dias: ");
		d= ler.nextInt();
		
		id=a*365+m*30+d;
		
		System.out.println("Dias Vividos Até o Momento: "+id);
	}

}
