/**
 * @author Desktop
 * Autor: Alessandro Soares
 */
package br.com.alessandro.aula_04;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Calculos_Numericos_1 {

	/**
	 * 
	 */
	public Calculos_Numericos_1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Programa em Java para calcular o valor de uma prestação atualizada. */
		DecimalFormat tofixed = new DecimalFormat("0.00");//Formata em 2 casas decimais
		double valorPrestacao, multa, prestacaoAtual, dolar, cotacao, conversao;
		int qtdeDias;
		valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da prestação : "));
		multa          = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da multa : "    ));
		qtdeDias       = Integer.parseInt  (JOptionPane.showInputDialog("Quantos dias está em atraso : " ));
		
		prestacaoAtual = valorPrestacao + ( valorPrestacao * ( multa * 0.01 ) * qtdeDias);
		
		/* #######################		RESULTADO FEITO NO MODO GRÁFICO		############################## */
		JOptionPane.showMessageDialog(null, "Prestação corregida em R$ \t " + tofixed.format( prestacaoAtual ));//Valor formatado em tela
		
		/* Pprograma em Java que efetue aapresentação do valor da conversão em real(R$) de um valor lido em dólar(US$). */
		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da cotação do dolar : "));
		dolar   = Double.parseDouble(JOptionPane.showInputDialog("Quantos dolares você quer converter ? "));
		
		conversao = dolar * cotacao;		
		
		/* #######################		RESULTADO FEITO NO MODO GRÁFICO		############################## */
		JOptionPane.showMessageDialog(null, "Total em R$ \t " + tofixed.format( conversao ));//Valor formatado em tela
	}
}
