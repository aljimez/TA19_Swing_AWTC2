package ej1;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;


public class vista extends JFrame {

	private JPanel contentPane;
	private JTextField textfild;

	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta = new JLabel ("Escribe un nombre para saludar");
		etiqueta.setBounds(56, 21, 263, 14);
		getContentPane().add(etiqueta);
		
		
		textfild = new JTextField();
		textfild.setBounds(56, 69, 263, 28);
		textfild.setBorder(new EmptyBorder(0, 50, 10, 50));
		getContentPane().add(textfild);	
		
		
	
		JButton button = new JButton ("!Saludar¡");
		button.setBounds(135, 120, 77, 23);
		button.addActionListener(al);
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(button);
		button.setVerticalAlignment(SwingConstants.BOTTOM);
		setVisible(true);
	}
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bienvenido "+textfild.getText());
				setVisible(false);
				}
		};
}
	

