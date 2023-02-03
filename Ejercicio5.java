import classes.MyFile;

/**
 * Ejercicio4.java
 *
 * @version: 03/02/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * 
 * ```
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * 
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * ```
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		// Var declarations
		String file = "";
		String output = "";
		try {
			file = args[0];
			output = args[1];
		} catch (Exception e) {
			System.out.println(
					"Debe introducir dos argumentos: (nombre del fichero a limpiar) (nombre del fichero limpio)");
			return;
		}
		System.out.printf("%s   %s\n", file, output);
		try {
			MyFile mf = new MyFile();
			mf.setInitFile(file);
			mf.setOutputFile(output);
			mf.removeComments();
			System.out.println("Se ha grabado correctamente el fichero " + output);
		} catch (Exception e) {
			System.out.println("Error en el proceso");
		}
	}
}