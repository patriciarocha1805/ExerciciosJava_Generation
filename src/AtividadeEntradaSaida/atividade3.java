package AtividadeEntradaSaida;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor de Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor de Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("Salário Líquido: " + salarioLiquido + " reais.");
		
		leia.close();

	}

}

