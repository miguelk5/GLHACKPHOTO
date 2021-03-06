/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import hackaton.domain.Slide;
import hackaton.domain.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author miguelk5
 */
public class Logic {
    
    /**
     *
     * @param raw
     * @return
     */
    public static Slide convieteFoto(String raw){
        try{
     String[] raws = raw.split(" ");
     Slide slide = new Slide();
     List<Tag> tags = new ArrayList();
     for(int index = 0 ; index< raws.length ; index++){
     if(index == 0){slide.setKind(raws[0]);}
     if(index == 1){slide.setId(raws[1]);}
     
     if(index>1){tags.add(new Tag(raws[index]));}
     }
     slide.setTags(tags);
     int i = 2;
     return slide;
     }catch(Exception e){return null;}
    }
    
    /**
     *
     * @param rawPhotos
     * @return
     */
    public static List<Slide> convierteFotosRaw(List<String> rawPhotos){
        List<Slide> nuevaLista = new ArrayList();
        rawPhotos.stream().map((rawPhoto) -> convieteFoto(rawPhoto)).filter((miSlide) -> (miSlide!= null)).map((miSlide) -> {
            miSlide.orderTags();
            return miSlide;
        }).forEach((miSlide) -> {
            nuevaLista.add(miSlide);
        });
        return nuevaLista;
    }
    
    /**
     *
     * @param tipo
     * @param slides
     * @return
     */
    public static List<Slide> obtienePorTipo(String tipo , List<Slide> slides){
    return slides.parallelStream().filter( (mySlide) -> {return tipo.equals(mySlide.getKind());}).collect(Collectors.toList());
    }
    
    
}
