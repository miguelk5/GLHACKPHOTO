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
import logic.Logic;

/**
 *
 * @author ricardo
 */
public class Hackaton {

    
    public static int PHOTO_NUMBER;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    File archivo = new File("D:\\HACKATON GOOGLE\\Hackaton\\src\\RESOURCES\\c_memorable_moments.txt");    
        List<String> photosRaw = Lector.leeArchivo(archivo);
        
                List<Slide> slides = Logic.convierteFotosRaw(photosRaw);

    Collections.sort(slides);
    
    //slides.forEach( (Slide slide) -> { if("V".equalsIgnoreCase(slide.getKind())){ slide.uneSlideVertical(slide, slides); } }) ;
    
        System.out.println("SLIDES : " + slides.size());
        
        System.out.println(slides);
    }
    
}
