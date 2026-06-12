package dia05_atividadePraticaJava002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		
		System.out.println("++++++ CALCULANDO MÉDIA +++++++ \n\nDigite as suas notas a seguir:\n");
		for(int contador = 1; contador < 5; contador++) {
			System.out.printf("Nota %d: \n", contador);
			
			switch(contador) {
				case 1:
					nota1 = Double.parseDouble(scanner.nextLine());
					break;
				case 2:
					nota2 = Double.parseDouble(scanner.nextLine());
					break;
				case 3:
					nota3 = Double.parseDouble(scanner.nextLine());
					break;
				case 4:
					nota4 = Double.parseDouble(scanner.nextLine());
					break;
			}
			
		}
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média: " + media);
		scanner.close();

	}

}
