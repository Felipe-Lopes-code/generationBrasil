package dia10_praticaAvaliada02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class dia10_praticaAvaliada02Ex02 {
	
	static Scanner scanner = new Scanner (System.in);
	
	static List<Alunos> listaAlunos = new ArrayList<>();
	
	public static void cadastroAluno(int opcao){
		Alunos aluno = new Alunos();
		
		switch(opcao) {
			case 1:
				System.out.println("Digite nome de alunx: ");
				aluno.nome = scanner.nextLine();
				System.out.println("Digite a idade de alunx: ");
				aluno.idade = Integer.parseInt(scanner.nextLine());
				System.out.println("Digite a nota final de alunx: ");
				aluno.notaFinal = Float.parseFloat(scanner.nextLine());
				listaAlunos.add(aluno);
				
				System.out.println("Alunx " + aluno.nome + " cadastrado com sucesso!\n");
				break;
			case 2:
				System.out.println("=== CADASTRO DE ALUNXS ===\n");
				if(listaAlunos.isEmpty()) {
					System.out.println("Não existem alunxs cadastradxs ainda.\n");
				} else {
					for(Alunos cadastro : listaAlunos) {
						System.out.println("Nome: " + cadastro.nome);
						System.out.println("Idade: " + cadastro.idade);
						System.out.println("Nota final: " + cadastro.notaFinal + "\n\n");
						System.out.println("_".repeat(15) + "\n");
					}
				}
				break;
				
			case 3:
				float media, qtdAlunos = 0, somaNotas = 0;
					for(Alunos cadastro : listaAlunos) {
						somaNotas += cadastro.notaFinal;
						qtdAlunos ++;
					}
					media = somaNotas/qtdAlunos;
				System.out.println("A média de todxs alunxs é: " + media + "\n");
				break;
			case 0:
				System.out.println("Saindo do sistema de cadastro de alunos...");
				break;
			default:
                System.out.println("Opção inválida.");
                break;
		}
				
	}
	
	public static void main(String[] args) {
		
		int opcao;
		System.out.println("LISTA DE ALUNOS\n");
		do {
			System.out.println("====== MENU ======");
            System.out.println("1 - Cadastrar Alunx");
            System.out.println("2 - Listar Alunxs");
            System.out.println("3 - Calcular a Média de Todxs Alunxs");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            cadastroAluno(opcao);
		}while(opcao != 0);
		
	}

}
