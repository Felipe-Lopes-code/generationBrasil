package dia08_listaDeExercicios;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class dia08_lista2Exercicio03_collectionSet {

	public static void main(String[] args) {
		Set<Integer> conjuntoNumeros = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(coresDecoracoesCodigo.PONTILHADO.repeat(3));
		System.out.println("VERIFICANDO VALORES - COLLECTION SET");
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: \n", i+1);
			conjuntoNumeros.add(scanner.nextInt());
		}
		Iterator<Integer> iterator = conjuntoNumeros.iterator();
		
		System.out.println(coresDecoracoesCodigo.PONTILHADO.repeat(3));
		System.out.println("Listar dados do Set: \n" + conjuntoNumeros);
		
		System.out.println(coresDecoracoesCodigo.PONTILHADO.repeat(3));
		System.out.println("Listar dados do Set (Utilizando ITERATOR): ");
		while (iterator.hasNext()) {

		    System.out.print(iterator.next() + "\t");
		}
		System.out.println("");
		scanner.close();
	}

}
