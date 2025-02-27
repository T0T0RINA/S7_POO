package model.decor;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.agents.Animal;
import model.agents.Sexe;
import model.agents.animaux.AbeilleDomestique;
import model.comportements.Hebergeur;

public class Ruche extends Decor implements Hebergeur {
	
	/**
	 * Liste des abeilles de la ruche 
	 */
	private Set<AbeilleDomestique> population;
	/**
	 * constante taille maximale de la ruche
	 */
	private static int populationMax = 1000;
	
	public Ruche(Point p) {
		super(p);
		this.population = new HashSet<>();
	}

	@Override
	public boolean peutAccueillir(Animal a) {
		return a instanceof AbeilleDomestique 
				&& population.size()<populationMax 
				&& !population.contains(a);
	}

	@Override
	public boolean accueillir(Animal a) {
		boolean ret = false;
		if(peutAccueillir(a)) {
			population.add((AbeilleDomestique) a);
			ret=true;
		}
		return ret;
	}
	
	public String toString() {
		Point coord = getCoord();
		
		String ret = "Ruche (" + (int) coord.getX() + ";" + (int) coord.getY() + ") : population "
		+ population.size() + " abeille" + (population.size() > 1 ? "s" : "") + "\n";

		// Ajout des informations pour chaque abeille de la population
		for (AbeilleDomestique abeille : population) {
			ret += "\t*" + abeille.toString() + "\n"; // Utilise toString() d'AbeilleDomestique
		}

		return ret;
	}
	
}
