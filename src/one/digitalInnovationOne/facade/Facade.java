package one.digitalInnovationOne.facade;

import subsistema.crm.CrmService;
import subsistema2.crm.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		System.out.println(nome);
		System.out.println(cidade);
		System.out.println(cep);
		System.out.println(estado);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
	
}
