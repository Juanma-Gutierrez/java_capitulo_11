/**
 * Ejercicio2.java
 *
 * @version: 31/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

  public static void main(String[] args) {
    // Process
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.txt"));
      String line = "";
      while (line != null) {
		  System.out.println(line);
		  line = br.readLine();
      }
      br.close();
    } catch (FileNotFoundException fnfe) {
      System.out.println("Archivo no encontrado.");
    } catch (IOException ioe) {
      System.out.println("No se puede leer el fichero primos.txt");
    }
  }
}
