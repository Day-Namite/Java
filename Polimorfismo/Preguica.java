package Her;

public class Preguica extends Animais {
	private String origem;
	private String especie;
	
	public Preguica (String nome,int idade, String origem,String especie)
	{
		super (nome, idade);
		this.origem=origem;
		this.especie=especie;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void printPreguica()
	{
		printAnimais();
		System.out.println("Origem do animal: "+origem+"\nEspécie: "+especie);
	}
	@Override
	public void somAnimais()
	{
		System.out.println("Este animal faz: AAAAAAAAAAAAAAAAH AAAAAAAAAAAAAAAAH!");
	}
	@Override
	public void correAnimais()
	{
		System.out.println("Esse animal pode atingir até 0,27km/h");
	}



}
