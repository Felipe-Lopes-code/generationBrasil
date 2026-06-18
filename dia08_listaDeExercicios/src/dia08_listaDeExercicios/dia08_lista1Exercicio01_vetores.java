package dia08_listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class dia08_lista1Exercicio01_vetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] listaNumeros = new int[10];
		int posicao = 0;
		boolean numeroEncotrado = false;
		
		for(int i = 0; i < 10; i++) {
			listaNumeros[i] = random.nextInt(100) + 1;
		}
		
		System.out.println("TESTANDO A SORTE - PROCURANDO UM NÚMERO DENTRO DO VETOR");
		System.out.println("Digite um número de 1 a 100: ");
		int numeroSorteado = Integer.parseInt(scanner.nextLine());
		
		
		for(int i = 0; i < 10; i++) {
			if(numeroSorteado == listaNumeros[i]) {
				posicao = i;
				numeroEncotrado = true;
			}
		}
		
		if(numeroEncotrado == true) {
			System.out.println(coresDecoracoesCodigo.VERDE + "Parabéns! Você encontrou um número presente dentro do vetor." + coresDecoracoesCodigo.RESET);
			System.out.printf("O número %d está na posição %d\n", numeroSorteado, posicao);
		} else { System.out.printf(coresDecoracoesCodigo.VERMELHO + "O número %d não foi encontrado...\n" + coresDecoracoesCodigo.RESET, numeroSorteado);}
		
		System.out.println("Configuração do Vetor:");
		for(int numero : listaNumeros) {
			System.out.print(numero + "\t");
		}
	}
}
