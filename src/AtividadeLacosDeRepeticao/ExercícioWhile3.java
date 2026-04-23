package AtividadeLacosDeRepeticao;

import java.util.Scanner;

public class ExercícioWhile3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int  idade = 0, junior = 0, senior = 0;
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade > 0 && idade <= 21 ) {
			junior ++;
			
		}else if (idade >= 50) {
			senior ++;
		}
	}
		System.out.println("Total de pessoas menores de 21 anos: " + junior);
		System.out.println("Total de pessoas maiores de 50 anos: " + senior);

}
}
