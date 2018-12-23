import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;


import javax.swing.JButton;
import javax.swing.JFrame;

public class CreditsPanel extends JPanel {

	private GameOfObjectsMenu menu;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.*/
	public CreditsPanel(GameOfObjectsMenu x) {
		setLayout(null);
		setBackground(new Color(8,178 ,227));
		menu =x;
		JLabel label = new JLabel("Credits");
		//label.setHorizontalAlignment(SwingConstants.CENTER);
		
		label.setFont(new Font("Tahoma", Font.BOLD, 35));
		label.setBounds(20, 25, 240, 40);
		add(label);
		
		JButton btnNewButton = new JButton("Back");
		//btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setBounds(20, 500, 200, 60);
		btnNewButton.setBackground(new Color(59, 89, 182));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.addActionListener(new backListener());
		add(btnNewButton);
		
		JLabel labels[] = new JLabel[5];
		//label2.setHorizontalAlignment(SwingConstants.CENTER);
		labels[0] = new JLabel("Arda T�rko�lu: arda.turkoglu@ug.bilkent.edu.tr");
		labels[1] = new JLabel("Engin Deniz Kopan: engin.kopan@ug.bilkent.edu.tr");
		labels[2] = new JLabel("Mehmet Saniso�lu: mehmet.sanisoglu@ug.bilkent.edu.tr");
		labels[3] = new JLabel("Selim �zcan: selim.ozcan@ug.bilkent.edu.tr");
		labels[4] = new JLabel("Zafer ��nar: zafer.cinar@ug.bilkent.edu.tr");
		for( int i = 0; i < 5; i++ ) {
			labels[i].setFont(new Font("Tahoma", Font.PLAIN, 17));
			labels[i].setBounds(20, 100 + (i * 20), 500, 30);
			add(labels[i]);
		}
		
	}
	public class backListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			setVisible(false);
			MainPanel m = new MainPanel(menu);
			menu.show(m);
	       
			}	
		
		}
	 
}