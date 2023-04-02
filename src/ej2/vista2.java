package ej2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class vista2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;

	public vista2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe e titulo de una pelicula");
		lblNewLabel.setBounds(10, 11, 144, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(10, 97, 89, 23);		
		btnNewButton.addActionListener(al);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 49, 161, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setBounds(316, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Quantum of Solace", "Avatar"}));
		comboBox.setBounds(287, 49, 89, 23);
		contentPane.add(comboBox);
		setVisible(true);
	}
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = textField.getText();
				comboBox.getModel();
				comboBox.addItem(valor);
				comboBox.repaint();
				setVisible(false);	
		}
		};
		}
