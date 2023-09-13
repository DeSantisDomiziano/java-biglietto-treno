package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//RACCOLGO I DATI
		System.out.print("Scrivi quanti km devi fare: ");
		int km = sc.nextInt();
		
		System.out.print("Quanti anni hai?:  ");
		byte età = sc.nextByte();
		
		//CHIUDO LO SCANNER
		sc.close();
		
		//CALCOLO PREZZO
		double prezzoPieno = 0.21 * km;
		double prezzoScontato = prezzoPieno;
		
		//CALCOLO SCONTO
		if(età < 18) {
			prezzoScontato *= 0.8;
			
		} else if(età >= 65) {
			prezzoScontato *= 0.6;
			
		}
		
		//OUTPUT PER L'UTENTE
		System.out.println("Il prezzo del tuo biglietto è: " + (String.format("%.02f", prezzoScontato)) + " €");
	}

}
