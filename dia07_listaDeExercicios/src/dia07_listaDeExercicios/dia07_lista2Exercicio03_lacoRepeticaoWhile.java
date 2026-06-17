package dia07_listaDeExercicios;

import java.util.Scanner;

public class dia07_lista2Exercicio03_lacoRepeticaoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		coresDecoracoesCodigo decoracao = new coresDecoracoesCodigo();
		System.out.println(decoracao.PONTILHADO.repeat(5));
		System.out.println("Verificando quantas pessoas possuem idade menor do que 21 ou maior do que 50 anos");
		System.out.println(decoracao.PONTILHADO.repeat(5));
		
		int idade = 0, idadeAbaixoDe21 = 0, idadeAcimaDe50 = 0, qtdPessoas = 0;
		
		while(idade != -1) {
			System.out.println("Digite uma idade: ");
			idade = Integer.parseInt(scanner.nextLine());
			if(idade < 21 && idade != -1) {
				idadeAbaixoDe21 += 1;
			}
			if(idade > 50) {
				idadeAcimaDe50 += 1;
			}
			if(idade != -1) {
				qtdPessoas += 1;
			}
		}
		System.out.println(decoracao.AMARELO + "Total de pessoas: " + qtdPessoas + decoracao.RESET);
		System.out.println(decoracao.VERMELHO + "Total de pessoas menores de 21 anos: " + idadeAbaixoDe21 + decoracao.RESET);
		System.out.println(decoracao.VERDE + "Total de pessoas maiores de 50 anos: " + idadeAcimaDe50 + decoracao.RESET);
		scanner.close();
	}
}
