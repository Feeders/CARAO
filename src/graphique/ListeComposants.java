package graphique;

import java.awt.*;
import javax.swing.*;

public class ListeComposants extends JPanel {
	
	public ListeComposants() {
		
		JPanel p = new JPanel(new GridBagLayout()); 
		
		//Couleur du pannel général
		Color grisBleu = new Color (192,192,200);
		setBackground(grisBleu);
		
		/* Les différents boutons pour les composants*/
		JButton machine = new JButton(new ImageIcon("image/machine.jpg" ));
		machine.setMargin(new Insets(0, 0, 0, 0)); // Enlève la marge autour du bouton
		p.add(machine);
		
		JButton cable = new JButton(new ImageIcon("image/cable.jpg" ));
		cable.setMargin(new Insets(0, 0, 0, 0));
		p.add(cable);
		
		JButton hub = new JButton(new ImageIcon("image/hub.jpg" ));
		hub.setMargin(new Insets(0, 0, 0, 0));
		p.add(hub);
		
		JButton partageur = new JButton(new ImageIcon("image/switch.png" ));
		partageur.setMargin(new Insets(0, 0, 0, 0));
		p.add(partageur);
		
		JButton routeur = new JButton(new ImageIcon("image/routeur.jpg" ));
		routeur.setMargin(new Insets(0, 0, 0, 0));
		p.add(routeur);
		
		add(p);
		
	}
}
