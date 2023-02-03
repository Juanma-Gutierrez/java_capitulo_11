import classes.MyFile;

/**
 * Ejercicio4.java
 *
 * @version: 03/02/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		// Var declarations
		String file = "";
		String output = "";
		try {
			int l = args[0].length();
			file = args[0];
			output = args[0].substring(0, l - 4) + "_sort" + args[0].substring(l - 4, l);
		} catch (Exception e) {
			System.out.println("Debe introducir un argumentos: (nombre del fichero de entrada)");
			return;
		}
		System.out.printf("%s   %s\n", file, output);
		try {
			MyFile mf = new MyFile(file, output);
			System.out.println("Se ha grabado correctamente el fichero " + mf.getOutputFile());
		} catch (Exception e) {
			System.out.println("Error en el proceso");
		}
	}
}