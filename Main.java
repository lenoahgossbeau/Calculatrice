package fr.inscription.etudiants;

import java.util.Scanner;

public class Main {
	public class Etudiants {

	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre nom:");
		String nom = sc.nextLine();
		System.out.println("Saisissez votre classe:");
		String classe = sc.nextLine();
		System.out.println("Saisissez votre age");
		int age = sc.nextInt();
		System.out.println(" Votre nom est:"+nom+"\nVotre classe est:"+classe+"\nVotre age est:"+age);
		
	}
		// TODO Auto-generated method stub

	}

}
