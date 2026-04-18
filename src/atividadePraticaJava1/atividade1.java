package atividadePraticaJava1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		float salarioAtual, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário atual: ");
		salarioAtual = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salarioAtual + abono;
		
		System.out.println("Novo Salário: " + novoSalario + ".");
		
		leia.close();

	}

}
