package dia06_praticaAvaliada01;

import java.util.Scanner;

public class dia06_praticaAvaliadaEx01_analiseIdadeAcesso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		coresDecoracoesCodigo cerca = new coresDecoracoesCodigo();
		
		System.out.println(cerca.CERCA + " Autorização de Acesso "+ cerca.CERCA);
		System.out.println("Verificação de acesso de acesso com base nos dados digitados");
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a sua idade:");
		int idade = Integer.parseInt(scanner.nextLine());
		boolean autorizacao = true;
		if(idade < 18) {
			System.out.println("Digite se possui autorização (true - se tiver autorização; false - se não tiver autorização): ");
			autorizacao = Boolean.parseBoolean(scanner.nextLine());
			if(autorizacao == false) {
				System.out.println("Acesso negado para " + nome);
			} else {
				System.out.println("Acesso liberado com autorização para " + nome);
			}
		} else {
			System.out.println("Acesso liberado para " + nome);
		}
		
		scanner.close();
	}

}
