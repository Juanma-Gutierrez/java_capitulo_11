
/**
 * Ejercicio1.java
 *
 * @version: 31/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Var declaration
		int num = 500;
		boolean isPrime;
		int numPrime = 0;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
			for (int i = 1; i <= num; i++) {
				isPrime = true;
				for (int j = 2; j <= (i / 2); j++)
					if (i % j == 0)
						isPrime = false;
				if (isPrime) {
					numPrime++;
					bw.write(String.format("%3d, ",i));
					if (numPrime % 10 == 0) {
						bw.write("\n");
					}
				}
			}
			bw.close();
		} catch (IOException ioe) {
			System.out.println("No se ha podido escribir en el fichero");
		}
	}
}