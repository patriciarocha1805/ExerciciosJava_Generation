package AtividadeLacosDeRepeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, contador, totalPares =  0, totalImpares = 0;
		
		
			for (contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite o " + contador + "° número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
			totalPares ++;
			
		}else if (numero % 2 != 0) {
			totalImpares ++;
		}
			} 
			System.out.println("Total de números pares: " + totalPares);
			System.out.println("Total de números ímpares: " + totalImpares);
		}

	}


