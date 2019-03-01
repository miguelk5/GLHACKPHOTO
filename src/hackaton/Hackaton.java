/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton;

import hackaton.domain.Slide;
import hackaton.utils.Lector;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import logic.Logic;

/**
 *
 * @author miguelk5
 */
public class Hackaton {

    /**
     *
     */
    public static int PHOTO_NUMBER;
    
    /**
     *
     * @return
     */
    public static File start(){    
    int option = 1;
    File resultFile = null;
    Scanner reader = new Scanner(System.in);
    System.out.println("Please select an option: \n"+
                       "1 read and process b_lovely_landscapes \n" +
                       "2 read and process c_memorable_moments \n" +
                       "3 read and process d_pet_pictures \n" +
                       "4 read and process e_shiny_selfies \n" );
    option = reader.nextInt(); // Scans the next token of the input as an int.
    
    if(option == 1 ){ resultFile = new File("src\\RESOURCES\\b_lovely_landscapes.txt");}
    if(option == 2 ){ resultFile = new File("src\\RESOURCES\\c_memorable_moments.txt");}
    if(option == 3 ){ resultFile = new File("src\\RESOURCES\\d_pet_pictures.txt");}
    if(option == 4 ){ resultFile = new File("src\\RESOURCES\\e_shiny_selfies.txt");}
    
    reader.close();  
    return resultFile;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    File archivo = start();   
    if(archivo!= null){
        List<String> photosRaw = Lector.leeArchivo(archivo);
        
        List<Slide> slides = Logic.convierteFotosRaw(photosRaw);

        Collections.sort(slides);
    
        //slides.forEach( (Slide slide) -> { if("V".equalsIgnoreCase(slide.getKind())){ slide.uneSlideVertical(slide, slides); } }) ;
    
        System.out.println("SLIDES : " + slides.size());
        
        System.out.println(slides);
    } else {System.out.println("Error con el archivo");}
    
    }
}

