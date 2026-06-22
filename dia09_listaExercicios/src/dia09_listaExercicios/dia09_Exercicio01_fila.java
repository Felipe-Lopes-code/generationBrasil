package dia09_listaExercicios;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class dia09_Exercicio01_fila {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("__".repeat(11) + "FILA DE CLIENTES" + "__".repeat(11));
		System.out.println(coresDecoracoesCodigo.CERCA.repeat(3));
		System.out.println("\t\t" + "1 - Adicionar Cliente na Fila");
		System.out.println("\t\t" + "2 - Listar todos os Clientes");
		System.out.println("\t\t" + "3 - Retirar Cliente da Fila");
		System.out.println("\t\t" + "0 - Sair");
		System.out.println(coresDecoracoesCodigo.CERCA.repeat(3));
		
		do {
			System.out.println("Entre com a opção desejada: ");
			opcao = Integer.parseInt(scanner.nextLine());
			switch(opcao) {
				case 1:
					System.out.println("Digite o nome:");
					queue.offer(scanner.nextLine());
					break;
				case 2:
					System.out.println(queue);
					break;
				case 3:
					queue.poll();
					break;
			}		
		}while(opcao != 0);
		
		
	}

}
