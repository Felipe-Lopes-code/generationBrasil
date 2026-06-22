package dia10_praticaAvaliada02;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class dia10_praticaAvaliada02Ex01 {
	
	public static void ColecaoNumeros (Set<Integer> numeros){
		int soma = 0;
		float media;
		int maior = Integer.MIN_VALUE;
		System.out.println(numeros);
		for(Integer numero : numeros) {
			soma += numero;
			if(numero > maior) {
				maior = numero;
			}
		}
		media = (float) soma / numeros.size();
		System.out.println("A média dos valores é: " + media);
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("O maior valor é:" + maior);
		
	}

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Coleção de Números e Análise: ");
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº número: \n", i + 1);
			numeros.add(Integer.parseInt(scanner.nextLine()));
		}
		
		ColecaoNumeros(numeros);
		scanner.close();
	}

}
