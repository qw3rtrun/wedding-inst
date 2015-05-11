package ru.lenaitrun.data;

import java.util.List;

/**
 * Created by qw3rtrun on 26.01.15.
 */
public class Media {
    private String type;
    private String filter;
    private List<String> tags;
    private Caption caption;
    private Images images;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Media{" +
                "type='" + type + '\'' +
                ", filter='" + filter + '\'' +
                ", tags=" + tags +
                ", caption=" + caption +
                ", images=" + images +
                '}';
    }
}
