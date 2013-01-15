package composant;

public class Routage {
	
	private Composant c;
	private Cables chemin;
	private int distance;
	
	public Routage(Composant c, Cables chemin, int distance){
		this.c=c;
		this.chemin=chemin;
		this.distance=distance;
	}

	
	public Composant getC() {
		return c;
	}

	public void setC(Composant c) {
		this.c = c;
	}

	public Cables getChemin() {
		return chemin;
	}

	public void setChemin(Cables chemin) {
		this.chemin = chemin;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
