package model.agents;

import java.util.Comparator;

public class CoordComparator implements Comparator<Agent> {
	
	public int compare(Agent a, Agent b) {
		if (a.getCoord().x - b.getCoord().x == 0) {
			return a.getCoord().y - b.getCoord().y;
		} else {
			return a.getCoord().x - b.getCoord().x;
		}
	}
	
}
