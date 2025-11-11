/**
 * @author Desktop
 * Autor: Alessandro Soares
 */
package br.com.alessandro.aula_04;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */
public class Calculos_Numericos_2 {

	/**
	 * 
	 */
	public Calculos_Numericos_2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Programa que:
		 * 		solicite o valor do raio de uma esfera e calcula o seu comprimento e mostre também o seu volume;
		 * 		solicite o valor do raio e a altura de um cilindro e calcule e mostre a sua área.
		 *  Detalhe todos usando a classe Math do Java.
		 */
		double a, c, h, vc, ve, raio;
		Scanner leia = new Scanner(System.in);        
        System.out.println("Digite o valor do raio");
        raio = leia.nextDouble();
        System.out.println("Digite o valor da altura.");
		h = leia.nextDouble();
		
		a = 2 * Math.PI * raio * h; /* área */
		
		vc = ( Math.PI * ( Math.pow( raio, 2 ))) * h; /* volume cilindro */  
		
        c = 2 * Math.PI * raio; /* comprimento */
        
        ve = ( 3.0 / 4.0 ) * Math.PI * Math.pow( raio, 3 ); /* volume esfera */
        
        System.out.println( "Comprimento da esfera é: " + c  + "\n" +
                		    "Volume da esfera é: "      + ve + "\n" +
		      	            "Área do cilindro é de : "  + a  + "\n" +
		      	            "Volume do cilindro é: "    + vc 
			               );
        
        JOptionPane.showMessageDialog(null,
						        		"Comprimento da esfera é: " + c  + "\n" +
						                "Volume da esfera é: "      + ve + "\n" +
        						      	"Área do cilindro é de : "  + a  + "\n" +
        						      	"Volume do cilindro é: "    + vc 
        							  );
	}
}
