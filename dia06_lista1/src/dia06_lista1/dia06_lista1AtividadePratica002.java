package dia06_lista1;

import java.util.Scanner;

public class dia06_lista1AtividadePratica002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("********* VERIFICANDO SE O Nº É PAR OU ÍMPAR / POSITIVO OU NEGATIVO *******");
		
		System.out.println("Digite um número: ");
		int numero = Integer.parseInt(scanner.nextLine());
		if(numero%2 == 0) {
			System.out.printf("O número %d é par e ", numero);
		} else {
			System.out.printf("O número %d é ímpar e ", numero);
		}
		if(numero > 0) {
			System.out.println("positivo!");
		} else {
			System.out.println("negativo!");
		}
		
	}

}
