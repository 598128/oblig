package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB5 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
		String karakter = showInputDialog("Krakter: ");
		int poeng = parseInt(karakter);
		
		if (poeng <= 39 && poeng >=0) {
			System.out.println("Karakter: F");
		}
		else if (poeng >= 40 && poeng <= 49) {
			System.out.println("Karakter: E");
		}
		else if (poeng >= 50 && poeng <= 59) {
			System.out.println("Karakter: D");
		}
		else if (poeng >= 60 && poeng <= 79) {
			System.out.println("Karakter: C");
		}
		else if (poeng >= 80 && poeng <= 89) {
			System.out.println("Karakter: B");
		}
		else if (poeng >= 90 && poeng <= 100) {
			System.out.println("Karakter: A");
		}
		else {
			System.out.println("Feil");
		}
		}
	}

}
