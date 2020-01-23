/*
Universidad del Valle de Guatemala
Algoritmos y estructuras de datos - CC2003

Julio Herrera 19402
Marco Ramírez 19588

Main
Clase principal del programa de Radio, esta clase se encarga de ejecutar el metodo principal
e invocar a la ventada de la interfaz grafica de la radio en la clase RadioView

Last modification: 22/01/2020
*/
import java.awt.EventQueue;

class Main {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
				try {
                    RadioView window = new RadioView();
                    window.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
        });
    }
}