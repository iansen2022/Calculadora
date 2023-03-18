package calculadora;

import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		double n1, n2;
		double soma, subtracao, multiplicacao, divisao;
		int op;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		n1 = entrada.nextDouble();
		System.out.println("Informe o segundo valor: ");
		n2 = entrada.nextDouble();
		
		System.out.println("######Selecione uma opera��o#####");
		System.out.println("[1]  -  Somar");
		System.out.println("[2]  -  Subtrair");
		System.out.println("[3]  -  Multiplicar");
		System.out.println("[4]  -  Dividir");
		System.out.println(">>>>>>>>Digite sua op��o");
		op = entrada.nextInt();
		
		switch (op) {
		case 1: 
			soma = n1+n2;
			System.out.println("A soma �: "+soma);
			break;
		
		case 2: 
			subtracao = n1-n2;
			System.out.println("A subitra��o �: "+subtracao);
			break;
			
		case 3: 
			multiplicacao = n1*n2;
			System.out.println("A multiplica��o �: "+multiplicacao);
			break;
		
		case 4: 
			if (n1<n2) {
				System.out.println("Imposs�vel de realizar o c�lculo");
			}
			else {
				divisao = n1/n2;
				System.out.println("A divis�o �: "+divisao);
			}
			break;
			
		default:
			System.out.println("Opera��o inv�lida");
			
		}
		

	}

}
