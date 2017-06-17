package aula02;

import javax.swing.JOptionPane;

public class Sintaxejava {
	//ctrl + espaco:auto completa;
	//main + ctrl + espaco: criamos o metodo main;
	public static void main(String[] args) {
		//syso + ctrl + espaco: cria o System.out.printl.
		String numero1= JOptionPane.showInputDialog("digite o numero 1");
		String numero2= JOptionPane.showInputDialog("digite o numero 2");
		Integer numeroum = Integer.parseInt(numero1);
		Integer numerodois = Integer.parseInt(numero2);


	JOptionPane.showMessageDialog(null, numeroum + numerodois);
	
	
	}

	
}
