import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private Radio radio;
	private JLabel lblEstado,lblFrecuencia;
	private JComboBox cbGUardar;
	private JPanel Display1,Display2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		radio = new Radio();
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(6, 6, 472, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(6, 6, 459, 228);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		lblEstado = new JLabel("Estado: Apagado");
		lblEstado.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setBounds(6, 6, 141, 38);
		panel_2.add(lblEstado);
		
		
		
		lblFrecuencia = new JLabel();
		lblFrecuencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrecuencia.setForeground(Color.WHITE);
		lblFrecuencia.setFont(new Font("Arial", Font.PLAIN, 50));
		lblFrecuencia.setBounds(6, 56, 447, 166);
		panel_2.add(lblFrecuencia);
		
		JButton btnOn = new JButton("ON ");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				radio.onOff();
				boolean estado = radio.estado();
				
				if (estado == true) {
					lblEstado.setText("Estado: Encendido");
					setEstado();
					btnOn.setText("OFF");
					Display1.setVisible(true);
					Display2.setVisible(true);
					
				}else if (estado == false) {
					lblEstado.setText("Estado: Apagado");
					lblFrecuencia.setText("");
					btnOn.setText("ON");
					Display1.setVisible(false);
					Display2.setVisible(false);
				}
				
			}
		});
		btnOn.setBounds(6, 246, 117, 29);
		panel_1.add(btnOn);
		
		Display1 = new JPanel();
		Display1.setBorder(null);
		Display1.setBackground(Color.WHITE);
		Display1.setVisible(false);
		Display1.setBounds(149, 246, 314, 42);
		panel_1.add(Display1);
		Display1.setLayout(null);
		
		JButton btnAm = new JButton("AM");
		btnAm.setBounds(20, 6, 117, 29);
		Display1.add(btnAm);
		
		JButton btnAvanzar = new JButton("Avanzar");
		btnAvanzar.setBounds(191, 6, 117, 29);
		Display1.add(btnAvanzar);
		
		Display2 = new JPanel();
		Display2.setBorder(null);
		Display2.setBackground(Color.WHITE);
		Display2.setBounds(6, 295, 459, 175);
		panel_1.add(Display2);
		Display2.setLayout(null);
		Display2.setVisible(false);
		
		JLabel lblGuardarEn = new JLabel("Guardar en:");
		lblGuardarEn.setBounds(6, 11, 82, 16);
		Display2.add(lblGuardarEn);
		
		cbGUardar = new JComboBox();
		cbGUardar.setBounds(90, 7, 71, 27);
		Display2.add(cbGUardar);
		cbGUardar.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(173, 6, 93, 29);
		Display2.add(btnGuardar);
		
		JLabel lblFavoritas = new JLabel("Favoritas");
		lblFavoritas.setBounds(203, 57, 82, 16);
		Display2.add(lblFavoritas);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(241, 85, 59, 29);
		Display2.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(26, 85, 59, 29);
		Display2.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(99, 85, 59, 29);
		Display2.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(170, 85, 59, 29);
		Display2.add(btn3);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(26, 136, 59, 29);
		Display2.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(99, 136, 59, 29);
		Display2.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(170, 136, 59, 29);
		Display2.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(237, 136, 59, 29);
		Display2.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(312, 136, 59, 29);
		Display2.add(btn11);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(312, 85, 59, 29);
		Display2.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(383, 85, 59, 29);
		Display2.add(btn6);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(383, 136, 59, 29);
		Display2.add(btn12);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(11);
				setEstado();
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(5);
				setEstado();
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(4);
				setEstado();
			}
		});
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(10);
				setEstado();
			}
		});
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(9);
				setEstado();
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(8);
				setEstado();
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(7);
				setEstado();
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(6);
				setEstado();
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(2);
				setEstado();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(1);
				setEstado();
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(0);
				setEstado();
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.seleccionarEmisora(3);
				setEstado();
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				radio.guardar(Integer.parseInt(cbGUardar.getSelectedItem().toString()) - 1);
				
			}
		});
		btnAvanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				radio.avanzar();
				setEstado();
			}
		});
		btnAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radio.cambiarFrecuencia();
				setEstado();
				
				if (radio.estacionActual().contains(".")) {
					btnAm.setText("AM");
				}else {
					btnAm.setText("FM");
				}
				
			}
		});
		
		
		
		
	}
	
	/**
	 * Funcion privada para cambiar el estado que se mostrara al usuario, se hizo una funcion para ahorrar codigo
	 */
	private void setEstado() {
		
		if (radio.estacionActual().contains(".")) {
			lblFrecuencia.setText(radio.estacionActual() + " FM");
		}else {
			lblFrecuencia.setText(radio.estacionActual() + " AM");
		}
		
	}
	
	
}
