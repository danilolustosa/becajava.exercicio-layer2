import java.util.Scanner;

import model.*;
import service.*;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);		
		ContaService contaService = new ContaService();
		OperacaoService operacaoService = new OperacaoService();
		
		
		
		//TRANFER�NCIA
		Operacao operacao = new Operacao();
		System.out.println("Digite o valor para a realiza��o da opera��o: ");
		operacao.Valor = leitor.nextDouble();
		System.out.println("Digite o �ndice da conta de ORIGEM para a realiza��o da opera��o: ");
		int indiceOrigem = leitor.nextInt();
		System.out.println("Digite o �ndice da conta de DESTINO para a realiza��o da opera��o: ");
		int indiceDestino = leitor.nextInt();
		String result = operacaoService.Transferencia(indiceOrigem, indiceDestino, operacao);
		
		if (result != "")
			System.out.println(result);
		else
			System.out.println("Transfer�ncia realizada com sucesso!");
		
		
		//SAQUE
//		Operacao operacao = new Operacao();
//		System.out.println("Digite o valor para a realiza��o da opera��o: ");
//		operacao.Valor = leitor.nextDouble();
//		System.out.println("Digite o �ndice da conta para a realiza��o da opera��o: ");
//		operacaoService.Saque(leitor.nextInt(), operacao);
		
		
		//DEP�SITO
//		Operacao operacao = new Operacao();
//		System.out.println("Digite o valor para a realiza��o da opera��o: ");
//		operacao.Valor = leitor.nextDouble();
//		System.out.println("Digite o �ndice da conta para a realiza��o da opera��o: ");
//		operacaoService.Deposito(leitor.nextInt(), operacao);
		
		
		//OBTENDO UM CONTA		
//		System.out.println("Informe o �ndice da conta que gostaria de obter:");
//		Conta conta = contaService.GetConta(leitor.nextInt());
//		
//		if (conta.Numero == null)
//			System.out.println("Erro: conta inexistente.");
//		else			
//			System.out.println("Nome: " + conta.Nome + " ---- Numero: " + conta.Numero);
		
		
		
		//GRAVAR NOVA CONTA
//		Conta newConta = new Conta();
//		newConta.Agencia = "1111111";
//		newConta.Cpf = "43535";
//		newConta.Nome = "Juliana";
//		newConta.Numero = "3874328743287";		
//		contaService.SetConta(newConta);
		
		
		leitor.close();

	}

}
