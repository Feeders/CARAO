package composant;

public class Routeur extends Composant{
	private String adrIp;
	private String masqueSousReseau;
	
	public Routeur(int nbPort) {
		super(nbPort);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		return "Routeur";
	}
	
	/**Cette méthode renvoie l'adresse IP*/
	public String getIp(){return this.adrIp;}
	
	/**Cette méthode renvoie l'adresse Masque*/
	public String getMasque(){return this.masqueSousReseau;}
	
	/**Cette méthode permet de change l'adresse IP*/
	public void setIp(String adrIp){this.adrIp = adrIp; }
	
	/**Cette méthode permet de modifier le masuqe de sous reseaux*/
	public void setMasqueSR(String masque){	this.masqueSousReseau = masque;}

	@Override
	public boolean diffusionVersTous() {
		// TODO Auto-generated method stub
		return false;
	}
}
