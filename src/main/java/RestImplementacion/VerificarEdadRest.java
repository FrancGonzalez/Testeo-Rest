package RestImplementacion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import Metodos.metodos;

@Path("/Verificacion")
public class VerificarEdadRest implements metodos{

	@Override
	public String sumar(Long n1, Long n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dividir(Long n1, Long n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String multiplicar(Long n1, Long n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String restar(Long n1, Long n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@GET
	@Path("/VerificacionEdad/{edad}")
	public String verificacionedad(@PathParam (value = "edad") Long edad) {
		if (edad >= 18) {
			return "Tienes " + edad + " ,Eres Mayor De Edad";
		} else {
			return "Tienes " + edad + " ,Eres Menor De Edad";
		}
	}

}
	
