package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {

	public static void main(String[] args) {

		String tall = showInputDialog("Tall ");
		int fakultet = parseInt(tall);

		double sum = 1;
		int i = 1;

			while (i < fakultet) {
				sum = sum + (sum * i);
				i++;
			}
			System.out.println(sum);
		}
	}

