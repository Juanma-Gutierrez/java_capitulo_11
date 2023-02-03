/**
 * Ejercicio3.java
 *
 * @version: 31/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasar como argumentos en la línea de comandos.
Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas pueden tener tamaños diferentes.
 */

import classes.Mixer;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Var declarations
		try {
			String file1 = args[0];
			String file2 = args[1];
			final String FILE3 = "files/SalidaEjercicio3.txt";

			Mixer mixture = new Mixer(file1, file2, FILE3);
			System.out.println("Se ha generado correctamente el fichero: " +mixture.getNameFile3());
		} catch (Exception e) {
			System.out.println(
					"Debe introducir los nombres de los dos ficheros a combinar");
		}
	}
}
