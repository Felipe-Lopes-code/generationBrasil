package dia06_lista1;

import java.util.Scanner;

public class dia06_lista1AtividadePratica001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("********* COMPARANDO TRÊS NÚMEROS ***********");
		
		System.out.println("Digite o 1º número: ");
		int numero1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o 2º número: ");
		int numero2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o 3º número: ");
		int numero3 = Integer.parseInt(scanner.nextLine());
		
		if (numero1 + numero2 > numero3) {
			System.out.printf("A soma do 1º número (%d) e do 2º número (%d) é maior do que o 3º número (%d)\n", numero1, numero2, numero3);
			System.out.printf("%d + %d = %d / %d > %d", numero1, numero2, numero1 + numero2, numero1 + numero2, numero3);
			
		} else if (numero1 + numero2 < numero3) {
			System.out.printf("A soma do 1º número (%d) e do 2º número (%d) é menor do que o 3º número (%d)\n", numero1, numero2, numero3);
			System.out.printf("%d + %d = %d / %d < %d", numero1, numero2, numero1 + numero2, numero1 + numero2, numero3);
			
		} else if (numero1 + numero2 == numero3) {
			System.out.printf("A soma do 1º número (%d) e do 2º número (%d) é igual ao 3º número (%d)\n", numero1, numero2, numero3);
			System.out.printf("%d + %d = %d / %d = %d", numero1, numero2, numero1 + numero2, numero1 + numero2, numero3);
			
		}
		
	}

}
