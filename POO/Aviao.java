package Objeto;

public class Aviao {
	
/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/
	
	String modelo;
	String fabricante;
	double velocidadeDeRotacao;
	double velocidadeDeCruzeiro;
	
	void ligar()
	{
		System.out.println("Avi�o Ligado");
	}
	
	void aumenta (double quantidade)
	{
		double velocidadenova = this.velocidadeDeRotacao+quantidade;
		this.velocidadeDeRotacao=velocidadenova;
	}
	int cruzeiro()
	{
		if (this.velocidadeDeRotacao<0)
		{
			//System.out.println("Avi�o Atingiu V1!");
			return-1;
		}
		if (this.velocidadeDeRotacao>=203 && this.velocidadeDeRotacao<=278)
		{
			System.out.println("Avi�o Pronto Para Decolagem!");
			return 1;
		}
		return 2;
	}

}
