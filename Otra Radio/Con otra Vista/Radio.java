import java.text.DecimalFormat;



public class Radio implements RadioInterface{

	private Integer[] frecuenciasAM;
	private Double[] frecuenciasFM;
	private boolean estado;
	private String tipoFrecuencia;
	
	
	private int am; 
	private double fm;
	
	
	
	public Radio() {
		frecuenciasAM = new Integer[12];
		frecuenciasFM = new Double[12];
		estado = false;
		tipoFrecuencia = "FM";
		am = 530;
		fm =  87.9;
	}
	
	
	
	
	
	/**
	 * Funcion para encender y apagar el radio, funciona con estado booleanos
	 */
	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		
		if (estado == false) {
			estado = true;
		}else if (estado == true) {
			estado = false;
		}
		
	}
	
	
	/**
	 * Funcion para cambiar de frecuencia de am a fm y viceversa
	 */
	@Override
	public void cambiarFrecuencia() {
		// TODO Auto-generated method stub
		if (tipoFrecuencia.equals("FM")) {
			tipoFrecuencia = "AM";
		}else if (tipoFrecuencia.equals("AM")) {
			tipoFrecuencia = "FM";
		}
	}
	
	
	/**
	 * Funcion para avanzar de frecuencia ya sea am o fm
	 */
	@Override
	public void avanzar() {
		// TODO Auto-generated method stub
		if (tipoFrecuencia.equals("FM")) {
			if (fm == 107.90000000000029 || fm == 107.9) {
				fm = 87.9;
			}else {
				fm = fm + 0.2;
			}
		}else if (tipoFrecuencia.equals("AM")) {
			if (am == 1610) {
				am = 530;
			}else {
				am = am + 10;
			}
		}
	}
	
	
	/**
	 * Funcion para guardar una frecuencia ya sea am o fm en boton indicado
	 */
	@Override
	public void guardar(int boton) {
		// TODO Auto-generated method stub
		if (tipoFrecuencia.equals("FM")) {
			frecuenciasFM[boton] = fm;
		}else if(tipoFrecuencia.equals("AM")) {
			frecuenciasAM[boton] = am;
		}
	}
	
	/**
	 * funcion para seleccionar una emisora que ya fue guardada anteriormente
	 */
	@Override
	public void seleccionarEmisora(int boton) {
		// TODO Auto-generated method stub
		try {
		if (tipoFrecuencia.equals("FM")) {
			fm = frecuenciasFM[boton];
		}else if (tipoFrecuencia.equals("AM")) {
			am = frecuenciasAM[boton];
		}
		}catch(Exception ex) {}
		
	}
	
	/**
	 * funcion para poder dar a conocer la estacion que se esta sintonizando actulmente
	 */
	@Override
	public String estacionActual() {
		DecimalFormat df = new DecimalFormat("###.0");
		// TODO Auto-generated method stub
		String estacion = "";
		if (tipoFrecuencia.equals("FM")) {
			
			estacion = ""+df.format(fm);
		}else if (tipoFrecuencia.equals("AM")) {
			estacion = "" + am;
		}
		
		return estacion;
	}
	
	
	/**
	 * Funcion para obtener el estado del radio, encendido o apagado
	 */
	@Override
	public boolean estado() {
		// TODO Auto-generated method stub
		return estado;
	}
	
	
	
	
	
}
