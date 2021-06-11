package Her;

public class Cavalo extends Animais {
	private String pelagem;
	private String treinamento;
	
	public Cavalo (String nome,int idade, String treinamento, String pelagem)
	{
		super(nome, idade);
	this.treinamento=treinamento;
	this.pelagem=pelagem;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getTreinamento() {
		return treinamento;
	}

	public void setTreinamento(String treinamento) {
		this.treinamento = treinamento;
	}
	
	public void printCavalo ()
	{
		printAnimais();
		System.out.println("Pelagem do animal: "+pelagem+"\nTreinado para: "+treinamento);
	}
	
	@Override
	public void somAnimais()
	{
		System.out.println("Este animal faz: Iiiiiiihohohoho!");
	}
	@Override
	public void correAnimais()
	{
		System.out.println("Esse animal pode atingir até 88km/h");
	}


}
