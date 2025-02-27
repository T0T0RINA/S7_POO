package launchers;

import java.awt.Point;

import model.agents.Sexe;
import model.agents.animaux.AbeilleDomestique;
import model.agents.animaux.AbeilleSolitaire;
import model.agents.animaux.FrelonAsiatique;
import model.decor.Ruche;
import model.world.Monde;

public class Launcher8 {

	public static void main(String[] args) {
		Monde m = new Monde(50);
		System.out.println(m);
		m.cycle();
		System.out.println(m);
		
		/*AbeilleSolitaire as = new AbeilleSolitaire(Sexe.Femelle,new Point(0,0));
		FrelonAsiatique fa = new FrelonAsiatique(Sexe.Male, new Point(0,0));
		
		Ruche r = new Ruche(new Point(0,0));
		new AbeilleDomestique(Sexe.Assexue, new Point(10,20),r);
		System.out.println(r);
		new AbeilleDomestique(Sexe.Assexue, new Point(10,20),r);
		System.out.println(r);
		new AbeilleDomestique(Sexe.Femelle, new Point(5,10),r);
		System.out.println(r);
		*/
	}

}
