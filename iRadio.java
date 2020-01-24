/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de datos - CC2003

Julio Herrera 19402
Marco Ramírez 19588

Interfaz Radio
Esta interfaz hace el contrato de los metodos que se definiran en las clases que la implementen.
Muestra todos los metodos que seran definidos por un objeto radio.

Last modification: 22/01/2020
*/
interface iRadio {

    /*
    Devuelve la estacion que esta sonando actualmente
    */
	/**
	 * 
	 * @return estacionActual
	 */
    String estacionActual();

    /*
    Devuelve el estado actual en que se encuentra la radio
    */
    /**
     * 
     * @return estado 
     */
    Boolean estado();

    /*
    Cambia la radio de encendida a apagada o viceversa
    */
    /**
     * @return onOff 
     */
    void onOff();

    /*
    Cambia el estado de la frecuencia AM/FM
    */
    /**
     * @return cambiarFrecuencia
     */
    void cambiarFrecuencia();

    /*
    Aumenta la frecuencia de que esta sonando actualmente
    */
    void avanzar();
    /**
     * @return avanzar
     * @param boton
     */
    /*
    Recibe el numero del boton en el que se guarda la emisora y lo agrega a la lista
    */
    void guardar(int boton);
    /**
     * 
     * @param boton
     */
    /*
    Recibe el numero del boton, busca en la lista y lo agrega a la estacion actual
    */
    void seleccionarEmisora(int boton);
    public void Estacion();
}