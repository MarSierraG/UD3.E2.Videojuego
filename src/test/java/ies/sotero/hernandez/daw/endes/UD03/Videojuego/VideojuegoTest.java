package ies.sotero.hernandez.daw.endes.UD03.Videojuego;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VideojuegoTest 
{
    /**
     * Rigorous Test :-)
     */
	
	private Videojuego v;
	private Videojuego v2;
	private Videojuego v3;
	private Videojuego v4;
	private Videojuego v5;
	
	
	
	@BeforeEach
	public void videojuegos() {
		v = new Videojuego();
		v2 = new Videojuego();
		v3 = new Videojuego("TWD",20,"Terror","Flux Games");
		v4 = new Videojuego("Phasmophobia",2,"Terror","huigy");
		v5 = new Videojuego("Mario","kfjj");
	}
	
	@Test
	public void igualar() {
		assertTrue(v.equals(v2));
		assertFalse(v.equals(v4));
	}
	
	@Test
	public void comparar() {
		assertEquals(Videojuego.MAYOR,v.compareTo(v3));
		assertEquals(Videojuego.IGUAL,v.compareTo(v2));
		assertEquals(Videojuego.MENOR,v4.compareTo(v3));
	}
	
	@Test
	public void entregar() {
		v.entregar();
		assertTrue(v.isEntregado());

		v.devolver();
		assertFalse(v.isEntregado());
	}
	
	@Test
	public void testToString() {
		assertEquals("Informacion del videojuego: \n" +
                "\tTitulo: TWD\n" +
                "\tHoras estimadas: 20\n" +
                "\tGenero: Terror\n" +
                "\tcompania: Flux Games", v3.toString());
	}
	
	@Test
	public void setters() {
		v3.setGenero("Suspense");
		v5.setTitulo("Mario Bros");
		v5.setHorasEstimadas(30);
		v5.setcompania("J");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
}