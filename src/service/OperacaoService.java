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
	
	public String Transferencia(int indiceOrigem, int indiceDestino, Operacao operacao) {
		
		if (indiceOrigem > 9)
			return "Erro: conta inexistente.";
		
		if (indiceDestino > 9)
			return "Erro: conta inexistente.";
		
		if (indiceOrigem == indiceDestino) 
			return "Erro: não é possível realizar transferências de valores entre a mesma conta.";
		
		
		List<Conta> lista = repository.GetLista();		
		lista.get(indiceOrigem).Saldo -= operacao.Valor;
		lista.get(indiceDestino).Saldo += operacao.Valor;
		
		return "";
	}

}
