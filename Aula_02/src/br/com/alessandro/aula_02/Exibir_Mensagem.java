/**
 * @author Desktop
 * Autor: Alessandro Soares
 * 
 */
package br.com.alessandro.aula_02;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Exibir_Mensagem {

	/**
	 * 
	 */
	public Exibir_Mensagem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /**
	     * 	 Aula 2.
		 *	 Vamos agora resolver um problema simples de exibição de mensagens para 
		 * ilustrar como construir uma sequência lógica em programação.
		 * Problema: Exibir uma Sequência de Mensagens
		 * 	 Vamos criar um programa Java que exiba uma sequência de três mensagens.
		 *   Vamos também exibir um pequeno menu.
		 */
        /* ############################################################################################### */
        /* ##########################	RESULTADO FEITO NO MODO TEXTO	################################## */
        /* ############################################################################################### */
		/* Resultado é exibido na tela para que possamos vê-lo que funcionou. */
		System.out.println("Primeira mensagem"); 
		System.out.println("Segunda mensagem" ); 
		System.out.println("Terceira mensagem");
		
		String msg1 = "\"System.out.println\"";
		String msg2 = "\"JOptionPane.showMessageDialog\"";

		/* Resultado é exibido na tela para que possamos vê-lo que funcionou. */
		System.out.println(
				"1. Introdução" + "\n" +	
				"2. Comandos de saída\n" + 
			    "\t2.1." + msg1 + "\n" +
			    "\t2.2." + msg2 + "\n" +
		        "\t \t2.2.1.Diferentes configurações");
		
		/* ############################################################################################### */
		/* #######################		RESULTADO FEITO NO MODO GRÁFICO		############################## */
		/* ############################################################################################### */	
		/* Resultado é exibido na tela para que possamos vê-lo que funcionou uma mensagem por vez. */
		JOptionPane.showMessageDialog(null, "Primeira mensagem");
		JOptionPane.showMessageDialog(null, "Segunda mensagem" );
		JOptionPane.showMessageDialog(null, "Terceira mensagem");
		
		/* Resultado é exibido na tela para que possamos vê-lo que funcionou mensagem única. */
		JOptionPane.showMessageDialog(null,
				"1. \t \"Primeira mensagem\"\n" +
				"2. \t \"Segunda mensagem\"\n" +
				"3. \t \"Terceira mensagem\"\n");
		
		/* Resultado é exibido na tela para que possamos vê-lo que funcionou mensagem única. */
		JOptionPane.showMessageDialog(null, 
				"1. \t Introdução" + "\n" +	
				"2. \t Comandos de saída\n" + 
			    "\t \t \t \t \t \t \t \t \t \t \t 2.1. \t " + msg1 + "\n" +
			    "\t \t \t \t \t \t \t \t \t \t \t 2.2. \t " + msg2 + "\n" +
		        "\t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t \t "
		        + "\t \t \t \t \t \t 2.2.1.\t \t Diferentes configurações");
	}
}