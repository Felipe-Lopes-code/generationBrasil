package dia08_listaDeExercicios;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class dia08_lista1Exercicio01_collectionList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ORDENANDO AS 5 CORES DIGITADAS EM ORDEM ALFABÉTICA: ");
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dº cor: \n", i+1);
			cores.add(scanner.nextLine());
		}
		cores.sort(null);
		System.out.println("ORGANIZAÇÃO EM ORDEM ALFABÉTICA");
		System.out.println(cores);
		scanner.close();
	}

}