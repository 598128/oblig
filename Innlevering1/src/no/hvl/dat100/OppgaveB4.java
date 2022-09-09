package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		final double TRINN1 = 0.017;
		final double TRINN2 = 0.04;
		final double TRINN3 = 0.134;
		final double TRINN4 = 0.164;
		final double TRINN5 = 0.174;
		
		String inntekt = showInputDialog("Skriv inn inntekt: ");
		int brutto = parseInt(inntekt); 
		
		if (brutto < 190349) {
			System.out.println("Ingen trinnskatt");
		}
		
		else if (brutto >= 190350 && brutto <= 267899) {
			System.out.println("Trinnskatt: " + (float)(TRINN1*100) + "%");
			System.out.println("Skatt betalt: " + (float)(brutto*TRINN1));
		}
		
		else if (brutto >= 267900 && brutto <= 643799) {
			System.out.println("Trinnskatt: " + (float)(TRINN2*100) + "%");
			System.out.println("Skatt betalt: " + (float)(brutto*TRINN2));
		}
		
		else if (brutto >= 643800 && brutto <= 969199) {
			System.out.println("Trinnskatt: " + (float)(TRINN3*100) + "%");
			System.out.println("Skatt betalt: " + (float)(brutto*TRINN3));
			}
		
		else if (brutto >= 969200 && brutto <= 1999999) {
			System.out.println("Trinnskatt: " + (float)(TRINN4*100) + "%");
			System.out.println("Skatt betalt: " + (float)(brutto*TRINN4));
		}
		
		else if (brutto >= 2000000) {
			System.out.println("Trinnskatt: " + (float)(TRINN5*100) + "%");
			System.out.println("Skatt betalt: " + (float)(brutto*TRINN5));
		}
		
		else {
			System.out.println("Feil");
		}
	}
}
