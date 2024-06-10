package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o numero de pessoas: ");
		int n = sc.nextInt();
		
		Dados[] vect = new Dados[n];
		
		System.out.println("Digite nome, idade e altura das pessoas: ");
		for (int i=0; i < vect.length; i++) {
			System.out.println();
			String nome = sc.next();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vect[i] = new Dados(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
			for (int i = 0; i < vect.length; i++) {
				somaAltura += vect[i].getAltura();
			}
			
		double mediaAltura = somaAltura / vect.length;
		
		int idadeMedia = 0;
			for (int i=0; i < vect.length; i++) {
				if (vect[i].getIdade() < 16) {
					idadeMedia++;
				}
			}
		double percentualMenores = ((double)idadeMedia / n) * 100.0;
		
		
		System.out.printf("Altura média: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for (int i=0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
			
		
		sc.close();
	}

}
