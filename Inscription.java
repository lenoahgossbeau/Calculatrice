package fr.etudiants.Etudiants;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Inscription {

	public static void main(String[] args) {
		// PREMIER ETUDIANT
		Etudiants etudiants = new Etudiants();
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre nom:");
		String nom = sc.nextLine();
		etudiants.setNom(nom);
		System.out.println("Saisissez votre classe:");
		String classe = sc.nextLine();
		etudiants.setClasse(classe);
		System.out.println("Saisissez votre age:");
		int age = sc.nextInt();
		etudiants.intAge(age);
		
		List<Etudiants> etudiantsList = new ArrayList<Etudiants>();
	etudiantsList.add(etudiants);
	
	// DEUXIEME ETUDIANT
    sc = new Scanner(System.in);
	System.out.println("Saisissez votre nom:");
    nom = sc.nextLine();
	etudiants.setNom(nom);
	System.out.println("Saisissez votre classe:");
    classe = sc.nextLine();
	etudiants.setClasse(classe);
	System.out.println("Saisissez votre age:");
    age = sc.nextInt();
	etudiants.intAge(age);
	etudiantsList.add(etudiants);
	
	for(Etudiants eleves:etudiantsList);
	System.out.println(" Votre nom est:"+nom+"\nVotre classe est:"+classe+"\nVotre age est:"+age);
	
	
		
	
		
	
	
		

	}

}
