package AtividadeCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeCollectionArraylist {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
        
        
        ArrayList<String> cores = new ArrayList<String>();

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Digite a " + (contador + 1) + "° cor");
            String corDigitada = leia.nextLine();
            cores.add(corDigitada); 
        }

        System.out.println("Listar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("Ordenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        
    }


	}


