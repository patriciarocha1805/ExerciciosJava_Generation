package AtividadeEntradaSaida;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("Escreva o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("Escreva o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("Escreva o quarto valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca + ".");
		leia.close();

	}

}
