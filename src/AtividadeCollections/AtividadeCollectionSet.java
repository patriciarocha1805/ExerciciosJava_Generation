package AtividadeCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeCollectionSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

        int num;

        while (numeros.size() < 10) {
            System.out.println("Digite um número:");
            num = leia.nextInt();

            if (numeros.contains(num)) {
                System.out.println("Número repetido! Tente novamente:");
            } else {
                numeros.add(num);
            }
        }

        System.out.println("Listar Dados do Set: ");

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
