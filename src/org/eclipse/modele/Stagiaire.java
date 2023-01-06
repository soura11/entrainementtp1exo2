package org.eclipse.modele;

import java.util.Arrays;

public class Stagiaire {
	private String nom;
	private float[] notes;
	

	
	public Stagiaire() {
		super();
	}
	
	public Stagiaire(String nom, float ... notes) {
		super();
		this.nom = nom;
		this.notes = notes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float [] getNotes() {
		return notes;
	}
	public void setNotes(float ... notes) {
		this.notes = notes;
	}
	
	public float calculerMoyenne() {
		int somme = 0;
		for(int i= 0; i < notes.length; i++) {
			somme += notes[i];
		} float moyenne = (float) somme /notes.length;
		return moyenne;
	}
	
	public float trouverMax() {
		float notesMax = notes[0];
		for(int i = 1; i < notes.length; i++) {
			if(notesMax < notes[i]) {
				notesMax = notes[i];
			}
		} return notesMax;			
	}
	
	public float trouverMin() {
		float notesMin = notes[0];
		for(int i = 1; i < notes.length; i++) {
			if(notesMin > notes[i]) {
				notesMin = notes[i];
			}
		} return notesMin;			
	}
	
	
	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", notes=" + Arrays.toString(notes) + "]";
	}
	
	
	

}
