package ru.lenaitrun.data;

import java.util.List;

/**
 * Created by qw3rtrun on 26.01.15.
 */
public class Response {
   private List<Media> data;

    public List<Media> getData() {
        return data;
    }

    public void setData(List<Media> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Responce{" +
                "data=" + data +
                '}';
    }
}
