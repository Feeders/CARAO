package composant;

import java.util.*;

//machine, hub, switch, cables
public abstract class Composant {
	private static int                    refInc=0;				//Reference auto-incrementé
	private        int                    ref;					//Reference du composant
	
	private        int                 	  nbPortEthernet; 		//Nombre de port ethernet que possede le composant
	private        ArrayList<Composant>   listeComposantRelie;	//La liste de composant relie au composant courant
	private        boolean             	  estEnService;			//Utilise au cas ou le composant est en panne par exemple
	
	private        String                 trame;
	private        ArrayList<Routage> 	  tableRoutage;			//La table de routage 
	
	/**Le constructeur avec paramètre*/
	public Composant(int nbPort){
		
		this.ref                 = ++refInc;
		this.nbPortEthernet      = nbPort;
		this.listeComposantRelie = new ArrayList<Composant>();
		this.estEnService        = false;
		this.trame = "";
		this.tableRoutage = new ArrayList<Routage>();
		
		this.tableRoutage.add(new Routage(this, null, 0));
	}
	
	/**Cette méthode retourne le contenu de la trame*/
	public String getTrame() {
		return trame;
	}

	/**Cette méthode modifie la trame*/
	public void setTrame(String trame) {
		this.trame = trame;
	}

	/**Cette methode est utilisé pour savoir comment s'effectue la diffusion de l'information*/
	/**Un switch ne diffuse l'information que vers une ip*/
	public boolean diffusionVersTous(){	return true;}
	
	/**Cette methode ajoute un composant a la liste des composant relié au composant courant*/
	public boolean ajouterLien(Composant c){
		if(this.getNbPortEthernet() <= this.nbPortUtilise() || this.relieA(c))	return false;
		
		this.listeComposantRelie.add(c);
		return true;
	}
	
	/**Cette methode supprime le composant passé en parametre de la liste des composant 
	 * lié au composant courant*/
	public boolean supprimerLien(Composant c){
		if(!this.relieA(c))	return false;
		ListIterator<Composant> lIt = listeComposantRelie.listIterator();
		
		while(lIt.hasNext())
			if(lIt.next().equals(c)){
				lIt.remove();
				return true;
			}
		return false;
	}
	
	/**Cette methode renvoie le type de l'objet*/
	public abstract String getType();
	
	/*Les getters et setters de la classe composant*/
	
	/**Cette méthode retourne la référence du composant*/
	public int getRef() {
		return ref;
	}
	
	/**Cette méthode permet de modifier la référence du composant*/
	public void setRef(int ref) {
		this.ref = ref;
	}
	
	/**Cette méthode retourne le nombre de port ethernet du composant*/
	public int getNbPortEthernet() {
		return nbPortEthernet;
	}

	/**Cette méthode permet de modifier le nombre de port ethernet du composant*/
	public void setNbPortEthernet(int nbPortEthernet) {
		this.nbPortEthernet = nbPortEthernet;
	}
	
	/**Cette méthode retourne la table de routage*/
	public  ArrayList<Routage> getTabRoutage(){return tableRoutage;}
	
	public void setTabRoutage(ArrayList<Routage> tabRoutage){this.tableRoutage= tabRoutage;}
	
	/**Cette méthode renvoie (s'il est présent dans la liste des composant relié au composant courant) 
	}
	 * le composant dont l'indice est passé en paramètre*/
	public Composant getComposant(int index){
		//Si l'index passé en parametre n'est pas dans l'arrayList on renvoie null
		if(index >= nbPortUtilise() || index < 0)	return null;
		
		//Sinon on renvoie le composant
		return this.listeComposantRelie.get(index);
	}
	
	/**Cette methode renvoie le nombre de port utilisee*/
	public int nbPortUtilise(){	return this.listeComposantRelie.size(); }
	
	
	/**Cette methode renvoie vrai si le composant courant est relié au composant passé en paramètre*/
	public boolean relieA(Composant autre){
		ListIterator<Composant> lIt = listeComposantRelie.listIterator();
		
		while(lIt.hasNext())
			if(lIt.next().equals(autre))
				return true;
		
		return false;
	}
	
	/**Cette methode compare deux composant*/
	public boolean equals(Composant o){return this.getRef() == o.getRef();	}
	
	@Override
	public String toString(){
		String s = this.getType()+"\tref : "+this.getRef()+"\t nbPort : "+this.getNbPortEthernet()+"\n";
		
		//On test si le composant courant est relie a au moins un autre composant 
		if(this.nbPortUtilise() != 0){
			s +="Relié à : \n";
			for(Composant c : this.listeComposantRelie)
				s+= "\t"+c.getType()+"\tref : "+c.getRef()+"\t nbPort : "+c.getNbPortEthernet()+"\n";
		}
		return s+"\n";
	}	
	
	
}
