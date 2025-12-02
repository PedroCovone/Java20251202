package fp.dam.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	// m1
	static ArrayList<String> m1(String cadena) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i <= cadena.length(); i++)
			if (cadena.charAt(i) == cadena.charAt(i + 1))
				;
//				lista.add(cadena.charAt(i));
		return lista;
	}

	// m2
	static ArrayList<String> m2(String cadena) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add(cadena);
//		Pattern p = Pattern.compile("(.)\1+");
//		Matcher m = p.matcher(cadena);
		for (int i = 0; i <= cadena.length(); i++)
			if (cadena.matches("(.)\1+"))
				lista.add(cadena);
		return lista;
	}

	// m3a
	static Integer m3a(int[][] m) {
		int record = 0;
		int suma = 0;
		if (m.length < 3)
			return null;
		else
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					suma = 0;
					m[i][j] += suma;
				}
				if (suma > record)
					record = suma;
			}
		return record;
	}

	// m3b
	static int[][] m3b(int n) {
		Random random = new Random();

		switch (n) {
		case 1:
			int[][] m1 = new int[8][8];
			for (int i = 0; i <= 10; i++)
				m1[random.nextInt(7) + 1][random.nextInt(7) + 1] = -1;
			return m1;
		case 2:
			int[][] m2 = new int[16][16];
			for (int i = 0; i <= 40; i++)
				m2[random.nextInt(15) + 1][random.nextInt(15) + 1] = -1;
			return m2;
		case 3:
			int[][] m3 = new int[16][30];
			for (int i = 0; i <= 99; i++)
				m3[random.nextInt(15) + 1][random.nextInt(29) + 1] = -1;
			return m3;
		default:
			return null;
		}
	}

}
