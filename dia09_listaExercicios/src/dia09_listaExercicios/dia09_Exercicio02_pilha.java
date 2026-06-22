package dia09_listaExercicios;

import java.util.Stack;
import java.util.Scanner;

public class dia09_Exercicio02_pilha {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("_".repeat(21) + " PILHA DE LIVROS " + "_".repeat(22));
		System.out.println(coresDecoracoesCodigo.PONTILHADO.repeat(3));
		System.out.println("\t\t" + "1 - Adicionar Livro na pilha");
		System.out.println("\t\t" + "2 - Listar todos os Livros");
		System.out.println("\t\t" + "3 - Retirar Livro da pilha");
		System.out.println("\t\t" + "0 - Sair");
		System.out.println(coresDecoracoesCodigo.PONTILHADO.repeat(3));
		
		do {
			System.out.println("Entre com a opção desejada: ");
			opcao = Integer.parseInt(scanner.nextLine());
			switch(opcao) {
				case 1:
					System.out.println("Digite o nome:");
					stack.push(scanner.nextLine());
					break;
				case 2:
					System.out.println(stack);
					break;
				case 3:
					stack.pop();
					break;
			}		
		}while(opcao != 0);

	}

}
