package Objeto;

public class Aviao {
	
/*2) Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	String modelo;
	String fabricante;
	double velocidadeDeRotacao;
	double velocidadeDeCruzeiro;
	
	void ligar()
	{
		System.out.println("Avião Ligado");
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
			//System.out.println("Avião Atingiu V1!");
			return-1;
		}
		if (this.velocidadeDeRotacao>=203 && this.velocidadeDeRotacao<=278)
		{
			System.out.println("Avião Pronto Para Decolagem!");
			return 1;
		}
		return 2;
	}

}
