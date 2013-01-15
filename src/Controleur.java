import composant.*;
import java.util.*;

// /!\ Attention nom de classe a changé peut-êre :s
public class Controleur {

	/**
	 * @param args
	 */
	private ArrayList<Composant> listeComposant;
	
	/**Le constructeur sans paramètre de la classe Controleur*/
	public Controleur(){
		listeComposant=new ArrayList<Composant>();
	}
	
	/**Cette méthode permet l'ajout d'un composant*/
	public void ajouterComposant(Composant c){
		this.listeComposant.add(c);
	}
	
	/**Cett méthode permet de supprimer un composant*/
	public boolean suppimerComposant(Composant c){
		ListIterator<Composant> lIt = listeComposant.listIterator();
		
		while(lIt.hasNext())
			if(lIt.next().equals(c)){
				lIt.remove();
				return true;
			}
			
		return false;				
	}
	
	public boolean relierComposant(int ref1, int ref2){
		Composant c1 = this.getComposant(ref1);
		Composant c2 = this.getComposant(ref2);
		
		
		return relierComposant(c1, c2);
	}
	
	/**Cette méthode permet de relier deux composant*/
	public boolean relierComposant(Composant c1, Composant c2){
		//On test si les port du composant courant ou celui donné en paramètre sont déjà tous utilisé
		if(c1.getNbPortEthernet() <= c1.nbPortUtilise() ||c2.getNbPortEthernet() <= c2.nbPortUtilise())	
			return false;
		
		//On empêche de relier un composant a lui-même  ou de relier deux composant deja relie
		if(c1 == c2 || c1.relieA(c2))	return false;
		
		//on cree un cable qui reliera les composant passe en parametre
		Cables c = new Cables();
		
		//On relie le cable aux deux éléments
		c.ajouterLien(c1 );
		c.ajouterLien(c2);		
		listeComposant.add(c);
		
		c1.ajouterLien(c2);
		c2.ajouterLien(c1 );
		
		listeComposant.set(listeComposant.indexOf(c1), c1);
		listeComposant.set(listeComposant.indexOf(c2), c2);

		return true;
	}
	
	/**Cette méthode permet de delier deux composant*/
	public boolean delierComposant(Cables c){
		if(c.nbPortUtilise() == 0)	return false;
		Composant c1 = c.getComposant(0);
		Composant c2 = c.getComposant(1);
		
		this.listeComposant.remove(c);
		
		return delierComposant(c1,c2);
	}
	
	/**Cette methode permet de delier deux composant*/
	public boolean delierComposant(Composant c1, Composant c2){
		
		//Si les composant ne sont pas lié alors on renvoie faux
		if(!c1.relieA(c2))	return false;
		
		c1.supprimerLien(c2);
		c2.supprimerLien(c1);
		
		//on remplace les composant dans l'arrayList
		listeComposant.set(listeComposant.indexOf(c1), c1);
		listeComposant.set(listeComposant.indexOf(c2), c2);
		
		return true;
	}
	
	/**Cette méthode affiche les composant créé sous la forme d'un objet de type String*/
	public String afficherComposant(){
		return this.getListeComposant().toString();
	}
	
	/**Cette méthode renvoie l'arrayList de composant listeComposant*/
	public ArrayList<Composant> getListeComposant() {
		return listeComposant;
	}
	
	/**Cette méthode renvoie le composant dont la référence est passé en paramètre*/
	public Composant getComposant(int ref){
		ListIterator<Composant> lIt = listeComposant.listIterator();
		
		while(lIt.hasNext())
			if(lIt.next().getRef() == ref)
				return lIt.previous();
			
		return null;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	}

}
