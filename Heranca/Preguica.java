package Her;

public class Preguica extends Animais {
	private int peso;
	private int altura;
	private String especie;
	
	public Preguica (String nome,int idade,int peso,int altura,String especie)
	{
		super (nome, idade);
		this.peso=peso;
		this.altura=altura;
		this.especie=especie;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Nome: "+getNome()+"\nIdade: "+getIdade()+"\nEspécie: "+especie+"\nPeso: "+peso+"kg"+"\nAltura: "+altura+"cm");
	}


}
