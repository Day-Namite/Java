package Objeto;

public class Func {

	public static void main(String args []) {
		Funcionario funci= new Funcionario();
		funci.setNome("Daisy");
		funci.setSalario(3600);
		
		System.out.println(funci.getNome());
		System.out.println(funci.getSalario());
	}

}
