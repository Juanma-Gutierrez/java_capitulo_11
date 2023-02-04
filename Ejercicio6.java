/**
 * Ejercicio6.java
 *
 * @version: 04/02/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero. Tanto el nombre del fichero como la palabra se deben pasar como argumentos en la línea de comandos.
 */

import classes.WordCounter;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Var declarations
		try {
			String file = args[0];
			String word = args[1];

			WordCounter myWord = new WordCounter(file, word);
			System.out.println(myWord);
		} catch (Exception e) {
			System.out.println(
					"Debe introducir un nombre de fichero y la palabra a encontrar");
		}
	}
}
