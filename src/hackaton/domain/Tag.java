/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton.domain;

/**
 *
 * @author ricardo
 */
public class Tag implements Comparable<Tag>  {
    
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Tag o) {
         int lastCmp = this.name.compareTo(o.name);
        return lastCmp;
    }

    @Override
    public String toString() {
        return "Tag{" + "name=" + name + '}';
    }
    
    
}
