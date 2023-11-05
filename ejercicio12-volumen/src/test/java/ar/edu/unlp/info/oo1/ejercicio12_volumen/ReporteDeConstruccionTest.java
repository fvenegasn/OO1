package ar.edu.unlp.info.oo1.ejercicio12_volumen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	
	private ReporteDeConstruccion reporte;
	private Pieza cilindro;
	private Pieza esfera;
	private Pieza prisma;

	@BeforeEach
	public void setUp() {
		 this.cilindro = new Cilindro("Acero", "Plateado", 30, 150);
		 this.esfera = new Esfera("Hierro", "Gris", 7);
		 this.prisma = new PrismaRectangular("Hierro", "Gris", 9, 9, 4);
		 this.reporte = new ReporteDeConstruccion();
		 this.reporte.agregarPieza(this.cilindro);
		 this.reporte.agregarPieza(this.esfera);
		 this.reporte.agregarPieza(this.prisma);
	}

	@Test
	public void testVolumenDeMaterial() {
		assertEquals(this.cilindro.getVolumen(), this.reporte.getVolumenDeMaterial("Acero"));
		assertEquals((this.esfera.getVolumen() + this.prisma.getVolumen()), this.reporte.getVolumenDeMaterial("Hierro"));
		assertEquals(this.reporte.getVolumenDeMaterial("Madera"),0);
	}
	
	@Test
	public void testSuperficieDeMaterial() {
		assertEquals(this.cilindro.getSuperficieExterna(), this.reporte.getSuperficieDeColor("Plateado"));
		assertEquals((this.esfera.getSuperficieExterna() + this.prisma.getSuperficieExterna()), this.reporte.getSuperficieDeColor("Gris"));
		assertEquals(this.reporte.getSuperficieDeColor("Madera"),0);
	}
	
}
