package composant;

public class Machine extends Composant {
	private String adrIp;
	private String adrMac;
	private String masqueSousReseau;
	
	public Machine() {
		super(1);
		// TODO Auto-generated constructor stub
	}
	
	public String getType(){return "Machine";}
	
	/*Getters*/
	/**Cette méthode renvoie l'adresse IP*/
	public String getIp(){return this.adrIp;}

	/**Cette méthode renvoie l'adresse Mac*/
	public String getMac(){return this.adrMac;}
	
	/**Cette méthode renvoie l'adresse Masque*/
	public String getMasque(){return this.masqueSousReseau;}
	
	
	/*Setters*/
	/**Cette méthode permet de change l'adresse IP*/
	public void setIp(String adrIp){this.adrIp = adrIp; }
	
	/**Cette méthode permet de modifier le masuqe de sous reseaux*/
	public void setMasqueSR(String masque){	this.masqueSousReseau = masque;}
}
