package subsistema2.crm;

import one.digitalInnovationOne.ogf.singleton.SingletonEager;

public class CepApi {

private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {	
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Recanto das Emas";
	}
	
	public String recuperarEstado(String cep) {
		return "Brasília";
	}
}
