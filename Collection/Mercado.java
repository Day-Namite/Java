/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java
 para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.*/

package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int opcao;
			
		ArrayList <String> estoque=new ArrayList <String> ();
		
		do
		{
			System.out.println("Digite uma das opções do menu:");
			System.out.println("\n-------------------------------------------");
			System.out.println("[1] Mostrar Produtos Cadastrados"+"\n[2] Cadastrar Produto"+"\n[3] Alterar Produto Cadastrado"+
					"\n[4] Remover Produto"+"\n[0] Sair");
			
			opcao=ler.nextInt();
			
			switch (opcao)
			{
			
			case 1: 
				System.out.println("Produtos Cadastrados: ");
				System.out.println(estoque);
				
				break;
			
			case 2:
				ler.nextLine();
				System.out.println("Insira os dados do produto: ");
				 String produto = ler.nextLine();
				 if(estoque.contains(produto))
					{
						System.out.println("Produto já cadastrado!");
					}
					else
					{
						estoque.add(produto);
						System.out.println("Produto Cadastrado com sucesso!");
					}
				
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("Insira o produto que deseja alterar: ");
				String verificar=ler.nextLine();
				System.out.println("Insira os dados do produto que substituirá "+verificar+":");
				String novo = ler.nextLine();
				System.out.println("Produto Alterado com Sucesso!");
				
				if (estoque.contains(verificar))
				{
					estoque.remove(verificar);
					estoque.add(novo);
				}
				else
				{
					System.out.println("Produto não cadastrado...");
				}
				
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("Insira o produto que deseja remover: ");
				String item = ler.nextLine();
				if(estoque.contains(item))
				{
					estoque.remove(item);
					System.out.println("Produto Removido com sucesso!");
				}
				else
				{
					System.out.println("Produto não cadastrado...");
				}
				break;
				
				default:
					
					System.out.println("Programa Finalizado...");
			}
		}
			while (opcao!=0);
		
		}
	}



	


