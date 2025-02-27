package model.agents.animaux;

import java.awt.Point;

import model.decor.Ruche;
import model.agents.Sexe;

public class AbeilleDomestique extends Abeille {

	public AbeilleDomestique(Sexe s, Point p, Ruche r) {
		super(s,p);
		if (r.accueillir(this) == false) {
			throw new IllegalArgumentException("impossible de créer l'abeille domestique car la ruche ne veut pas l'acueillir");
		}
	}
	
}
