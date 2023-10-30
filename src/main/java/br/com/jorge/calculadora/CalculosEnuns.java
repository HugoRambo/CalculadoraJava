package br.com.jorge.calculadora;


import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public enum CalculosEnuns implements Operacao {

	SOMA {
		public BigDecimal calcula(BigDecimal valor1, BigDecimal valor2) throws IOException {
			return valor1.add(valor2);
		}
	},

	SUBTRACAO {
		public BigDecimal calcula(BigDecimal valor1, BigDecimal valor2) throws IOException {
			return valor1.subtract(valor2);
		}
	},

	MULTIPLICACAO {
		public BigDecimal calcula(BigDecimal valor1, BigDecimal valor2) throws IOException {
			return valor1.multiply(valor2);
		}
	},

	DIVISAO {
		public BigDecimal calcula(BigDecimal valor1, BigDecimal valor2) throws IOException {
			return BigDecimal.valueOf(valor1.doubleValue() / valor2.doubleValue()).setScale(2, RoundingMode.HALF_UP);
		}

	};

}