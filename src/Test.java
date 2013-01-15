import java.util.ArrayList;
import java.util.Scanner;

import composant.*;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Controleur c = new Controleur();
		Machine m = new Machine();
		Hub h = new Hub(32);
		Switch s = new Switch(4);
		
		c.ajouterComposant(m);
		c.ajouterComposant(h);
		c.ajouterComposant(s);
		c.ajouterComposant(new Machine());
		c.ajouterComposant(new Machine());
		c.ajouterComposant(new Switch(4));
		
		c.relierComposant(2, 1);
		c.relierComposant(2, 3);
		c.relierComposant(2, 4);
		c.relierComposant(3, 5);
		c.relierComposant(3, 6);
		
		System.out.println("Affichage des composants : \n"+c.afficherComposant());
		
		c.suppimerComposant(s);
		System.out.println("Suppression du composant s : \n"+c.afficherComposant());

		c.relierComposant(m, h);
		System.out.println("Relier m avec h : \n"+c.afficherComposant());
		
		System.out.println("m est relie a h :"+m.relieA(h));
		
		c.delierComposant(m, h);
		System.out.println("Delier m et h : \n"+c.afficherComposant());
		
		System.out.println("Re-delier m et h : \n"+c.delierComposant(m, h));
	}	

}
