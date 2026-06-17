package dia07_listaDeExercicios;
import java.util.Scanner;

public class dia07_lista3Exercicio05_lacoRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int somatoria = 0, qtdNumerosPositivos = 0, numero = 0;
		System.out.println(coresDecoracoesCodigo.CERCA + " SOMATÓRIA DOS NÚMERO INTEIROS POSITIVOS " +coresDecoracoesCodigo.CERCA);
		do {
			System.out.println("Digite um número: ");
			numero = Integer.parseInt(scanner.nextLine());
			if(numero > 0) {
				qtdNumerosPositivos ++;
				somatoria += numero;
			}
		}while(numero != 0);
		System.out.println(coresDecoracoesCodigo.CERCA + " A soma dos "+ qtdNumerosPositivos +" números inteiros positivos é: "+ somatoria + " " + coresDecoracoesCodigo.CERCA);
		scanner.close();
	}

}
