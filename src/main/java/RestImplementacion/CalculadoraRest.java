package RestImplementacion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import Metodos.metodos;

@Path("/Operaciones")
public class CalculadoraRest implements metodos{

	@Override
	@GET
	@Path("/sumar/{n1}/{n2}")
	public String sumar(@PathParam(value = "n1") Long n1,@PathParam(value = "n2") Long n2) {
		return "La suma es: " + (n1+n2);
	}

	@Override
	@GET
	@Path("/dividir/{n1}/{n2}")
	public String dividir(@PathParam(value = "n1") Long n1,@PathParam(value = "n2") Long n2) {
		return "La division es: " + (n1/n2);
	}

	@Override
	@GET
	@Path("/multiplicar/{n1}/{n2}")
	public String multiplicar(@PathParam(value = "n1") Long n1,@PathParam(value = "n2") Long n2) {
		return "La multiplicacion es: " + (n1*n2) ;
	}

	@Override
	@GET
	@Path("/restar/{n1}/{n2}")
	public String restar(@PathParam(value = "n1") Long n1,@PathParam(value = "n2")  Long n2) {
		return "La resta es: " + (n1-n2);
	}

	@Override
	public String verificacionedad(Long edad) {
		// TODO Auto-generated method stub
		return null;
	}


}
