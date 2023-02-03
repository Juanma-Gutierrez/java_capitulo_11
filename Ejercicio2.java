/**
 * Ejercicio2.java
 *
 * @version: 03/02/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla.
 */

import classes.Prime;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Process
		Prime prime = new Prime("files/primos.dat");
		System.out.println(prime);
	}
}
