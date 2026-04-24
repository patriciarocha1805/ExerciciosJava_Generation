package AtividadeLacosDeRepeticao;

import java.util.Scanner;

public class ExercicioWhile4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float media = 0;
		int idade, genero, cargo, backend = 0, mulheresFront = 0, homensMobile40 = 0, 
				naoBinario30 = 0, total = 0, soma = 0;
		String continua = "S";
		
		while (!continua.equalsIgnoreCase("N")) {
		
		System.out.println("Digite a idade do(a) participante: ");
		idade = leia.nextInt();
		soma = soma + idade;
		total ++;
		media = (float) soma / total;
		
		System.out.println("Digite a opção da sua Identidade de Gênero: ");
		genero = leia.nextInt();
		
		switch (genero) {
		case 1:
			System.out.println("Mulher Cis");
			break;
		case 2:
			System.out.println("Homem Cis");
			break;
		case 3:
			System.out.println("Não Binário");
			break;
		case 4:
			System.out.println("Mulher Trans");
			break;
		case 5:
			System.out.println("Homem Trans");
			break;
		case 6:
			System.out.println("Outros");
			break;
		}
		
		System.out.println("Digite a opção da sua área como Pessoa Desenvolvedora: ");
		cargo = leia.nextInt();
		
		switch (cargo){
		case 1:
			System.out.println("Backend");
			backend ++;
			break;
		case 2:
			System.out.println("Frontend");
			if (genero == 1 || genero == 4) {
				mulheresFront ++;
			}
			break;
		case 3:
			System.out.println("Mobile");
			if ((genero == 2 || genero == 5) && (idade >= 40)) {
				homensMobile40 ++;
			}
			break;
		case 4:
			System.out.println("FullStack");
			if ((genero == 3) && (idade <= 30)) {
				naoBinario30 ++;
		} break;
		
		}
		
		System.out.println("Deseja continuar a leitura dos dados de um novo colaborador? (S/N)");
		continua = leia.next();
		
		if (continua.equalsIgnoreCase("N")) {
		
			System.out.println("Quantidade de desenvolvedores Backend: " + backend);
			System.out.println("Quantidade de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFront);
			System.out.println("Quantidade de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
			System.out.println("Quantidade de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinario30);
			System.out.println("Número total de pessoas que responderam à pesquisa: " + total);
			System.out.println("Média de idade de quem respondeu à pesquisa: " + media);
		}
		
		}

}
}
