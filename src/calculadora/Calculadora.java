package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
		scan.close();
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}

}
