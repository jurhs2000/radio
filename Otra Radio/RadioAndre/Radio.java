/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de datos - CC2003

Julio Herrera 19402
Marco Ramírez 19588

Radio
Simula una radio con frecuencias AM que van de 530 a 1610 en intervalos de 10 en 10
Y FM que van de 87.9 a 107.9 en intervalos de 0.2 en 0.2

Last modification: 20/01/2020
*/
import java.text.DecimalFormat;
import java.util.ArrayList;

class Radio implements iRadio {

    private boolean onOff; //guarda el estado de encendido o apagado
    private boolean amFm; //guarda el estado de AM/FM FALSE = AM / TRUE = FM
    private double estacionActual; //guarda la estacion actual
    private ArrayList<Double> estacionesAm; //Botones de estaciones AM
    private ArrayList<Double> estacionesFm; //Botones de estaciones FM
    private static DecimalFormat df = new DecimalFormat("#.#");
    
    public Radio() {
        onOff = false; //<-- Apagado
        amFm = false; //<-- Am
        estacionActual = 530.0; //Inicio de las estaciones
        estacionesAm = new ArrayList<Double>(12);
        estacionesFm = new ArrayList<Double>(12);
        for (int i = 0; i < 12; i++) {
            estacionesAm.add(i+1.0);
            estacionesFm.add(i+1.0);
        }
    }

    public String estacionActual() {
        return df.format(this.estacionActual); // convierte a string para mostrar en label
    }

    public Boolean estado() {
        return this.onOff;
    }

    public void onOff() { //Cambia de true a false y viceversa
        if (this.onOff) {
            this.onOff = false;
        } else {
            this.onOff = true;
        }
    }

    public void cambiarFrecuencia() {
        if (this.amFm) {
            this.amFm = false;
            this.estacionActual = 530.0; //Al ser puesto en AM se reinicia con la estacion de inicio como la actual
        } else {
            this.amFm = true;
            this.estacionActual = 87.9; //Al ser puesto en FM se reinicia con la estacion de inicio como la actual
        }
    }

    public void avanzar() {
        if (this.amFm) {
            this.estacionActual += 0.2; //En estaciones FM suma en +0.2
        } else {
            this.estacionActual += 10.0; //En estaciones AM suma en +10
        }
        returnToPrincipalStation();
    }

    private void returnToPrincipalStation() { //Revisa si la estacion actual supera su limite superior y lo regresa al inicial
        if (this.amFm) {
            if (this.estacionActual > 107.9) {
                this.estacionActual = 87.9;
            }
        } else {
            if (this.estacionActual > 1610.0) {
                this.estacionActual = 530.0;
            }
        }
    }

    public void guardar(final int boton) { //Guarda la estacion actual en la posicion del boton seleccionado a la lista indicada
        if (this.amFm) {
            this.estacionesFm.set(boton, this.estacionActual);
        } else {
            this.estacionesAm.set(boton, this.estacionActual);
        }
    }

    public void seleccionarEmisora(int boton) { //Toma el valor del boton seleccionado en la lista de estaciones y la coloca en la actual
        boton -= 1;
        if (this.amFm) {
            if (estacionesFm.get(boton) >= 87.9) {
                this.estacionActual = this.estacionesFm.get(boton);
            }
        } else {
            if (estacionesAm.get(boton) >= 530.0) {
                this.estacionActual = this.estacionesAm.get(boton);
            }
        }
    }

	@Override
	public void Estacion() {
		 System.out.println("La laa la raa laaa!");
	}
    
}