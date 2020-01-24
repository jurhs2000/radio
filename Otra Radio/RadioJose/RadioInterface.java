/**
 * Hoja de trabajo 1
 * @author Jose Hurtarte
 * @author Javier Coto
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class RadioInterface {

	private JButton btnAdelante;
	private JButton btnBoton1;
	private JLabel lblEmisora;
	private JFrame frame;
	
	private boolean verificadorGuardar;
	
	//Interfaz         Controlador
	Radio radio = new Radio(); // esta es la linea que se debe de cambiar
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioInterface window = new RadioInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioInterface() {
		
		verificadorGuardar = false;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 920, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 878, 252);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		
		
		
		
		JPanel panelRadio = new JPanel();
		panelRadio.setBackground(new Color(204, 255, 255));
		panelRadio.setBounds(12, 0, 636, 151);
		panel.add(panelRadio);
		panelRadio.setLayout(null);
		
		JLabel lblEmisora = new JLabel("");
		lblEmisora.setForeground(Color.BLUE);
		lblEmisora.setFont(new Font("BankGothic Lt BT", Font.BOLD, 50));
		lblEmisora.setBounds(33, 13, 591, 125);
		panelRadio.add(lblEmisora);
		lblEmisora.setText(radio.estacionActual());
		lblEmisora.setVisible(radio.estado());          //Estado inicial del label de estacion actual
		
		JRadioButton rbGuardarCancion = new JRadioButton("");
		rbGuardarCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {     
				verificadorGuardar = !verificadorGuardar;
			}
		});
		rbGuardarCancion.setBackground(Color.BLUE);
		rbGuardarCancion.setBounds(42, 196, 25, 25);
		panel.add(rbGuardarCancion);
		rbGuardarCancion.setEnabled(radio.estado());    // Estadio inicial de rbGuardar
		
	
		
		JLabel lblGuardarEstacion = new JLabel("<html>Guardar Estacion<html>");
		lblGuardarEstacion.setBounds(32, 162, 65, 25);
		panel.add(lblGuardarEstacion);
		
		JButton btnBoton1 = new JButton("1");    
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(1);
				}
				else {
					radio.seleccionarEmisora(1);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton1.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton1.setBackground(SystemColor.inactiveCaption);
		btnBoton1.setForeground(Color.BLUE);
		btnBoton1.setBounds(121, 179, 97, 25);
		panel.add(btnBoton1);
		btnBoton1.setEnabled(radio.estado());  //Estadio inicial boton1
		
		
		JButton btnAdelante = new JButton("\u203A");
		btnAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.avanzar();
				lblEmisora.setText(radio.estacionActual());
			}
		});
		btnAdelante.setBackground(SystemColor.inactiveCaption);
		btnAdelante.setForeground(Color.BLUE);
		btnAdelante.setFont(new Font("Arial", Font.BOLD, 55));
		btnAdelante.setBounds(662, 0, 97, 151);
		panel.add(btnAdelante);
		btnAdelante.setEnabled(radio.estado());      //Estado btnAdelante
		
		JButton btnNewButton = new JButton("AM/FM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.cambiarFrecuencia();
				lblEmisora.setText(radio.estacionActual());
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(769, 179, 97, 60);
		panel.add(btnNewButton);
		btnNewButton.setEnabled(radio.estado());   //Estado AM/FM
		
		JButton btnBoton2 = new JButton("2\r\n");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(verificadorGuardar) {
					radio.guardar(2);
				}
				else {
					radio.seleccionarEmisora(2);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton2.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton2.setForeground(Color.BLUE);
		btnBoton2.setBackground(SystemColor.inactiveCaption);
		btnBoton2.setBounds(230, 179, 97, 25);
		panel.add(btnBoton2);
		btnBoton2.setEnabled(radio.estado());  //Estadio inicial boton2
		
		JButton btnBoton3 = new JButton("3");
		btnBoton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(3);
				}
				else {
					radio.seleccionarEmisora(3);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton3.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton3.setBackground(SystemColor.inactiveCaption);
		btnBoton3.setForeground(Color.BLUE);
		btnBoton3.setBounds(339, 179, 97, 25);
		panel.add(btnBoton3);
		btnBoton3.setEnabled(radio.estado());  //Estadio inicial boton3
		
		JButton btnBoton4 = new JButton("4");
		btnBoton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(4);
				}
				else {
					radio.seleccionarEmisora(4);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton4.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton4.setForeground(Color.BLUE);
		btnBoton4.setBackground(SystemColor.inactiveCaption);
		btnBoton4.setBounds(448, 179, 97, 25);
		panel.add(btnBoton4);
		btnBoton4.setEnabled(radio.estado());  //Estadio inicial boton4
		
		JButton btnBoton5 = new JButton("5");
		btnBoton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(5);
				}
				else {
					radio.seleccionarEmisora(5);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton5.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton5.setBackground(SystemColor.inactiveCaption);
		btnBoton5.setForeground(Color.BLUE);
		btnBoton5.setBounds(557, 179, 97, 25);
		panel.add(btnBoton5);
		btnBoton5.setEnabled(radio.estado());  //Estadio inicial boton5
		
		JButton btnBoton6 = new JButton("6");
		btnBoton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(6);
				}
				else {
					radio.seleccionarEmisora(6);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton6.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton6.setForeground(Color.BLUE);
		btnBoton6.setBackground(SystemColor.inactiveCaption);
		btnBoton6.setBounds(662, 179, 97, 25);
		panel.add(btnBoton6);
		btnBoton6.setEnabled(radio.estado());  //Estadio inicial boton6
		
		JButton btnBoton7 = new JButton("7");
		btnBoton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(7);
				}
				else {
					radio.seleccionarEmisora(7);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton7.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton7.setBackground(SystemColor.inactiveCaption);
		btnBoton7.setForeground(Color.BLUE);
		btnBoton7.setBounds(121, 214, 97, 25);
		panel.add(btnBoton7);
		btnBoton7.setEnabled(radio.estado());  //Estadio inicial boton7
		
		JButton btnBoton8 = new JButton("8");
		btnBoton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(8);
				}
				else {
					radio.seleccionarEmisora(8);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton8.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton8.setForeground(Color.BLUE);
		btnBoton8.setBackground(SystemColor.inactiveCaption);
		btnBoton8.setBounds(230, 214, 97, 25);
		panel.add(btnBoton8);
		btnBoton8.setEnabled(radio.estado());  //Estadio inicial boton8
		
		JButton btnBoton9 = new JButton("9");
		btnBoton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(9);
				}
				else {
					radio.seleccionarEmisora(9);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton9.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton9.setForeground(Color.BLUE);
		btnBoton9.setBackground(SystemColor.inactiveCaption);
		btnBoton9.setBounds(339, 214, 97, 25);
		panel.add(btnBoton9);
		btnBoton9.setEnabled(radio.estado());  //Estadio inicial boton9
		
		JButton btnBoton10 = new JButton("10");
		btnBoton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(10);
				}
				else {
					radio.seleccionarEmisora(10);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton10.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton10.setBackground(SystemColor.inactiveCaption);
		btnBoton10.setForeground(Color.BLUE);
		btnBoton10.setBounds(448, 214, 97, 25);
		panel.add(btnBoton10);
		btnBoton10.setEnabled(radio.estado());  //Estadio inicial boton10
		
		JButton btnBoton11 = new JButton("11");
		btnBoton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(11);
				}
				else {
					radio.seleccionarEmisora(11);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton11.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton11.setForeground(Color.BLUE);
		btnBoton11.setBackground(SystemColor.inactiveCaption);
		btnBoton11.setBounds(557, 214, 97, 25);
		panel.add(btnBoton11);
		btnBoton11.setEnabled(radio.estado());  //Estadio inicial boton11
		
		JButton btnBoton12 = new JButton("12");
		btnBoton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verificadorGuardar) {
					radio.guardar(12);
				}
				else {
					radio.seleccionarEmisora(12);
					lblEmisora.setText(radio.estacionActual());
				}
			}
		});
		btnBoton12.setFont(new Font("BankGothic Lt BT", Font.BOLD, 15));
		btnBoton12.setBackground(SystemColor.inactiveCaption);
		btnBoton12.setForeground(Color.BLUE);
		btnBoton12.setBounds(662, 214, 97, 25);
		panel.add(btnBoton12);
		btnBoton12.setEnabled(radio.estado());  //Estadio inicial boton12
		
		JButton btnOnoff = new JButton("On/Off");
		btnOnoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.onOff();
				lblEmisora.setText(radio.estacionActual());//prueba
				lblEmisora.setVisible(radio.estado()); 
				rbGuardarCancion.setEnabled(radio.estado());
				btnAdelante.setEnabled(radio.estado()); 
				btnNewButton.setEnabled(radio.estado());
				btnBoton1.setEnabled(radio.estado());
				btnBoton2.setEnabled(radio.estado());
				btnBoton3.setEnabled(radio.estado());
				btnBoton4.setEnabled(radio.estado());
				btnBoton5.setEnabled(radio.estado());
				btnBoton6.setEnabled(radio.estado());
				btnBoton7.setEnabled(radio.estado());
				btnBoton8.setEnabled(radio.estado());
				btnBoton9.setEnabled(radio.estado());
				btnBoton10.setEnabled(radio.estado());
				btnBoton11.setEnabled(radio.estado());
				btnBoton12.setEnabled(radio.estado());
			}
		});
		btnOnoff.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOnoff.setForeground(Color.RED);
		btnOnoff.setBounds(769, 72, 97, 52);
		panel.add(btnOnoff);
	}
}
