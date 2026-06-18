package dia08_listaDeExercicios;

import java.util.Random;
import java.util.Scanner;

public class dia08_lista2Exercicio03_matrizes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[][] matrizNumeros = new int[3][3];
		int[] numerosDiagonalPrincipal = new int [3], numerosDiagonalSecundaria = new int [3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0, proporcaoMatriz = 3;
		
		System.out.println(coresDecoracoesCodigo.CERCA + "   ANALISANDO A MATRIZ   " + coresDecoracoesCodigo.CERCA + "\n");
		for(int linha = 0; linha < 3; linha++) {
			System.out.print("\t\t|\t");
			for(int coluna = 0; coluna < 3; coluna++) {
				matrizNumeros[linha][coluna] = random.nextInt(100) + 1;
				System.out.print(matrizNumeros[linha][coluna] + "\t");
				if(linha == coluna) {
					numerosDiagonalPrincipal[linha] = matrizNumeros[linha][coluna];
					somaDiagonalPrincipal += matrizNumeros[linha][coluna];
				}
				if(linha + coluna == proporcaoMatriz - 1) {
					numerosDiagonalSecundaria[linha] = matrizNumeros[linha][coluna];
					somaDiagonalSecundaria += matrizNumeros[linha][coluna];
				}
			}
			System.out.println("|\n");
			
		}
		
		System.out.println(coresDecoracoesCodigo.CERCA.repeat(4) + "\n");
		System.out.println("Valores da Diagonal Principal: ");
		for(int diagonalPrincipal : numerosDiagonalPrincipal) {
			System.out.print(coresDecoracoesCodigo.AMARELO + diagonalPrincipal + "\t");
		}
		System.out.println(coresDecoracoesCodigo.RESET + "\nSomatória dos valores da Diagonal Principal: " + coresDecoracoesCodigo.VERDE + somaDiagonalPrincipal);
		
		System.out.println("\n" + coresDecoracoesCodigo.CERCA.repeat(4) + "\n");
		System.out.println("Valores da Diagonal Secundária: ");
		for(int diagonalSecundaria : numerosDiagonalSecundaria) {
			System.out.print(coresDecoracoesCodigo.AMARELO + diagonalSecundaria + "\t");
		}
		System.out.println(coresDecoracoesCodigo.RESET + "\nSomatória dos valores da Diagonal Secundária: " + coresDecoracoesCodigo.VERDE + somaDiagonalSecundaria + coresDecoracoesCodigo.RESET);
		
		

	}

}
