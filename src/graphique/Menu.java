package graphique;

import javax.swing.*;
import java.awt.event.*;

public class Menu {

	private JMenuBar barreMenu;
	
	public Menu () {
		
		barreMenu = new JMenuBar();
		
		JMenu menuFichier = new JMenu ("Fichier");
		
		JMenuItem nouveau = new JMenuItem("Nouveau");
		nouveau.addActionListener(
			new ActionListener(){
				   public void actionPerformed(ActionEvent e){System.out.println("Nouveau");} 
			}
		);
		menuFichier.add(nouveau);
		menuFichier.addSeparator();
		
		JMenuItem sauvegarde = new JMenuItem("Sauvegarder");
		sauvegarde.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){System.out.println("Sauvegarder");} 
			}
		);
		menuFichier.add(sauvegarde);
		menuFichier.addSeparator();
		
		JMenuItem charge = new JMenuItem("Charger");
		charge.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){System.out.println("Charger");} 
			}
		);
		menuFichier.add(charge);
		menuFichier.addSeparator();
		
		JMenuItem quitter = new JMenuItem("Quiter");
		quitter.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){ System.exit(0);} 
			}
		);		
		menuFichier.add(quitter);
		
		barreMenu.add(menuFichier);
		
		JMenu menuEdition = new JMenu ("Edition");
		
		JMenuItem annuler = new JMenuItem("Annuler");
		annuler.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){System.out.println("Annuler");} 
			}
		);
		menuEdition.add(annuler);
		menuEdition.addSeparator();
		
		JMenuItem retablir = new JMenuItem("Retablir");
		retablir.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){ System.out.println("Retablir");} 
			}
		);		
		menuEdition.add(retablir);
		menuEdition.addSeparator();
		
		JMenuItem copier = new JMenuItem("Copier");
		copier.addActionListener(
			new ActionListener(){
				   public void actionPerformed(ActionEvent e){System.out.println("Copier");} 
			}
		);
		menuEdition.add(copier);
		menuEdition.addSeparator();
		
		JMenuItem coller = new JMenuItem("Coller");
		coller.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){System.out.println("Coller");} 
			}
		);
		menuEdition.add(coller);		
		
		barreMenu.add(menuEdition);
		
		JMenu menuAide = new JMenu ("Aide");
		
		JMenuItem propos = new JMenuItem("Aide Carao");
		propos.addActionListener(
			new ActionListener(){
			    public void actionPerformed(ActionEvent e){System.out.println("Aide");} 
			}
		);
		
		menuAide.add(propos);
		
		barreMenu.add(menuAide);
		
	}

	public JMenuBar getBarreMenu() { return barreMenu; }

}
