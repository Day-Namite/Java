package Her;

public class TesteAnimais {

	public static void main(String[] args) {
		
		System.out.println("Cachorro: ");
		
		Cachorro Pingo = new Cachorro ("Pingo", 6, "Labrador","Marrom" );
		Pingo.imprimirInfo();
		System.out.println("\n");
		
		System.out.println("Cavalo: ");
		
		Cavalo Jesus = new Cavalo ("Jesus", 12, "Hipismo", "Gateado");
		Jesus.imprimirInfo();
		System.out.println("\n");
		
		System.out.println("Pregui�a ");
		
		Preguica Rubao = new Preguica ("Rub�o", 26, 6, 80, "Pregui�a Comum");
		Rubao.imprimirInfo();
		
	}
	
	

}
