/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton.domain;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ricardo
 */
public class Intersection {
    
    private Slide sliceLeft;
    private Slide sliceRight;
    private int score;
    private List<Tag> differentTags;
    private List<Tag> tagsNotInRight;
    private List<Tag> tagsNotInRightLeft;

    public Intersection(Slide sliceLeft, Slide sliceRight, List<Tag> differentTags, List<Tag> tagsNotInRight, List<Tag> tagsNotInRightLeft) {
        this.sliceLeft = sliceLeft;
        this.sliceRight = sliceRight;
        this.differentTags = differentTags;
        this.tagsNotInRight = tagsNotInRight;
        this.tagsNotInRightLeft = tagsNotInRightLeft;
    }

    public Intersection() {
    }

    public Slide getSliceLeft() {
        return sliceLeft;
    }

    public void setSliceLeft(Slide sliceLeft) {
        this.sliceLeft = sliceLeft;
    }

    public Slide getSliceRight() {
        return sliceRight;
    }

    public void setSliceRight(Slide sliceRight) {
        this.sliceRight = sliceRight;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<Tag> getDifferentTags() {
        return differentTags;
    }

    public void setDifferentTags(List<Tag> differentTags) {
        this.differentTags = differentTags;
    }

    public List<Tag> getTagsNotInRight() {
        return tagsNotInRight;
    }

    public void setTagsNotInRight(List<Tag> tagsNotInRight) {
        this.tagsNotInRight = tagsNotInRight;
    }

    public List<Tag> getTagsNotInRightLeft() {
        return tagsNotInRightLeft;
    }

    public void setTagsNotInRightLeft(List<Tag> tagsNotInRightLeft) {
        this.tagsNotInRightLeft = tagsNotInRightLeft;
    }

    @Override
    public String toString() {
        return "Intersection{" + "sliceLeft=" + sliceLeft + ", sliceRight=" + sliceRight + ", score=" + score + ", differentTags=" + differentTags + ", tagsNotInRight=" + tagsNotInRight + ", tagsNotInRightLeft=" + tagsNotInRightLeft + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.sliceLeft);
        hash = 89 * hash + Objects.hashCode(this.sliceRight);
        hash = 89 * hash + this.score;
        hash = 89 * hash + Objects.hashCode(this.differentTags);
        hash = 89 * hash + Objects.hashCode(this.tagsNotInRight);
        hash = 89 * hash + Objects.hashCode(this.tagsNotInRightLeft);
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
        final Intersection other = (Intersection) obj;
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.sliceLeft, other.sliceLeft)) {
            return false;
        }
        if (!Objects.equals(this.sliceRight, other.sliceRight)) {
            return false;
        }
        if (!Objects.equals(this.differentTags, other.differentTags)) {
            return false;
        }
        if (!Objects.equals(this.tagsNotInRight, other.tagsNotInRight)) {
            return false;
        }
        if (!Objects.equals(this.tagsNotInRightLeft, other.tagsNotInRightLeft)) {
            return false;
        }
        return true;
    }
    
    
    
}
