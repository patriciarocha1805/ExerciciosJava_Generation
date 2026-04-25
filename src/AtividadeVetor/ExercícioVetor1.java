package AtividadeVetor;

import java.util.Scanner;

public class ExercícioVetor1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int vetorNumero [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		if (numero >= 10) {
			System.out.println("Número não encontrado!");
			}
		
		for(int indice = 0; indice < 10; indice ++) {
			
			if ((numero > 0 && numero < 10) && (vetorNumero[indice] == numero)) {		
				System.out.println("O número " + numero + " está localizado na posição: " + indice);

			}
			
		}
		
	

	}

}
