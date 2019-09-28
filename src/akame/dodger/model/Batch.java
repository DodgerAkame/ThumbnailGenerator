package akame.dodger.model;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    private List thumbnails;

    public Batch() {
        thumbnails = new ArrayList();
    }

    public void addThumbnail(Thumbnail thumbnail){
        thumbnails.add(thumbnail);
    }

    public List getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List thumbnails) {
        this.thumbnails = thumbnails;
    }
}
