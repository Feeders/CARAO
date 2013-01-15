package graphique;

import java.awt.*;
import javax.swing.*;

public class ListeComposants extends JPanel {
	
	public ListeComposants() {

		JButton machine = new JButton(new ImageIcon("image/machine.jpg" ));
		machine.setMargin(new Insets(0, 0, 0, 0));
		add(machine);
		
		JButton cable = new JButton(new ImageIcon("image/cable.jpg" ));
		cable.setMargin(new Insets(0, 0, 0, 0));
		add(cable);
		
		JButton hub = new JButton(new ImageIcon("image/hub.jpg" ));
		hub.setMargin(new Insets(0, 0, 0, 0));
		add(hub);
		
		JButton partageur = new JButton(new ImageIcon("image/switch.png" ));
		partageur.setMargin(new Insets(0, 0, 0, 0));
		add(partageur);
		
		JButton routeur = new JButton(new ImageIcon("image/routeur.jpg" ));
		routeur.setMargin(new Insets(0, 0, 0, 0));
		add(routeur);
		
		JButton ping = new JButton("Simuler Un Ping");
		ping.setMargin(new Insets(2,2,2,2));
		add(ping);
	}
}
