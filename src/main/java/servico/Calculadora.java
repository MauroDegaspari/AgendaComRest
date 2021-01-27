package servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import entidade.RetornoCalculadora;

@Path("/calculadora") // caminho da HTTP
public class Calculadora {

	@Path("/") // Por DEFAULT ele chama o metodo GET
	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public String Ola() {
		return "Showw";
	}
	
//	@Path("/somar") 
//	@Produces(MediaType.TEXT_PLAIN)
//	@GET                // PARAMETRO QUERYPARAM SETA O VALOR DENTRA DA VARIAVEL
// 	public RetornoCalculadora Somar(@QueryParam("valor1") int valor1,
// 									@QueryParam ("valor2") int valor2) {
//		RetornoCalculadora retorno = new RetornoCalculadora();
//		
//		retorno.setCodigoRetorno(0);
//		retorno.setMensagemRetorno("SUCESSO...");
//		retorno.setValorRetorno(valor1 + valor2);
//		
//		return retorno;
//	}
	
	@Path("/somar") 
	@Produces(MediaType.TEXT_PLAIN)
	@GET                // PARAMETRO QUERYPARAM SETA O VALOR DENTRA DA VARIAVEL
 	public String Somar(@QueryParam("valor1") int valor1,
 						@QueryParam ("valor2") int valor2) {
		
		
		return "Resultado " +(valor1+ valor2);
	}
	
	
}
