package dia07_listaDeExercicios;

import java.util.Scanner;

public class dia07_lista1Exercicio01_lacoRepeticaoFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		coresDecoracoesCodigo decoracao = new coresDecoracoesCodigo();
		System.out.println(decoracao.CERCA.repeat(4));
		int numero1 = 0, numero2 = 0;
		System.out.println("VERIFICANDO OS MÚLTIPLOS DE 3 E 5 DENTRO DO INTERVALO ESPECIFICADO");
		System.out.println("Digite o primeiro valor: ");
		numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o segundo valor: ");
		numero2 = Integer.parseInt(scanner.nextLine());
		while(numero1 > numero2) {
			System.out.println("O segundo valor deve ser maior que o primeiro para o intervalo ser válido\nDigite novamente o segundo valor: ");
			numero2 = Integer.parseInt(scanner.nextLine());
		}
		System.out.printf("No intervalo de %d e %d, são múltiplos de 3 e 5: \n", numero1, numero2);
		for(int i = numero1; i <= numero2; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(decoracao.VERDE + i + decoracao.RESET);
			}
		}
		scanner.close();
	}

}
