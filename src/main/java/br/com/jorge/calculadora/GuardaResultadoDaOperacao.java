package br.com.jorge.calculadora;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GuardaResultadoDaOperacao {

	public static void escrever(BigDecimal valor1, BigDecimal valor2, String operacao) throws IOException {
		FileWriter fw = new FileWriter("numeroscalculados.txt", true);

		fw.append("Dia: " + getDataAtual() + ". " + operacao + " de " + valor1 + " e " + valor2 + "." + "\n");
		fw.close();
	}

	public static String getDataAtual() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.now().format(formatador);
	}
}
