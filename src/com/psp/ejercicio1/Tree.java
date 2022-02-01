package com.psp.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {

	public static void main(String[] args) {

		try {
			tree();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error " + e.getMessage());
		}

	}

	public static void tree() throws IOException {

		String directorioActual = System.getProperty("user.home");
		System.out.println(directorioActual);
		ProcessBuilder tree = new ProcessBuilder("CMD", "/C", "tree " + directorioActual);
		BufferedReader br = new BufferedReader(new InputStreamReader(tree.start().getInputStream()));

		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.println(linea);
		}

		br.close();

	}

}
