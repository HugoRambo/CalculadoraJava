package br.com.jorge.calculadora;


import java.io.IOException;
import java.math.BigDecimal;

public interface Operacao {

	public BigDecimal calcula(BigDecimal valor1, BigDecimal valor2) throws IOException;

}