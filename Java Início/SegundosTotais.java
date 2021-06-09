//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
package PacoteJava;

import java.util.Scanner;

public class SegundosTotais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h, m, s, st;
		Scanner ler=new Scanner (System.in);
		
		System.out.println("Digite Quantos Segundos Duraram a Festa: ");
		st=ler.nextInt();
		
		System.out.println("O Evento Durou: ");
		h=st/3600;
		System.out.println(h+" "+"Hora(s)");
		
		m=(st/3600)/60;
		System.out.println(m+" "+"Minuto(s)");
		
		s=(st%3600)%60;
		System.out.println(s+" "+"Segundo(s)");

	}

}
