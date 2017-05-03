package pl.sp.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {

	private JPanel jpanel;
	public static JTextField jtextfield;
	private JButton jbutton;
	private JLabel jlabel;
	private boolean zakoncz = true;

	GUI() {

		this.jpanel = new JPanel();
		this.jtextfield = new JTextField(20);
		this.jbutton = new JButton("Send");
		jbutton.addActionListener(this);
		this.jlabel = new JLabel();
		jpanel.add(jtextfield);
		jpanel.add(jbutton);
		jpanel.add(jlabel);
		setTitle("Klient UDP");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		add(jpanel);
		setVisible(true);

	}

	public static JTextField getJtextfield() {
		return jtextfield;
	}

	public void actionPerformed(ActionEvent e) {
		Client.send();
		jtextfield.setText("");
		jlabel.setText("Wiadomoœæ wys³ana");
		

	}

}
