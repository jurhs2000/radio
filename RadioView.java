import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import com.sun.source.tree.WhileLoopTree;

import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class RadioView {

	private JFrame frmRadio;
	private JTextField txtNumero;
	private JTextField txtFrecuencia;
//	private double am=10.0;
//	private double x=530.0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioView window = new RadioView();
					window.frmRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioView() {
		initialize();
	//	double am=10.0;
	//	double x=530.0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Radio R = new Radio();
		//Estacion(R);
		
		
		frmRadio = new JFrame();
		frmRadio.setTitle("RADIO\r\n");
		frmRadio.setResizable(false);
		frmRadio.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmRadio.getContentPane().setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		frmRadio.setBounds(100, 100, 777, 388);
		frmRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadio.getContentPane().setLayout(null);
		
		JButton btnOn = new JButton("On");
		btnOn.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		btnOn.setBounds(14, 11, 56, 23);
		frmRadio.getContentPane().add(btnOn);
		
		JButton btnOff = new JButton("Off");
		btnOff.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		btnOff.setBounds(80, 11, 56, 23);
		frmRadio.getContentPane().add(btnOff);
		
		JButton btn1AM = new JButton("1");
		
		btn1AM.setEnabled(false);
		btn1AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn1AM.setBounds(14, 311, 56, 23);
		frmRadio.getContentPane().add(btn1AM);
		
		JButton btn2AM = new JButton("2");
		btn2AM.setEnabled(false);
		btn2AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn2AM.setBounds(67, 311, 56, 23);
		frmRadio.getContentPane().add(btn2AM);
		
		JButton btn3AM = new JButton("3");
		btn3AM.setEnabled(false);
		btn3AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn3AM.setBounds(122, 311, 62, 23);
		frmRadio.getContentPane().add(btn3AM);
		
		JButton btn4AM = new JButton("4");
		btn4AM.setEnabled(false);
		btn4AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn4AM.setBounds(186, 311, 62, 23);
		frmRadio.getContentPane().add(btn4AM);
		
		JButton btn5AM = new JButton("5");
		btn5AM.setEnabled(false);
		btn5AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn5AM.setBounds(252, 311, 62, 23);
		frmRadio.getContentPane().add(btn5AM);
		
		JButton btn6AM = new JButton("6");
		btn6AM.setEnabled(false);
		btn6AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn6AM.setBounds(315, 311, 62, 23);
		frmRadio.getContentPane().add(btn6AM);
		
		JButton btn7AM = new JButton("7");
		btn7AM.setEnabled(false);
		btn7AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn7AM.setBounds(376, 311, 62, 23);
		frmRadio.getContentPane().add(btn7AM);
		
		JButton btn8AM = new JButton("8");
		btn8AM.setEnabled(false);
		btn8AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn8AM.setBounds(439, 311, 62, 23);
		frmRadio.getContentPane().add(btn8AM);
		
		JButton btn9AM = new JButton("9");
		btn9AM.setEnabled(false);
		btn9AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn9AM.setBounds(501, 311, 62, 23);
		frmRadio.getContentPane().add(btn9AM);
		
		JButton btn10AM = new JButton("10");
		btn10AM.setEnabled(false);
		btn10AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn10AM.setBounds(566, 311, 62, 23);
		frmRadio.getContentPane().add(btn10AM);
		
		JButton btn11AM = new JButton("11");
		btn11AM.setEnabled(false);
		btn11AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn11AM.setBounds(629, 311, 62, 23);
		frmRadio.getContentPane().add(btn11AM);
		
		JButton btn12AM = new JButton("12");
		btn12AM.setEnabled(false);
		btn12AM.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 10));
		btn12AM.setBounds(692, 311, 62, 23);
		frmRadio.getContentPane().add(btn12AM);
		
		JLabel lblFavAmFm = new JLabel("Emisoras Favoritas");
		lblFavAmFm.setEnabled(false);
		lblFavAmFm.setHorizontalAlignment(SwingConstants.LEFT);
		lblFavAmFm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblFavAmFm.setBounds(20, 222, 184, 52);
		frmRadio.getContentPane().add(lblFavAmFm);
		
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
		btnSave.setBounds(264, 277, 89, 23);
		frmRadio.getContentPane().add(btnSave);
		
		JLabel lblNumero = new JLabel("Numero de boton a guardar");
		lblNumero.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblNumero.setBounds(14, 270, 170, 30);
		frmRadio.getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(168, 276, 86, 20);
		frmRadio.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		txtFrecuencia = new JTextField();
		txtFrecuencia.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 70));
		txtFrecuencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrecuencia.setText("FRECUENCIA");
		txtFrecuencia.setEnabled(false);
		txtFrecuencia.setEditable(false);
		txtFrecuencia.setBounds(122, 62, 467, 128);
		frmRadio.getContentPane().add(txtFrecuencia);
		txtFrecuencia.setColumns(10);
		
		JButton BF_cambiar = new JButton("Cambiar Frecuencia");
		
		BF_cambiar.setBounds(599, 117, 155, 23);
		frmRadio.getContentPane().add(BF_cambiar);
		
		JLabel lblF = new JLabel("");
		lblF.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 20));
		lblF.setBounds(599, 76, 119, 23);
		frmRadio.getContentPane().add(lblF);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				// TODO Auto-generated method stub
				//musica.avanzar();
				//txtFrecuencia.setText(String.valueOf(musica.avanzar()));
		/*		if((x+am)<=1610.0) {
					txtFrecuencia.setText(String.valueOf(x+am));
					am+=10.0;
				}else {
					
					txtFrecuencia.setText(String.valueOf(x));
					
				} */
				
			
				txtFrecuencia.setText(CambioAM(R));
				
				
				
					
				
				
			}
		});

		btnOn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				btnNext.setEnabled(true);
				txtFrecuencia.setEnabled(true);
				lblRadio.setEnabled(true);
				BF_cambiar.setEnabled(true);
				lblFavAmFm.setEnabled(true);
				
				
				
				
			}
		});
		BF_cambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lblF.setText("FM");
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
				btnSave.setEnabled(true);
				lblF.setEnabled(true);
				lblNumero.setEnabled(true);
				txtFrecuencia.setText(Cfrecuencia(R));
				if(Double.valueOf(txtFrecuencia.getText())>=530.0) {
					lblF.setText("AM");
							
				}else if(Double.valueOf(txtFrecuencia.getText())<=530.0) {
					lblF.setText("FM");
				}
			//	lblF.setText(Cfrecuencia(R)+"am");
				//lblF.setText("AM");
				
			}
		});
		btnOff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lblFavAmFm.setEnabled(false);

				
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
				BF_cambiar.setEnabled(false);
				lblF.setEnabled(false);
				lblNumero.setEnabled(false);
				
				
			}
		});
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (txtNumero.getText().equals("1")) {		
					
					btn1AM.setText(txtFrecuencia.getText());
				}else {
					if (txtNumero.getText().equals("2")) {
						btn2AM.setText(txtFrecuencia.getText());					
					}else {
						if (txtNumero.getText().equals("3")) {
							btn3AM.setText(txtFrecuencia.getText());					
						}else {
							
								
									if (txtNumero.getText().equals("4")) {
										btn4AM.setText(txtFrecuencia.getText());					
									}else {
										if (txtNumero.getText().equals("5")) {
											btn5AM.setText(txtFrecuencia.getText());					
										}else {
											if (txtNumero.getText().equals("6")) {
												btn6AM.setText(txtFrecuencia.getText());					
											}else {
												if (txtNumero.getText().equals("7")) {
													btn7AM.setText(txtFrecuencia.getText());					
												}else {
													if (txtNumero.getText().equals("8")) {
														btn8AM.setText(txtFrecuencia.getText());					
													}else {
														if (txtNumero.getText().equals("9")) {
															btn9AM.setText(txtFrecuencia.getText());					
														}else {
															if (txtNumero.getText().equals("10")) {
																btn10AM.setText(txtFrecuencia.getText());					
															}else {
																if (txtNumero.getText().equals("11")) {
																	btn11AM.setText(txtFrecuencia.getText());					
																}else {
																	if (txtNumero.getText().equals("12")) {
																		btn12AM.setText(txtFrecuencia.getText());					
																	}else {
																		
																		JOptionPane.showMessageDialog(lblNumero, "Introduzca un boton valido");
																		
																	}
																		
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
							limpiar();
			}
		});
		btn1AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn1AM.getText());
			}
		});
		btn2AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn2AM.getText());
			}
		});
		btn3AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn3AM.getText());
			}
		});
		btn4AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn4AM.getText());
			}
		});
		btn5AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn5AM.getText());
			}
		});
		btn6AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn6AM.getText());
			}
		});
		btn7AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn7AM.getText());
			}
		});
		btn8AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn8AM.getText());
			}
		});
		btn9AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn9AM.getText());
			}
		});
		btn10AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn10AM.getText());
			}
		});
		btn11AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn11AM.getText());
			}
		});
		btn12AM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrecuencia.setText(btn12AM.getText());
			}
		});
		
		
		
	}

	private void limpiar() {
		// TODO Auto-generated method stub
		txtNumero.setText("");
	}
	public static void Estacion(iRadio ir) {
		ir.Estacion();
	}
	public static void ColocarEstacion(iRadio ir) {
		ir.cambiarFrecuencia();
		//txtFrecuencia=ir.estacionActual();
		//String.valueOf(ir.cambiarFrecuencia());
		System.out.println("La laa la raa laaa!");
	}
	public String  FR(iRadio ir) {
		//System.out.println(ir.estacionActual());
		return ir.estacionActual();
		
		
		
	}
	public String  CambioAM(iRadio ir) {
		//System.out.println(ir.estacionActual());
		ir.avanzar();
		
		double ld_estacion;
		ld_estacion = Double.parseDouble(ir.estacionActual());
		ld_estacion = Math.round(ld_estacion * 100.0) /100.0;
		return String.valueOf(ld_estacion);
		
		//return ir.estacionActual();
	}
	
	public String  Cfrecuencia(iRadio ir) {
		//System.out.println(ir.estacionActual());
		ir.cambiarFrecuencia();
	/*	double ld_estacion;
		ld_estacion = Double.parseDouble(ir.estacionActual());
		ld_estacion = Math.round(ld_estacion * 100.0) /100.0;
		return String.valueOf(ld_estacion);*/
		
		return ir.estacionActual();
	}
}


