package AtividadeVetor;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		
		int vetorNumero[] = new int[10];
		Scanner leia = new Scanner (System.in);

		int indice, soma = 0;
		float media = 0;
		
		for (indice = 0; indice < 10; indice ++) {
			System.out.println("Digite o " + (indice + 1) + "° número:");
			vetorNumero[indice] = leia.nextInt();	
			soma = soma + vetorNumero[indice];
		
			
		}
		media = soma / 10f;
		
		System.out.print("Elementos nos índices ímpares:");
		for (indice = 0; indice < 10; indice ++) {
			if (indice % 2 != 0) {
				System.out.print(vetorNumero[indice] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Elementos pares:");
		for (indice = 0; indice < 10; indice ++) {
			if (vetorNumero[indice] % 2 == 0) {
				System.out.print(vetorNumero[indice] + " ");
			}
		}
		
		System.out.println();
		
		System.out.println("Média: " + media);
		System.out.println("Soma: " + soma);
		
	
		

	}

}

