package calculadora;

import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		double n1, n2;
		double soma, sutracao, multiplicacao, divisao;
		int op;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor: ");
		n1 = entrada.nextDouble();
		System.out.println("Informe o segundo valor: ");
		n2 = entrada.nextDouble();
		
		System.out.println("######Selecione uma operação#####");
		System.out.println("[1]  -  Somar");
		System.out.println("[2]  -  Subtrair");
		System.out.println("[3]  -  Multiplicar");
		System.out.println("[4]  -  Dividir");
		System.out.println(">>>>>>>>Digite sua opção");
		op = entrada.nextInt();
		
		switch (op) {
		case 1: 
			soma = n1+n2;
			System.out.println("A soma é: "+soma);
			break;

		}
		

	}

}
