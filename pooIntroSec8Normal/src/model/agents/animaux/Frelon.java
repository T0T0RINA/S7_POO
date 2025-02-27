package model.agents.animaux;

import java.awt.Point;
import java.util.ArrayList;

import model.agents.Agent;
import model.agents.Animal;
import model.agents.Sexe;

public abstract class Frelon extends Animal {
	/**
	 * list d'objets de type "Class"
	 * Ces types Class sont param�tr�s par <? extends Animal>
	 * Cela signifie que la classe repr�sent�e par Class doit h�riter de la classe Animal
	 */
	protected ArrayList<Class<? extends Animal>> proies;
	
	public Frelon(Sexe s,Point p) {
		super(s,p);
		proies = new ArrayList<Class<? extends Animal>>();
		
		// ajout de l'objet Class qui repr�sente la classe Abeille � la liste proie
		proies.add(Abeille.class);
	}
	
	@Override
	public void rencontrer(Agent a) {
		try {
			gestionProie((Animal)a);
		}
		catch (ClassCastException cce) {
			System.err.println(a+" n'est pas un Animal");
		}
		
	}
	
	protected void gestionProie(Animal a) {
		//si le frelon a faim et 
		// TODO: qu'il a bien affaire � une proie, c'est � dire que la classe de a 
		// appartient bien � la liste proies
		// supprimer le instanceof et remplacer par cette v�rification
		for (Class<?> proieClass : proies) {
			if (proieClass.isAssignableFrom(a.getClass())) {
				faim=false;
			}
		}
	}
	
	
	@Override
	protected void maj() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void seNourrir() {
		// TODO Auto-generated method stub
		
	}
	
}
