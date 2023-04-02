package ej3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JButton;

public class vista3 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnLinux;
	private JRadioButton rdbtnMac; 
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxDiseoGrafico;
	private JCheckBox chckbxAdministracin;
	
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public vista3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewWindows = new JRadioButton("Windows");
		rdbtnNewWindows.setBounds(40, 42, 109, 23);
		contentPane.add(rdbtnNewWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux\r\n");
		rdbtnLinux.setBounds(40, 68, 109, 23);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(40, 94, 109, 23);
		contentPane.add(rdbtnMac);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMac);
		buttonGroup.add(rdbtnLinux);
		buttonGroup.add(rdbtnNewWindows);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(260, 42, 121, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDiseoGrafico = new JCheckBox("Diseño Gráfico");
		chckbxDiseoGrafico.setBounds(260, 68, 121, 23);
		contentPane.add(chckbxDiseoGrafico);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administración");
		chckbxAdministracin.setBounds(260, 94, 121, 23);
		contentPane.add(chckbxAdministracin);
		
		
		JLabel lblNewLabel = new JLabel("Sistema Operativo");
		lblNewLabel.setBounds(40, 21, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Especialidad");
		lblNewLabel_1.setBounds(260, 21, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(40, 178, 200, 26);
		contentPane.add(slider);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor: 0");
		lblNewLabel_1_1.setBounds(40, 226, 124, 14);
		contentPane.add(lblNewLabel_1_1);
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				lblNewLabel_1_1.setText("Valor: "+slider.getValue());
				lblNewLabel_1_1.setBounds(40, 207, 124, 14);
				contentPane.add(lblNewLabel_1_1);
				
			}
		});
		
		
		JLabel lblHorasDedicadas = new JLabel("Horas dedicadas");
		lblHorasDedicadas.setBounds(40, 140, 109, 14);
		contentPane.add(lblHorasDedicadas);
		
		JLabel lblNewLabel_1_2 = new JLabel();
		lblNewLabel_1_2.setBounds(274, 140, 243, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel();
		lblNewLabel_1_2_1.setBounds(40, 270, 477, 14);
		contentPane.add(lblNewLabel_1_2_1);
		

		
		JButton btnNewButton = new JButton("Envio");
		btnNewButton.setBounds(389, 42, 89, 23);
		contentPane.add(btnNewButton);
		
		
		rdbtnMac.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				
				lblNewLabel_1_2.setText("Sistema operativo seleccionado: Mac");
			}
		});
		
		rdbtnLinux.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				
				lblNewLabel_1_2.setText("Sistema operativo seleccionado: Linux");
			}
		});
		rdbtnNewWindows.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				
				lblNewLabel_1_2.setText("Sistema operativo seleccionado: Windows");
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {

				String esp = "";
				if(chckbxNewCheckBox.isSelected()) {
							
					esp +=" Programación ";

				}if(chckbxDiseoGrafico.isSelected()) {
					
					esp +=" Diseño Grafico ";
					
				} if(chckbxAdministracin.isSelected()) {
					
					esp +=" Adminstración ";
			
				}
				
				lblNewLabel_1_2_1.setText("La especialicación seleccionada es: "+esp);
			}
			
			
		});
	
		
	}
	
}
