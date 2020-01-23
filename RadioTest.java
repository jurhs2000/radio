import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class radioTest {
	
	@Test
	void estacionActualTest() {
		Radio radio = new Radio();
		String esperado = "530";
		String resultado = radio.estacionActual();
		assertEquals(esperado, resultado);
	}
	
	@Test
	void estadoTest() {
		Radio radio = new Radio();
		Boolean resultado = radio.estado();
		assertFalse(resultado);
	}
	
	@Test
	void cambiarFrecuenciaTest() {
		Radio radio = new Radio();
		radio.cambiarFrecuencia();
		String esperado = "87.9";
		String resultado = radio.estacionActual();
		assertEquals(esperado, resultado);
	}
	
	@Test
	void avanzarTest() {
		Radio radio = new Radio();
		radio.avanzar();
		String esperado = "540";
		String resultado = radio.estacionActual();
		assertEquals(esperado, resultado);
	}
}
