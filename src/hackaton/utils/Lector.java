/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton.utils;
import hackaton.Hackaton;
    import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo
 */

	@SuppressWarnings("null")

public class Lector {


	
	public static List<String> leeArchivo(File archivo) {

            List<String> listaFotos = new ArrayList();
            
	BufferedReader reader;
	try {
		reader = new BufferedReader(new FileReader(archivo));
		String line = reader.readLine();
                Hackaton.PHOTO_NUMBER = Integer.valueOf(line.replaceAll(" ", ""));
		while (line != null) {

			line = reader.readLine();
                        listaFotos.add(line);
		}

		reader.close();		
	} catch (IOException e) {
		e.printStackTrace();
	}
         return listaFotos;
    }

}
