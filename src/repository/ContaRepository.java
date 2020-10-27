package repository;

import java.util.ArrayList;
import java.util.List;

import model.Conta;

public class ContaRepository {
	
	private List<Conta> Lista = new ArrayList<Conta>();	
	
	public void SetConta(Conta conta) {		
		Lista.add(conta);		
	}
	
	public Conta GetConta(int indice) {		
		SetLista();
		return Lista.get(indice);		
	}
	
	public List<Conta> GetLista(){
		SetLista();
		return Lista;
	}
	
	private void SetLista(){
		Conta conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Caio Santos";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Gabriel";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Stephanie";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Eduarda";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Tarsila";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Leandro";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Silvio";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Jhonathan";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Franciele";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Guilherme";
		conta.Numero = "394839-84";
		Lista.add(conta);
		
		conta = new Conta();
		conta.Agencia = "783748";
		conta.Cpf = "9893474";
		conta.Nome = "Eduardo";
		conta.Numero = "394839-84";
		Lista.add(conta);
	}

}
