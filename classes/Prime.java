package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;

public class Prime {
	private ArrayList<Integer> primeList;
	String archivo;

	public Prime() {
		this.primeList = new ArrayList<>();
	}

	public Prime(String archivo) {
		this.primeList = new ArrayList<>();
		this.archivo = archivo;
		this.init();
	}

	public void init() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.archivo));
			String line = "";
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero " + this.archivo);
		}
	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		if (num == 1) // Caso especial, 1 no es primo
			return (false);
		for (int i = 2; i <= num / 2 && isPrime; i++) {
			isPrime = true;
			if (num % i == 0)
				isPrime = false;
		}
		return (isPrime);
	}

	public void addPrime(int num) {
		this.primeList.add(num);
	}

	public static int nextPrime(int num) {
		boolean isPrime = false;
		int res = num++;

		do {
			isPrime = true;
			for (int i = 2; i <= res / 2; i++) {
				if (res % i == 0)
					isPrime = false;
				res++;
			}
		} while (!isPrime);
		return (res);
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < this.primeList.size(); i++) {
			res += this.primeList.get(i) + "\n";
		}
		return res;
	}
}
