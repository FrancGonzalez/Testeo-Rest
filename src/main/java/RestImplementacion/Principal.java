package RestImplementacion;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/Calculadora")
public class Principal extends Application{

	
	//PARA FORMAR LA DIRECCION URL ES ASI:
	
	// http://localhost:8080 
	// /NOMBRE-PROYECTO
	// /NOMBRE-DE-APPLICATIONPATH
	// /NOMBRE-DEL-PATH-DONDE-ESTAN-LOS-METODOS
	// /NOMBRE-DEL-METODO
	// /LOS-PARAMETROS
	
	// EJEMPLO:
	
	//    http://localhost:8080/TesteoRest/Calculadora/Operaciones/sumar
	 
}
