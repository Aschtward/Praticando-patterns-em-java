package dio.one.patterns.facade;

import subsistema.crm.CrmService;
import subsistema1.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		System.out.println(nome);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
