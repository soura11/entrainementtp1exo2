package org.eclipse.test;

import org.eclipse.modele.Formation;
import org.eclipse.modele.Stagiaire;

public class Main {

	public static void main(String[] args) {
		
		Stagiaire stagiaire1 = new Stagiaire("Damien", 12f, 13f, 15f, 17f);
		Stagiaire stagiaire2 = new Stagiaire("Eric", 19f, 18f, 15f);
		System.out.println(stagiaire1);
		System.out.println(stagiaire2);
		System.out.println(stagiaire1.calculerMoyenne());
		System.out.println(stagiaire2.calculerMoyenne());
		System.out.println(stagiaire1.trouverMax());			
		System.out.println(stagiaire2.trouverMax());  
		System.err.println(stagiaire1.trouverMin());
		System.err.println(stagiaire2.trouverMin());
		
		Formation formation = new Formation("POEC", 57, new Stagiaire("Sou", 17, 18, 16, 17), new Stagiaire("Rou", 18, 11, 13,15));
		System.out.println(formation);
		
		System.out.println(formation.trouverIndiceMax());
		System.out.println(formation.trouverNomMax());
		formation.trouverMinMax();
		
		System.out.println(formation.trouverMoyenneParNom("Rou"));
	

	}

}
