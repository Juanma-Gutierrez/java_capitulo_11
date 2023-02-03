/**
 * Ejercicio1.java
 *
 * @version: 03/02/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

/*
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * (Añado modificación para que lea entre dos números MIN y MAX).
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import classes.Prime;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Var declarations
		Prime primeNumbers = new Prime();
		final int MIN = 1;
		final int MAX = 500;

		// Process
		for (int i = MIN; i <= MAX; i++) {
			if (Prime.isPrime(i))
				primeNumbers.addPrime(i);
		}

		// Output data
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
			bw.write(String.format("%s", primeNumbers));
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
