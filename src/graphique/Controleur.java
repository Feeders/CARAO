package graphique;

import java.awt.*;
import javax.swing.*;

public class Controleur extends JFrame{
	
	private Menu menu;
	private Grille grille;
	
	public Controleur() {
		
		setTitle("Carao");
		/*
		Toolkit outil = getToolkit();
		this.setSize(outil.getScreenSize());
		*/
		setSize(900, 700);
		menu = new Menu();
		setJMenuBar(menu.getBarreMenu());
		
		JPanel pPrincipal = new JPanel(new BorderLayout());
		
		grille = new Grille();
		JPanel pGrille = grille;
		pPrincipal.add(pGrille);
		
		JPanel comp = new ListeComposants();
		setLayout(new BorderLayout());
		pPrincipal.add(comp, BorderLayout.SOUTH);
		add(pPrincipal);
		
		setVisible(true); 
	}
	
	public static void main(String argv[] ) {
		new Controleur();
	}
}
