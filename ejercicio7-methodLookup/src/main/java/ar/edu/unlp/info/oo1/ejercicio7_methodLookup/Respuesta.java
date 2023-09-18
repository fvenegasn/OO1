package ar.edu.unlp.info.oo1.ejercicio7_methodLookup;

public class Respuesta {
	
	// Fragmento 1
	Gerente alan = new Gerente("Alan Turing");
	double aportesDeAlan = alan.aportes();
	
	// Orden de ejecución
	// -> Genera un objeto de tipo Gerente con nombre "Alan Turing"
	// -> Entra al constructor de Gerente, de EmpleadoJerarquico y a la de Empleado, donde hace la asignación
	// -> Asignará a aportesDeAlan el valor que retorne el método aportes()
	// -> Entra a "aportes" de Gerente e invoca a "montoBasico" de Gerente (obtiene 57000)
	// -> aportesDeAlan = 57000*0.05 = 2850
	
	// Fragmento 2
	double sueldoBasicoDeAlan = alan.sueldoBasico();
	
	// Orden de ejecución
	// -> Asignará a sueldoBasicoDeAlan el valor que retorne el método sueldoBasico()
	// -> Entra a Gerente y no encuentra, entra a EmpleadoJerarquico y toma bonoPorCategoría para sumarlo con el sueldoBasico de Empleado
	// -> sueldoBasico de Empleado hace this.montoBasico entonces es 57000+aportes(2250)
	// -> a eso le sumamos el bonoPorCategoria y tenemos que sueldoBasicoDeAlan es
	// -> 57000+2850+8000 = 67850
	
}
