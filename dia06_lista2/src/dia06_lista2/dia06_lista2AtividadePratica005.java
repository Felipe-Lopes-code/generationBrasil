package dia06_lista2;

import java.util.Scanner;

public class dia06_lista2AtividadePratica005 {

	public static void main(String[] args) {
		System.out.println("+++++++++++++++++++++++++++++++ COMPRAS +++++++++++++++++++++++++++++++\n");
		System.out.println("Código do produto \tProduto \t\t\tPreço unitário");
		System.out.println("\t1 \t\tCachorro Quente \t\tR$10.00");
		System.out.println("\t2 \t\tX-Salada \t\t\tR$15.00");
		System.out.println("\t3 \t\tX-Bacon \t\t\tR$18.00");
		System.out.println("\t4 \t\tBauru \t\t\t\tR$12.00");
		System.out.println("\t5 \t\tRefrigerante \t\t\tR$8.00");
		System.out.println("\t6 \t\tSuco de laranja \t\tR$13.00");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int codigoProduto = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite a quantidade que deseja: ");
		int quantidadeProduto = Integer.parseInt(scanner.nextLine());
		
		float valorTotal = 0;
		float precoCachorroQuente = 10, precoXSalada = 15, precoXBacon = 18, precoBauru =12, precoRefrigerante = 8, precoSucoLaranja = 13;
		String produto = "";
		
		switch (codigoProduto) {
			case 1:
				produto = "Cachorro Quente";
				valorTotal = quantidadeProduto * precoCachorroQuente;
				break;
			case 2:
				produto = "X-Salada";
				valorTotal = quantidadeProduto * precoXSalada;
				break;
			case 3:
				produto = "X-Bacon";
				valorTotal = quantidadeProduto * precoXBacon;
				break;
			case 4:
				produto = "Bauru";
				valorTotal = quantidadeProduto * precoBauru;
				break;
			case 5:
				produto = "Refrigerante";
				valorTotal = quantidadeProduto * precoRefrigerante;
				break;
			case 6:
				produto = "Suco de laranja";
				valorTotal = quantidadeProduto * precoSucoLaranja;
				break;
					
		}
		
		System.out.printf("Você selecionou %d unidade(s) de %s. O valor total é R$ %.2f", quantidadeProduto, produto, valorTotal);
		
		scanner.close();
	}

}
