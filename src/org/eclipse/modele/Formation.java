package org.eclipse.modele;

import java.util.Arrays;

public class Formation {
	private String intitule;
	private int nbrJours;
	private Stagiaire[] stagiaires;
	
	public Formation() {
		super();
	}
	public Formation(String intitule, int nbrJours, Stagiaire ... stagiaires) {
		super();
		this.intitule = intitule;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getNbrJours() {
		return nbrJours;
	}
	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}
	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}
	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}
	public float calculerMoyenneFormation() {
		var somme = 0;
		for(var elt: stagiaires) {
			somme += elt.calculerMoyenne() ;
		} return somme/stagiaires.length;
	}
	
	public int trouverIndiceMax() {
		var indiceMax= 0;
		var max = stagiaires[0].calculerMoyenne();
		for(int i =1; i < stagiaires.length; i++ ) {
			if(max < stagiaires[i].calculerMoyenne()) {
				max = stagiaires[i].calculerMoyenne();
					indiceMax = i;
		}
		} return indiceMax;
	}
	public String trouverNomMax() {
		String nomMax = stagiaires[0].getNom();
		var max = stagiaires[0].calculerMoyenne();
	    for(int i = 1; i < stagiaires.length; i++ ) {
			if(max < stagiaires[i].calculerMoyenne()) {
				max = stagiaires[i].calculerMoyenne();
				 nomMax = stagiaires[i].getNom();
			}
			} return nomMax;
		}
	
		public void trouverMinMax() {
			System.out.println(stagiaires[trouverIndiceMax()].trouverMin());
		}
		
		public float trouverMoyenneParNom(String nom) {
			var found = false;
			int i;
			for (i = 0; i < stagiaires.length && !found; i++) {
				if (stagiaires[i].getNom().equals(nom)) {
					return stagiaires[i].calculerMoyenne();
				}
			}
			return -1;
		}
	
	@Override
	public String toString() {
		return "Formation [intitule=" + intitule + ", nbrJours=" + nbrJours + ", stagiaires="
				+ Arrays.toString(stagiaires) + "]";
	}
	
	
	

}
