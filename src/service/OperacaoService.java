package service;

import java.util.List;

import model.*;
import repository.ContaRepository;

public class OperacaoService {
	
	public ContaRepository repository = new ContaRepository();
	
	public void Deposito(int indice, Operacao operacao) {
		List<Conta> lista = repository.GetLista();
		lista.get(indice).Saldo += operacao.Valor;		
	}	
	
	public void Saque(int indice, Operacao operacao) {
		List<Conta> lista = repository.GetLista();
		lista.get(indice).Saldo -= operacao.Valor;		
	}	

}
