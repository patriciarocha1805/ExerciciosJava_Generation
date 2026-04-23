package AtividadeLacosDeRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, soma = 0;
		float media = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
			soma = soma + numero;
			
			}
			
		} while (numero != 0);
		
		media = soma / 2f;
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	}

}
