package dia06_praticaAvaliada01;

import java.util.Scanner;

public class dia06_praticaAvaliada01Ex02_classificacaoNotaAluno {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        coresDecoracoesCodigo decoracao = new coresDecoracoesCodigo();
	        System.out.println(decoracao.PONTILHADO + "CLASSIFICAÇÃO DE NOTAS" + decoracao.PONTILHADO);
	        System.out.println(decoracao.VERDE + "Nota maior ou igual a 7 -> APROVADO" + decoracao.RESET);
	        System.out.println(decoracao.AMARELO + "Nota maior ou igual a 5 e menor que 7 -> RECUPERAÇÃO" + decoracao.RESET);
	        System.out.println(decoracao.VERMELHO + "Nota menor que 5 -> REPROVADO" + decoracao.RESET);
	        System.out.println((decoracao.PONTILHADO).repeat(3));
	        
	        System.out.println("Digite o seu nome: ");
	        String nome = scanner.nextLine();
	        
	        System.out.println("Digite a sua nota: ");
	        double nota = Double.parseDouble(scanner.nextLine());
	        
	        System.out.println(decoracao.PONTILHADO + "Situação do aluno" + decoracao.PONTILHADO);
	        System.out.println("Aluno: " + nome);
	        if(nota >= 7) {
	        	System.out.println("Situação: " + decoracao.VERDE + "APROVADO" + decoracao.RESET);
	        } else if (nota < 7 && nota >=5) {
	        	System.out.println("Situação: " + decoracao.AMARELO + "RECUREPAÇÃO" + decoracao.RESET);
	        } else if (nota < 5) {
	        	System.out.println("Situação: " + decoracao.VERMELHO + "REPROVADO" + decoracao.RESET);
	        }
	    }
}
