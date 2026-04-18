package atividadePraticaJava1;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Escreva a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Escreva a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Escreva a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média final: " + media + ".");
		leia.close();

	}

}
