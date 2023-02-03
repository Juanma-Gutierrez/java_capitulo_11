package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mixer {
	private String nameFile1;
	private String nameFile2;
	private String nameFile3;
	private String mixture;

	public Mixer() {
	}

	public Mixer(String nameFile1, String nameFile2, String nameFile3) {
		this.nameFile1 = nameFile1;
		this.nameFile2 = nameFile2;
		this.nameFile3 = nameFile3;
		this.init();
	}

	public void init() {
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(nameFile1));
			BufferedReader br2 = new BufferedReader(new FileReader(nameFile2));
			String line1 = "";
			String line2 = "";
			while ((line1 != null) || (line2 != null)) {
				line1 = br1.readLine();
				line2 = br2.readLine();
				if (line1 != null)
					mixture += line1 + "\n";
				if (line2 != null)
					mixture += line2 + "\n";
			}
			br1.close();
			br2.close();
			BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile3));
			bw.write(mixture);
			bw.close();
			System.out.println("Archivo generado correctamente.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero indicado");
			System.err.println(ioe.getMessage());
		}
	}

	public String getNameFile1() {
		return nameFile1;
	}

	public String getNameFile2() {
		return nameFile2;
	}

	public String getNameFile3() {
		return nameFile3;
	}

	public String getMixture() {
		return mixture;
	}

}
