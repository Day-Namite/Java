package Her;

public abstract class Animais {
	
	public String nome;
	public int idade;
	
	public Animais (String nome, int idade)
	
	{
		this.nome=getNome(nome);
		this.idade=getIdade(idade);
	}
	

	public String getNome(String nome) {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade(int idade) {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void printAnimais() 
	{
		System.out.println("Nome do Animal: "+nome+ "\nIdade: "+idade);
	}
	
	abstract public void somAnimais ();
	abstract public void correAnimais ();
	
}


