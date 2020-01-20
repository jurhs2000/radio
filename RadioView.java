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

	private JFrame frmRadio;
	private JTextField txtNumero;
	private JTextField txtFrecuencia;

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
		
		JButton btn1AM = new JButton("500.00");
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
		
		btnOn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnAM.setEnabled(true);
				btnFM.setEnabled(true);
				btnNext.setEnabled(true);
				txtFrecuencia.setEnabled(true);
				lblRadio.setEnabled(true);
				
				
				
				
			}
		});
		btnOff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
				
				
				
			}
		});
		btnAM.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
				lblFavAmFm.setText("Favoritas");
				lblNumero.setEnabled(true);
				
			}
		});
		btnFM.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
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
				lblFavAmFm.setText("Favoritas");
				btnSave.setEnabled(true);
				lblNumero.setEnabled(true);
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
		
		
	}

	private void limpiar() {
		// TODO Auto-generated method stub
		txtNumero.setText("");
	}
	

}
