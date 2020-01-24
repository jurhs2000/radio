/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de datos - CC2003

Julio Herrera 19402
Marco Ramírez 19588

Radio View
Interfaz Grafica del programa de radio, esta clase es un diseño de ventana que,
contiene todos los elementos graficos así como las referencias a las funciones de la clase
Radio.
Interfaz Java Swing construida con Window Builder en Eclipse

Last modification: 22/01/2020
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class RadioView {

	RadioInterface radio = new Radio(); //Instancia el objeto Radio
	private JFrame frmRadio;
	private JTextField txtFrecuencia;
	private boolean save = false; //Saber si el boton Save fue presionado

	/**
	 * Launch the application.
	*/
	public void start() {
		frmRadio.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public RadioView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadio = new JFrame();
		frmRadio.setTitle("RADIO\r\n");
		frmRadio.setResizable(false);
		frmRadio.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmRadio.getContentPane().setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		frmRadio.setBounds(100, 100, 827, 428);
		frmRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadio.getContentPane().setLayout(null);
		
		JButton btnOn = new JButton("On");
		btnOn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		btnOn.setBounds(14, 11, 56, 23);
		btnOn.doClick();
		frmRadio.getContentPane().add(btnOn);
		
		JButton btnOff = new JButton("Off");
		btnOff.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		btnOff.setBounds(80, 11, 56, 23);
		frmRadio.getContentPane().add(btnOff);
		
		JButton btn1AM = new JButton("1");
		btn1AM.setEnabled(false);
		btn1AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn1AM.setBounds(49, 351, 56, 23);
		frmRadio.getContentPane().add(btn1AM);
		
		JButton btn2AM = new JButton("2");
		btn2AM.setEnabled(false);
		btn2AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn2AM.setBounds(112, 351, 56, 23);
		frmRadio.getContentPane().add(btn2AM);
		
		JButton btn3AM = new JButton("3");
		btn3AM.setEnabled(false);
		btn3AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn3AM.setBounds(175, 351, 62, 23);
		frmRadio.getContentPane().add(btn3AM);
		
		JButton btn4AM = new JButton("4");
		btn4AM.setEnabled(false);
		btn4AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn4AM.setBounds(238, 351, 62, 23);
		frmRadio.getContentPane().add(btn4AM);
		
		JButton btn5AM = new JButton("5");
		btn5AM.setEnabled(false);
		btn5AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn5AM.setBounds(301, 351, 62, 23);
		frmRadio.getContentPane().add(btn5AM);
		
		JButton btn6AM = new JButton("6");
		btn6AM.setEnabled(false);
		btn6AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn6AM.setBounds(364, 351, 62, 23);
		frmRadio.getContentPane().add(btn6AM);
		
		JButton btn7AM = new JButton("7");
		btn7AM.setEnabled(false);
		btn7AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn7AM.setBounds(427, 351, 62, 23);
		frmRadio.getContentPane().add(btn7AM);
		
		JButton btn8AM = new JButton("8");
		btn8AM.setEnabled(false);
		btn8AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn8AM.setBounds(490, 351, 62, 23);
		frmRadio.getContentPane().add(btn8AM);
		
		JButton btn9AM = new JButton("9");
		btn9AM.setEnabled(false);
		btn9AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn9AM.setBounds(553, 351, 62, 23);
		frmRadio.getContentPane().add(btn9AM);
		
		JButton btn10AM = new JButton("10");
		btn10AM.setEnabled(false);
		btn10AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn10AM.setBounds(616, 351, 62, 23);
		frmRadio.getContentPane().add(btn10AM);
		
		JButton btn11AM = new JButton("11");
		btn11AM.setEnabled(false);
		btn11AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn11AM.setBounds(679, 351, 62, 23);
		frmRadio.getContentPane().add(btn11AM);
		
		JButton btn12AM = new JButton("12");
		btn12AM.setEnabled(false);
		btn12AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn12AM.setBounds(742, 351, 62, 23);
		frmRadio.getContentPane().add(btn12AM);
		
		JLabel lblFavAmFm = new JLabel("Emisoras Favoritas");
		lblFavAmFm.setEnabled(false);
		lblFavAmFm.setHorizontalAlignment(SwingConstants.LEFT);
		lblFavAmFm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblFavAmFm.setBounds(20, 262, 184, 52);
		frmRadio.getContentPane().add(lblFavAmFm);
		
		JButton btnAM = new JButton("AM");
		btnAM.setEnabled(false);
		btnAM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 42));
		btnAM.setBounds(600, 98, 119, 52);
		frmRadio.getContentPane().add(btnAM);
		
		JButton btnFM = new JButton("FM");
		btnFM.setEnabled(false);
		btnFM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 42));
		btnFM.setBounds(600, 156, 119, 52);
		frmRadio.getContentPane().add(btnFM);
		
		JLabel lblRadio = new JLabel("RADIO");
		lblRadio.setEnabled(false);
		lblRadio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadio.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 30));
		lblRadio.setBounds(187, 15, 363, 57);
		frmRadio.getContentPane().add(lblRadio);
		
		JButton btnNext = new JButton("Siguiente");
		btnNext.setEnabled(false);
		btnNext.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 11));
		btnNext.setBounds(311, 201, 89, 23);
		frmRadio.getContentPane().add(btnNext);
		
		JButton btnSave = new JButton("Guardar");
		btnSave.setEnabled(false);
		btnSave.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		btnSave.setBounds(194, 277, 89, 23);
		frmRadio.getContentPane().add(btnSave);

		JLabel txtAm = new JLabel();
		txtAm.setHorizontalAlignment(SwingConstants.LEFT);
		txtAm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		txtAm.setText("AM");
		txtAm.setBounds(9, 321, 56, 23);
		frmRadio.getContentPane().add(txtAm);

		JLabel txt1Am = new JLabel();
		txt1Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt1Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt1Am.setText("-");
		txt1Am.setBounds(79, 301, 56, 23);
		frmRadio.getContentPane().add(txt1Am);

		JLabel txt2Am = new JLabel();
		txt2Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt2Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt2Am.setText("-");
		txt2Am.setBounds(139, 301, 56, 23);
		frmRadio.getContentPane().add(txt2Am);

		JLabel txt3Am = new JLabel();
		txt3Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt3Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt3Am.setText("-");
		txt3Am.setBounds(209, 301, 56, 23);
		frmRadio.getContentPane().add(txt3Am);

		JLabel txt4Am = new JLabel();
		txt4Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt4Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt4Am.setText("-");
		txt4Am.setBounds(269, 301, 56, 23);
		frmRadio.getContentPane().add(txt4Am);

		JLabel txt5Am = new JLabel();
		txt5Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt5Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt5Am.setText("-");
		txt5Am.setBounds(329, 301, 56, 23);
		frmRadio.getContentPane().add(txt5Am);

		JLabel txt6Am = new JLabel();
		txt6Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt6Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt6Am.setText("-");
		txt6Am.setBounds(399, 301, 56, 23);
		frmRadio.getContentPane().add(txt6Am);

		JLabel txt7Am = new JLabel();
		txt7Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt7Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt7Am.setText("-");
		txt7Am.setBounds(459, 301, 56, 23);
		frmRadio.getContentPane().add(txt7Am);

		JLabel txt8Am = new JLabel();
		txt8Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt8Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt8Am.setText("-");
		txt8Am.setBounds(519, 301, 56, 23);
		frmRadio.getContentPane().add(txt8Am);

		JLabel txt9Am = new JLabel();
		txt9Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt9Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt9Am.setText("-");
		txt9Am.setBounds(589, 301, 56, 23);
		frmRadio.getContentPane().add(txt9Am);

		JLabel txt10Am = new JLabel();
		txt10Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt10Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt10Am.setText("-");
		txt10Am.setBounds(649, 301, 56, 23);
		frmRadio.getContentPane().add(txt10Am);

		JLabel txt11Am = new JLabel();
		txt11Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt11Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt11Am.setText("-");
		txt11Am.setBounds(709, 301, 56, 23);
		frmRadio.getContentPane().add(txt11Am);

		JLabel txt12Am = new JLabel();
		txt12Am.setHorizontalAlignment(SwingConstants.LEFT);
		txt12Am.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt12Am.setText("-");
		txt12Am.setBounds(769, 301, 56, 23);
		frmRadio.getContentPane().add(txt12Am);

		JLabel txtFm = new JLabel();
		txtFm.setHorizontalAlignment(SwingConstants.LEFT);
		txtFm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		txtFm.setText("FM");
		txtFm.setBounds(9, 301, 56, 23);
		frmRadio.getContentPane().add(txtFm);

		JLabel txt1Fm = new JLabel();
		txt1Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt1Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt1Fm.setText("-");
		txt1Fm.setBounds(79, 321, 56, 23);
		frmRadio.getContentPane().add(txt1Fm);

		JLabel txt2Fm = new JLabel();
		txt2Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt2Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt2Fm.setText("-");
		txt2Fm.setBounds(139, 321, 56, 23);
		frmRadio.getContentPane().add(txt2Fm);

		JLabel txt3Fm = new JLabel();
		txt3Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt3Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt3Fm.setText("-");
		txt3Fm.setBounds(209, 321, 56, 23);
		frmRadio.getContentPane().add(txt3Fm);

		JLabel txt4Fm = new JLabel();
		txt4Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt4Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt4Fm.setText("-");
		txt4Fm.setBounds(269, 321, 56, 23);
		frmRadio.getContentPane().add(txt4Fm);

		JLabel txt5Fm = new JLabel();
		txt5Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt5Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt5Fm.setText("-");
		txt5Fm.setBounds(329, 321, 56, 23);
		frmRadio.getContentPane().add(txt5Fm);

		JLabel txt6Fm = new JLabel();
		txt6Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt6Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt6Fm.setText("-");
		txt6Fm.setBounds(399, 321, 56, 23);
		frmRadio.getContentPane().add(txt6Fm);

		JLabel txt7Fm = new JLabel();
		txt7Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt7Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt7Fm.setText("-");
		txt7Fm.setBounds(459, 321, 56, 23);
		frmRadio.getContentPane().add(txt7Fm);

		JLabel txt8Fm = new JLabel();
		txt8Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt8Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt8Fm.setText("-");
		txt8Fm.setBounds(519, 321, 56, 23);
		frmRadio.getContentPane().add(txt8Fm);

		JLabel txt9Fm = new JLabel();
		txt9Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt9Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt9Fm.setText("-");
		txt9Fm.setBounds(589, 321, 56, 23);
		frmRadio.getContentPane().add(txt9Fm);

		JLabel txt10Fm = new JLabel();
		txt10Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt10Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt10Fm.setText("-");
		txt10Fm.setBounds(649, 321, 56, 23);
		frmRadio.getContentPane().add(txt10Fm);

		JLabel txt11Fm = new JLabel();
		txt11Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt11Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt11Fm.setText("-");
		txt11Fm.setBounds(709, 321, 56, 23);
		frmRadio.getContentPane().add(txt11Fm);

		JLabel txt12Fm = new JLabel();
		txt12Fm.setHorizontalAlignment(SwingConstants.LEFT);
		txt12Fm.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		txt12Fm.setText("-");
		txt12Fm.setBounds(769, 321, 56, 23);
		frmRadio.getContentPane().add(txt12Fm);
		
		txtFrecuencia = new JTextField();
		txtFrecuencia.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 70));
		txtFrecuencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrecuencia.setText("FRECUENCIA");
		txtFrecuencia.setEnabled(false);
		txtFrecuencia.setEditable(false);
		txtFrecuencia.setBounds(122, 62, 467, 128);
		frmRadio.getContentPane().add(txtFrecuencia);
		txtFrecuencia.setColumns(10);

		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				radio.avanzar();
				txtFrecuencia.setText(radio.estacionActual());
			}
		});
		
		btnOn.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAM.setEnabled(false);
				btnFM.setEnabled(true);
				txtFrecuencia.setEnabled(true);
				lblRadio.setEnabled(true);
				btnSave.setEnabled(true);
				lblFavAmFm.setText("Favoritas");
				btnNext.setEnabled(true);
				radio.onOff();
				txtFrecuencia.setText(radio.estacionActual());
			}
		});

		btnOff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAM.setEnabled(false);
				btnFM.setEnabled(false);
				btnNext.setEnabled(false);
				txtFrecuencia.setEnabled(false);
				lblRadio.setEnabled(false);
				btn1AM.setEnabled(false);
				btn2AM.setEnabled(false);
				btn3AM.setEnabled(false);
				btn4AM.setEnabled(false);
				btn5AM.setEnabled(false);
				btn6AM.setEnabled(false);
				btn7AM.setEnabled(false);
				btn8AM.setEnabled(false);
				btn9AM.setEnabled(false);
				btn10AM.setEnabled(false);
				btn11AM.setEnabled(false);
				btn12AM.setEnabled(false);
				btnSave.setEnabled(false);
				radio.onOff();
			}
		});

		btnAM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAM.setEnabled(false);
				btnFM.setEnabled(true);
				radio.cambiarFrecuencia();
				txtFrecuencia.setText(radio.estacionActual());
			}
		});

		btnFM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnAM.setEnabled(true);
				btnFM.setEnabled(false);
				radio.cambiarFrecuencia();
				txtFrecuencia.setText(radio.estacionActual());
			}
		});

		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeSave();
				btn1AM.setEnabled(true);
				btn2AM.setEnabled(true);
				btn3AM.setEnabled(true);
				btn4AM.setEnabled(true);
				btn5AM.setEnabled(true);
				btn6AM.setEnabled(true);
				btn7AM.setEnabled(true);
				btn8AM.setEnabled(true);
				btn9AM.setEnabled(true);
				btn10AM.setEnabled(true);
				btn11AM.setEnabled(true);
				btn12AM.setEnabled(true);
			}
		});

		btn1AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(1);
					if (radio.estado()) {
						txt1Am.setText(radio.estacionActual());
					} else {
						txt1Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(1);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn2AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(2);
					if (radio.estado()) {
						txt2Am.setText(radio.estacionActual());
					} else {
						txt2Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(2);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn3AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(3);
					if (radio.estado()) {
						txt3Am.setText(radio.estacionActual());
					} else {
						txt3Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(3);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn4AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(4);
					if (radio.estado()) {
						txt4Am.setText(radio.estacionActual());
					} else {
						txt4Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(4);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn5AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(5);
					if (radio.estado()) {
						txt5Am.setText(radio.estacionActual());
					} else {
						txt5Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(5);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn6AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(6);
					if (radio.estado()) {
						txt6Am.setText(radio.estacionActual());
					} else {
						txt6Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(6);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn7AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(7);
					if (radio.estado()) {
						txt7Am.setText(radio.estacionActual());
					} else {
						txt7Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(7);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn8AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(8);
					if (radio.estado()) {
						txt8Am.setText(radio.estacionActual());
					} else {
						txt8Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(8);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn9AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(9);
					if (radio.estado()) {
						txt9Am.setText(radio.estacionActual());
					} else {
						txt9Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(9);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn10AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(10);
					if (radio.estado()) {
						txt10Am.setText(radio.estacionActual());
					} else {
						txt10Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(10);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn11AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(11);
					if (radio.estado()) {
						txt11Am.setText(radio.estacionActual());
					} else {
						txt11Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(11);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

		btn12AM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (save) {
					radio.guardar(12);
					if (radio.estado()) {
						txt12Am.setText(radio.estacionActual());
					} else {
						txt12Fm.setText(radio.estacionActual());
					}
					changeSave();
				} else {
					radio.seleccionarEmisora(12);
					txtFrecuencia.setText(radio.estacionActual());
				}
			}
		});

	}

	private void changeSave() {
		if (this.save) {
            this.save = false;
        } else {
            this.save = true;
        }
	}

}
