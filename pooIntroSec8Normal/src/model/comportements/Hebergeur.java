package model.comportements;

import model.agents.Animal;

/**
 * un hébergeur peut accueillir un animal
 * @author bruno
 *
 */
public interface Hebergeur {
	/**
	 * Renvoie vrai si a peut �tre acceuilli
	 * Il s'agit d'un test de faisabilit�
	 * (l'animal doit r�pondre aux conditions)
	 * @param a Animal candidat à l'accueil
	 * @return
	 */
	public boolean peutAccueillir(Animal a);
	/**
	 * Animal a demande � �tre h�berg� par l'herbergeur
	 * Si l'h�bergeur accepte, renvoie true
	 * @param a
	 * @return
	 */
	public boolean accueillir(Animal a);
}
