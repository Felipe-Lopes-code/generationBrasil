package dia06_lista2;

import java.util.Scanner;

public class dia06_lista2AtividadePratica006 {

	public static void main(String[] args) {
		
		double salarioReajustado = 0;
		double reajusteGerente = 0.1, reajusteVendedor = 0.07, reajusteSupervisor = 0.09, reajusteMotorista = 0.06, reajusteEstoquista = 0.05, reajusteTecnicoTI = 0.08;
		String cargo = "";
		
		System.out.println("+++++++++++++++++++++++++++++++ TABELA DE REAJUSTE POR CARGO +++++++++++++++++++++++++++++++\n");
		System.out.println("Código do Cargo \tCargo \t\t\tPercentual do Reajuste");
		System.out.println("1 \t\t\tGerente \t\t10%");
		System.out.println("2 \t\t\tVendedor \t\t7%");
		System.out.println("3 \t\t\tSupervisor \t\t9%");
		System.out.println("4 \t\t\tMotorista \t\t6%");
		System.out.println("5 \t\t\tEstoquista \t\t5%");
		System.out.println("6 \t\t\tTécnico de TI \t\t8%");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		String nomeColaborador = scanner.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		int codigoCargo = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o salário: ");
		double salarioInicial = Double.parseDouble(scanner.nextLine());
		
		
		switch (codigoCargo) {
			case 1:
				cargo = "Gerente";
				salarioReajustado = salarioInicial + salarioInicial * reajusteGerente;
				break;
			case 2:
				cargo = "Vendedor";
				salarioReajustado = salarioInicial + salarioInicial * reajusteVendedor;
				break;
			case 3:
				cargo = "Supervisor";
				salarioReajustado = salarioInicial + salarioInicial * reajusteSupervisor;
				break;
			case 4:
				cargo = "Motorista";
				salarioReajustado = salarioInicial + salarioInicial * reajusteMotorista;
				break;
			case 5:
				cargo = "Estoquista";
				salarioReajustado = salarioInicial + salarioInicial * reajusteEstoquista;
				break;
			case 6:
				cargo = "Técnico de TI";
				salarioReajustado = salarioInicial + salarioInicial * reajusteTecnicoTI;
				break;
					
		}
		System.out.println("\n+++++++++++++++++++++++++++++++++++ ATUALIZAÇÃO SALARIAL +++++++++++++++++++++++++++++++++++\n");
		System.out.printf("Nome do Colaborador: %s \nCargo: %s \nNovo salário: %.2f", nomeColaborador, cargo, salarioReajustado);
	}

}
