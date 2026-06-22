package dia10_praticaAvaliada02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class dia10_praticaAvaliada02Ex03 {

	static Scanner scanner = new Scanner (System.in);
	
	static List<ControleEstoque> listaProdutos = new ArrayList<>();
	
	public static void gerenciarEstoque (int opcao){
		ControleEstoque produto = new ControleEstoque();
		
		switch(opcao) {
			case 1:
				System.out.println("Digite o nome do produto: ");
				produto.nomeProduto = scanner.nextLine();
				System.out.println("Digite a quantidade do produto em estoque:  ");
				produto.qtdEstoque = Integer.parseInt(scanner.nextLine());
				listaProdutos.add(produto);
				
				System.out.println("Produto " + produto.nomeProduto + " cadastrado com sucesso!\n");
				break;
			case 2:
				System.out.print("Digite o nome do produto que deseja alterar a quantidade: ");
                String verificaNomeProduto = scanner.nextLine();
                boolean produtoEncontrado = false;
                
                for (ControleEstoque p : listaProdutos) {
                    if (p.nomeProduto.equalsIgnoreCase(verificaNomeProduto)) {
                        System.out.print("Produto encontrado! Digite a nova quantidade: ");
                        p.qtdEstoque = Integer.parseInt(scanner.nextLine());
                        System.out.println("Quantidade atualizada com sucesso!\n");
                        produtoEncontrado = true;
                        break;
                    }
                }
                
                if (!produtoEncontrado) {
                    System.out.println("Produto não encontrado.\n");
                }
                break;
			case 3:
				System.out.println("=== PRODUTOS EM ESTOQUE ===\n");
				if(listaProdutos.isEmpty()) {
					System.out.println("Não existem produtos cadastrados ainda.\n");
				} else {
					for(ControleEstoque cadastro : listaProdutos) {
						System.out.println("Nome do Produto: " + cadastro.nomeProduto);
						System.out.println("Quantidade em Estoque: " + cadastro.qtdEstoque + "\n\n");
						System.out.println("_".repeat(15) + "\n");
					}
				}
				break;
			case 0:
				System.out.println("Saindo do sistema de estoque de produtos...");
				break;
			default:
                System.out.println("Opção inválida.");
                break;
		}
				
	}
	
	public static void main(String[] args) {
		
		int opcao;
		System.out.println("ESTOQUE DE PRODUTOS\n");
		do {
			System.out.println("====== GERENCIAMENTO DO ESTOQUE ======");
            System.out.println("1 - Adicionar um novo produto");
            System.out.println("2 - Atualizar a quantidade de um produto existente");
            System.out.println("3 - Listar todos os produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            gerenciarEstoque(opcao);
		}while(opcao != 0);
		
	}

}
