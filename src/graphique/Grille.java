package graphique;

import java.awt.*;

import javax.swing.*;

public class Grille extends JPanel {

	public Grille () {
		
		setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		JButton ping = new JButton("Simuler Un Ping");
		ping.setMargin(new Insets(2,2,2,2));
		add(ping, BorderLayout.SOUTH);
	}
}
