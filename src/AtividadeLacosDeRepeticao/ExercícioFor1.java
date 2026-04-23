package AtividadeLacosDeRepeticao;

import java.util.Scanner;

public class ExercícioFor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, contador;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num1 < num2) {
			System.out.println("No intervalo entre 10 e 100: \n");
				for (contador = num1; contador <= num2; contador ++) {
					if(contador %15 == 0) {
					System.out.println(contador + " é multiplo de 3 e 5");
		
		} 
		} 

	} else
		System.out.println("Intervalo inválido!");
}
		}

