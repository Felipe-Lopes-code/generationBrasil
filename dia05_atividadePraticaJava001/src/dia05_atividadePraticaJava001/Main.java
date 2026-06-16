package dia05_atividadePraticaJava001;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("++++++ CALCULANDO O NOVO SALÁRIO +++++++ \n");
			
		System.out.println("Digite o Salário: ");
		double salario = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Digite o abono: ");
		double abono = Double.parseDouble(scanner.nextLine());
		
		double novoSalario = salario + abono;
			
		System.out.println("Seu novo salário é: R$" + novoSalario);
		System.out.println("++++++++++++++++++++++++++++++++++++++++ \n");
		scanner.close();
			
	}


}