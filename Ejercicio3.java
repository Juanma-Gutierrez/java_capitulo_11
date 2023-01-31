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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Var declarations
		try {
			String file1 = args[0];
			String file2 = args[1];

			try {
				BufferedReader br1 = new BufferedReader(new FileReader(file1));
				BufferedReader br2 = new BufferedReader(new FileReader(file2));
				BufferedWriter bw = new BufferedWriter(new FileWriter("SalidaEjercicio3.txt"));
				String line1 = "";
				String line2 = "";
				while ((line1 != null) || (line2 != null)) {
					line1 = br1.readLine();
					line2 = br2.readLine();
					if (line1 != null)
						bw.write(line1 + "\n");
					if (line2 != null)
						bw.write(line2 + "\n");
				}
				br1.close();
				br2.close();
				bw.close();
				System.out.println("Archivo generado correctamente.");
			} catch (IOException ioe) {
				System.out.println("No se puede leer el fichero indicado");
				System.err.println(ioe.getMessage());
			}
		} catch (Exception e) {
			System.out.println(
					"Debe introducir los nombres de los dos ficheros a combinar");
		}
	}
}
