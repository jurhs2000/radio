
public interface RadioInterface {
	
	public void onOff();
	
	public void cambiarFrecuencia();
	
	public void avanzar();
	
	public void guardar(int boton);
	
	public void seleccionarEmisora(int boton);
	
	public String estacionActual();
	
	public boolean estado();

	
}
