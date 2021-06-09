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
	
	public void imprimirInfo()
	{
		System.out.println("Nome: "+getNome()+"\nIdade: "+getIdade()+"\nPelagem: "+pelagem+"\nTreinamento para: "+treinamento);
	}


}
