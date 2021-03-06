package org.hbrs.se.ws20.uebung1.view;

import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.control.Translator;
import org.hbrs.se.ws20.uebung1.control.factory.Factory;

public class Client {

	private Translator translator = null;

	public void setTranslator (Translator translator) {
		this.translator = translator;
	}

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */

	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem übergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		// Strenge Implementierung gegen das Interface Translator gewuenscht!
		
		Translator translator = Factory.createGermanTranslator();

		// translator = Factory.createFrenchTranslator();

		System.out.println("Ergebnis: " + aNumber + ": " + this.translator.translateNumber(aNumber));

	}
}




