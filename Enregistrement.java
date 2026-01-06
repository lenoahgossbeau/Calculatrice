package fr.enregistrementelevesetudiants.enregistrement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Enregistrement {

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
		etudiants.setAge(age);
		
		List<Etudiants> etudiantList = new ArrayList<Etudiants> ();
		
		etudiantList.add(etudiant);
		
		//DEUXIEME ETUDIANT
		
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
		etudiants.setAge(age);
		
		List<Etudiants> etudiantsList = new ArrayList<Etudiants> ();
		
		etudiantList.add(etudiant);
		
		for(Etudiants eleve: etudiantList);
		System.out.println("Votre nom est:"+eleves.getNom()+"\nVotre classe est:"+eleves.getClasse()+"\nVotre age est:"+eleves.getAge());
		

	}

}
