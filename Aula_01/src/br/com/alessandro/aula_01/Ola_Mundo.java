/**
 * @author Desktop
 * Autor: Alessandro Soares
 * 
 */
package br.com.alessandro.aula_01;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Ola_Mundo {

	/**
	 * 
	 */
	public Ola_Mundo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /**
	     * Aula 1.
		 * Vamos criar um exemplo simples para ilustrar como um programa em Java funciona.
		 * O problema a ser resolvido é criar um programa que exiba a mensagem "Olá, Mundo!".
		 * Ao mesmo tempo estou que estou utilizando o "MODO TEXTO" pertencente a classe "Scanner";
		 * estou resolvendo também no "MODO GRÁFICO" do Java pertencente ao pacote "SWING".
		 */		
		/* ############################################################################################### */
		/* ##########################	RESULTADO FEITO NO MODO TEXTO	################################## */
		/* ############################################################################################### */		
		/* Resultado da operação é exibido na tela para que possamos vê-lo que funcionou. */
		System.out.println("Meu primeiro código no \"Modo Texto\"");		
		System.out.println("Olá Mundo!!!");
		
		/* ############################################################################################### */
		/* #######################		RESULTADO FEITO NO MODO GRÁFICO		############################## */
		/* ############################################################################################### */	
		/* Resultado da operação é exibido na tela para que possamos vê-lo que funcionou. */
        JOptionPane.showMessageDialog(null, "Olá Mundo!!!"); 
	}
}
