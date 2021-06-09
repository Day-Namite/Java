package Objeto;

public class plane {

	public static void main(String args[]) {
	Aviao meuaviao = new Aviao ();
	meuaviao.fabricante = "Boeing";
	meuaviao.modelo = "Boeing 707";
	meuaviao.velocidadeDeRotacao = 0;
	meuaviao.velocidadeDeCruzeiro = 0;
	
	meuaviao.ligar();
	meuaviao.cruzeiro();
	
	meuaviao.aumenta(900);
	System.out.println(meuaviao.velocidadeDeRotacao);
	

	}

}
