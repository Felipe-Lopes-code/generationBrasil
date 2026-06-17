package dia06_praticaAvaliada01;

import java.util.Scanner;

public class dia06_praticaAvaliada01Ex03_simulacaoCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        coresDecoracoesCodigo decoracao = new coresDecoracoesCodigo();
        System.out.println(decoracao.CERCA + "CALCULADORA" + decoracao.CERCA);
        System.out.println(decoracao.VERDE + "1 - Soma" + decoracao.RESET);
        System.out.println(decoracao.AMARELO + "2 - Subtração" + decoracao.RESET);
        System.out.println(decoracao.VERMELHO + "3 - Multiplicação" + decoracao.RESET);
        System.out.println(decoracao.AZUL + "4 - Divisão" + decoracao.RESET);
        System.out.println((decoracao.CERCA).repeat(3));
        
        System.out.println("Digite o 1º número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());
            
        System.out.println("Digite o 2º número: ");
        double numero2 = Double.parseDouble(scanner.nextLine());
            
        boolean execucao = true;
        int operacao = 0;
        while (execucao == true) {
        	System.out.println("Digite a operação desejada (1 a 4): ");
            operacao = Integer.parseInt(scanner.nextLine());
            if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
            	System.out.println("Opção inválida. Tente novamente.");
            } else {
            	switch (operacao){
                case 1:
                	double soma = numero1 + numero2;
                	System.out.println("Operação escolhida: 1 - Soma ");
                	System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, soma);
                	break;
                case 2:
                	double subtracao = numero1 - numero2;
                	System.out.println("Operação escolhida: 2 - Subtração ");
                	System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, subtracao);
                	break;
                case 3:
                	double multiplicacao = numero1 * numero2;
                	System.out.println("Operação escolhida: 3 - Multiplicação ");
                	System.out.printf("%.2f x %.2f = %.2f", numero1, numero2, multiplicacao);
                	break;
                case 4:
                	while (numero2 == 0) {
                		System.out.println("Não é possível realizar divisão por 0 (Zero). Atribua outro valor ao número 2:");
                		numero2 = Integer.parseInt(scanner.nextLine());
                	}
                	double divisao = numero1 / numero2;
                	System.out.println("Operação escolhida: 4 - Divisão ");
                	System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, divisao);
                	break;
            	}
           		execucao = false;
           	}
        }
        scanner.close();
	}

}
