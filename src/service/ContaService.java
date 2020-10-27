package service;

import model.Conta;
import repository.ContaRepository;

public class ContaService {
	
	public ContaRepository repository = new ContaRepository();
	
	public String SetConta(Conta conta) {		
		
		if (conta.Cpf == "")
			return "Erro: o CPF não foi preenchido";		
		
		repository.SetConta(conta);
		return "";		
	}
	
	
	public Conta GetConta(int indice) {
		
		if (indice > 9)
			return new Conta();
		
		return repository.GetConta(indice);
	}

}
