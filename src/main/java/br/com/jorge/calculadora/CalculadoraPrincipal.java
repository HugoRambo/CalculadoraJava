package br.com.jorge.calculadora;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean continua = true;

		while (continua) {

			System.out.println("Soma | Subtração | Multiplicação | Divisão. \nObs: Não digite com acentuações.");
			System.out.println("Qual operação deseja efetuar?");
			String operacao = scan.next();

			System.out.println("Digite o primeiro valor: ");
			BigDecimal valor1 = scan.nextBigDecimal();

			System.out.println("Digite o segundo valor: ");
			BigDecimal valor2 = scan.nextBigDecimal();

			try {
				CalculosEnuns calc = CalculosEnuns.valueOf(operacao.toUpperCase());
				System.out.println("O resultado é: " + calc.calcula(valor1, valor2));
				GuardaResultadoDaOperacao.escrever(valor1, valor2, operacao.toUpperCase());
			} catch (IllegalArgumentException | IOException exception) {
				System.out.println("Não existe o Enum: " + operacao.toUpperCase());
			} finally {
				System.out.println("Deseja continuar a operação?  \n1 - Sim \n2 - Não");
				int reiniciar = scan.nextInt();
				if (reiniciar == 2) {
					continua = false;
					scan.close();
				}
			}

		}

		System.out.println("Obrigado por utilizar a calculadora!");

	}
}
