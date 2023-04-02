package ej4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class vista4 extends JFrame {

	private JPanel contentPane;
	private JTextField oprnd;
	private JTextField oprnd1;
	private JTextField resu;
	
	
	public vista4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		oprnd = new JTextField();
		oprnd.setBounds(10, 75, 86, 20);
		contentPane.add(oprnd);
		oprnd.setColumns(10);
		
		oprnd1 = new JTextField();
		oprnd1.setColumns(10);
		oprnd1.setBounds(182, 75, 86, 20);
		contentPane.add(oprnd1);
		
		resu = new JTextField();
		resu.setColumns(10);
		resu.setBounds(324, 75, 86, 20);
		contentPane.add(resu);
		
		JButton ButtSum = new JButton("+");
		ButtSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = oprnd.getText();
				String in1 = oprnd1.getText();
				int oprnd = Integer.parseInt(in);
				int oprnd1 = Integer.parseInt(in1);
		int res = oprnd + oprnd1; 
		resu.setText( String.valueOf(res));
			}
		});
		ButtSum.setBounds(10, 140, 89, 23);
		contentPane.add(ButtSum);
		
		JButton ButtResta = new JButton("-");
		ButtResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = oprnd.getText();
				String in1 = oprnd1.getText();
				int oprnd = Integer.parseInt(in);
				int oprnd1 = Integer.parseInt(in1);
		int res = oprnd - oprnd1; 
		resu.setText( String.valueOf(res));}
		});
		ButtResta.setBounds(116, 140, 89, 23);
		contentPane.add(ButtResta);
		
		JButton ButtMult = new JButton("*");
		ButtMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = oprnd.getText();
				String in1 = oprnd1.getText();
				int oprnd = Integer.parseInt(in);
				int oprnd1 = Integer.parseInt(in1);
		int res = oprnd * oprnd1; 
		resu.setText( String.valueOf(res));
			}
		});
		
		ButtMult.setBounds(222, 140, 89, 23);
		contentPane.add(ButtMult);
		
		JButton ButtDiv = new JButton("/");
		ButtDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in = oprnd.getText();
				String in1 = oprnd1.getText();
				int oprnd = Integer.parseInt(in);
				int oprnd1 = Integer.parseInt(in1);
		int res = oprnd / oprnd1; 
		resu.setText( String.valueOf(res));
			}
		});
		ButtDiv.setBounds(10, 199, 89, 23);
		contentPane.add(ButtDiv);
		
		JButton ButtExit = new JButton("salir");
		ButtExit.setBounds(116, 199, 89, 23);
		contentPane.add(ButtExit);
		ButtExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
		
			}});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(24, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(116, 26, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(222, 26, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(323, 26, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton ButtAbout = new JButton("about");
		ButtAbout.setBounds(222, 199, 89, 23);
		contentPane.add(ButtAbout);
		
	}
}
