package Cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class ClienteRest {

	public static void main(String[] args) throws Exception  {

		Calculadora("multiplicar", 10,5);
		Calculadora("sumar", 10,5);
		Calculadora("dividir", 10,5);
		Calculadora("restar", 10,5);
		
		
	}

	private static void Calculadora(String operacion, int n1, int n2) throws Exception {
		
		Client Cliente = null;
		
		Cliente = ClientBuilder.newClient();
		
		WebTarget WR = Cliente.target("http://localhost:8080/TesteoRest/Calculadora/Operaciones");
									   
		WR = WR.path("/" + operacion + "/"+ n1 + "/" + n2);
		
		Invocation.Builder builder = WR.request();
		
		String respuesta = builder.get(String.class);
		
		System.out.println(respuesta);
		
		
	}

}
