package Her;

public class Cachorro extends Animais {
	public String raca;
	public String cor;
	
	public Cachorro (String nome,int idade, String raca, String cor )
	{
		super (nome, idade);
		this.raca=raca;
		this.cor=cor;
	}

	public String getRaca(String raca) {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor(String cor) {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void printCachorro()
	{
		printAnimais();
		System.out.println("Raça: "+raca+"\nCor: "+cor);
	}
	@Override
	public void somAnimais()
	{
		System.out.println("Este animal faz: AUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
	}
	@Override
	public void correAnimais()
	{
		System.out.println("Esse animal pode atingir até 20km/h");
	}
		
}
