/**
 * @author Desktop
 * Autor: Alessandro Soares
 * 
 */
package br.com.alessandro.aula_03;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Operacoes_Basicas_Numeros {

	/**
	 * 
	 */
	public Operacoes_Basicas_Numeros() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /**
	     * Aula 3.
		 * Vamos criar mais um exemplo simples para ilustrar como operações básicas podem ser
		 * realizadas em Java.
		 * O problema a ser resolvido é criar um programa que exiba o valor das quatro operações 
		 * matemática.
		 * Vou utilizar o "MODO TEXTO" pertencente a classe "Scanner" e também no "MODO GRÁFICO" 
		 * do Java pertencente ao pacote "SWING".
		 */	
		int v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 1º número: "));
		int v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o 2º número: ")); 
		int divisao =  v1 / v2;
		int multiplicacao =  v1 * v2;
		int soma =  v1 + v2;
		int subtracao =  v1 - v2;
		/* ############################################################################################### */
		/* ##########################	RESULTADO FEITO NO MODO TEXTO	################################## */
		/* ############################################################################################### */		
		/* Resultado da operação é exibido na tela para que possamos vê-lo que funcionou. */
		System.out.println(
				"1. A divisão entre os números informados é = "       + divisao       + "\n" +
				"2. A multiplicação entre os números informados é = " + multiplicacao + "\n" +
			    "3. A soma entre os números informados é = "          + soma          + "\n" +
			    "4. A subtração entre os números informados é = "     + subtracao     + "\n" );
		/* ############################################################################################### */
		/* #######################		RESULTADO FEITO NO MODO GRÁFICO		############################## */
		/* ############################################################################################### */	
		/* Resultado da operação é exibido na tela para que possamos vê-lo que funcionou. */
		JOptionPane.showMessageDialog(null,
				"1. A divisão entre os números informados é = "       + divisao       + "\n" +
				"2. A multiplicação entre os números informados é = " + multiplicacao + "\n" +
				"3. A soma entre os números informados é = "          + soma          + "\n" +
				"4. A subtração entre os números informados é = "     + subtracao     + "\n" );
	}
}
