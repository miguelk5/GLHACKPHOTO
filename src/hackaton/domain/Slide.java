/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 *
 * @author miguelk5
 */
public class Slide implements Comparable<Slide>{
    
    private String id;
    //kind V vertical. H horizontal. Z 2 verticales
    private String kind;
    private boolean isUsed;
    private List<Tag> tags;
    
    /**
     *
     * @param kind
     * @return
     */
    public int compareByKind(String kind){
    return this.getKind().compareTo(kind);
    }
    
    /**
     *
     * @param target
     * @param slides
     */
    public void uneSlideVertical(Slide target , List<Slide> slides){
    this.tags = removeRepeatedTags(this.tags, target.tags);
    this.kind = "Z";
    this.id= id + " " + target.id;
    
    }
    
    /**
     *
     * @param tags
     * @param tagsExts
     * @return
     */
    public List<Tag> removeRepeatedTags(List<Tag> tags, List<Tag> tagsExts){
        List<Tag> result = new ArrayList();
        tags.stream().forEach(new Consumer<Tag>() {

            @Override
            public void accept(Tag tag) {
                tagsExts.stream().filter((tagExt) -> (!tagExt.getName().equals(tag.getName()))).forEach((_item) -> {
                    result.add(_item);
                });
            }
        });
        return result;
    }
    
    /**
     *
     */
    public void orderTags(){
    Collections.sort(tags);
    }

    /**
     *
     * @param id
     * @param kind
     * @param isUsed
     * @param tags
     */
    public Slide(String id, String kind, boolean isUsed, List<Tag> tags) {
        this.id = id;
        this.kind = kind;
        this.isUsed = isUsed;
        this.tags = tags;
    }

    /**
     *
     * @param id
     * @param kind
     * @param tags
     */
    public Slide(String id, String kind, List<Tag> tags) {
        this.id = id;
        this.kind = kind;
        this.tags = tags;
    }

    /**
     *
     */
    public Slide() {
    }

    /**
     *
     * @param id
     * @param kind
     */
    public Slide(String id, String kind) {
        this.id = id;
        this.kind = kind;
    }

    /**
     *
     * @return
     */
    public boolean isIsUsed() {
        return isUsed;
    }

    /**
     *
     * @param isUsed
     */
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.tags);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Slide other = (Slide) obj;
        if (!Objects.equals(this.tags, other.tags)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Slide{" + "id=" + id + ", kind=" + kind + ", isUsed=" + isUsed + ", tags=" + tags.size() + '}' + "\n";
    }

    @Override
    public int compareTo(Slide o) {
        this.orderTags();
        o.orderTags();
     
        return this.getTags().size() - o.getTags().size();
    }

 
   
}
