package core;

import models.Gato;

public class Animais {

	public static void main(String[] args) {
		Gato tom = new Gato("Tom", "Branco", 1);
		Gato tim = new Gato("Tim", "Preto e Branco", 1);
		
		System.out.println(tom);
		System.out.println(tim);
	}
}
