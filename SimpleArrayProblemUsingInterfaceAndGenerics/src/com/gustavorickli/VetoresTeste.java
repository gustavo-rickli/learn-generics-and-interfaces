package com.gustavorickli;

import java.util.Random;

public class VetoresTeste {
	
	private static final int CAPACITY = 10;

	public static void main(String[] args) {
		
		// Scanner scan = new Scanner(System.in);
		Random rand = new Random(); 
		
		Integer []numerosInteiros = new Integer[CAPACITY];
		
		// maior, menos, soma, media
		
		int maior, menor, soma = 0, mediaAritmetica;
		
		numerosInteiros[0] = rand.nextInt(100) + 1;
		
		maior = numerosInteiros[0];
		menor = numerosInteiros[0];
		
		for (int i = 1; i < numerosInteiros.length; i++) {
			numerosInteiros[i] = rand.nextInt(100) + 1;
			
			soma += numerosInteiros[i];
			
			if (maior < numerosInteiros[i]) {
				maior = numerosInteiros[i];
			}
			
			if (menor > numerosInteiros[i]) {
				menor = numerosInteiros[i];
			}
		}
		
		mediaAritmetica = soma / numerosInteiros.length;
		
		// valores maiores que a Media
		// valores menores que a Media
		// Valores iguais a media
	
		IntegerArraysEquivalent maioresQueMedia = new IntegerArraysEquivalent(CAPACITY);
		IntegerArraysEquivalent menoresQueMedia = new IntegerArraysEquivalent(CAPACITY);
		IntegerArraysEquivalent iguaisA_Media = new IntegerArraysEquivalent(CAPACITY);
		
		for (int i = 0; i < CAPACITY; i++) {

			if (numerosInteiros[i] == mediaAritmetica) {
				iguaisA_Media.add(numerosInteiros[i], i);
			}
			
			if (numerosInteiros[i] > mediaAritmetica) {
				maioresQueMedia.add(numerosInteiros[i], i);
			}
			
			if (numerosInteiros[i] < mediaAritmetica) {
				menoresQueMedia.add(numerosInteiros[i], i);
			}
		
		}
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.printf("%d\t", numerosInteiros[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.printf("%d\t", i);
		}
		
		System.out.printf("\n\n");
		
		System.out.printf("Media: %d\n", mediaAritmetica);
		
		for (int i = 0; i < maioresQueMedia.getIndexLength(); i++) {
			System.out.printf("%d\t", maioresQueMedia.get(i));
		}
		
		System.out.println("");
		
		for (int i = 0; i < maioresQueMedia.getIndexLength(); i++) {
			System.out.printf("%d\t", maioresQueMedia.getIndexReferenceOf(i));
		}
		
	}

}
