package Her;

import java.util.Scanner;

public class TesteAnimais {

	public static void main(String[] args) {
		
		String n;
		int op;
		
		Scanner ler= new Scanner (System.in);
		
		System.out.println("Selecione um animal de acordo com o menu: ");
		System.out.println("\n1-Cachorro");  
		System.out.println("\n2-Cavalo");
		System.out.println("\n3-Preguiça");
		op=ler.nextInt();
		
		switch (op)
		
		{
		case 1:
			System.out.println("\nQual a raça do Cachorro?");
			String raca= ler.next();
			System.out.println("\nQual a cor do Cachorro?");
			String cor= ler.next();
			
			Cachorro cachorro = new Cachorro("Marcelino", 3, raca, cor);
			cachorro.printCachorro();
			cachorro.somAnimais();
			cachorro.correAnimais();
			
			break;
		
	case 2:
		System.out.println("\nQual o tipo de Pelagem do Cavalo?");
		String pelagem= ler.next();
		System.out.println("\nQue treinamento o Animal Recebeu?");
		String treinamento= ler.next();
		
		Cavalo cavalo = new Cavalo ("Jesus", 15, pelagem, treinamento);
		cavalo.printCavalo();
		cavalo.somAnimais();
		cavalo.correAnimais();
		
		break;
		
	case 3:
		System.out.println("\nPaís de Origem?");
		String origem= ler.next();
		System.out.println("\nQual a Espécie do animal?");
		String especie= ler.next();
		
		Preguica preguica = new Preguica ("Rubão", 26, origem, especie );
		preguica.printPreguica();
		preguica.somAnimais();
		preguica.correAnimais();
		
		break;
		
		default:
		
		System.out.println("\nOpção inválida");
	}
	
	}

}
