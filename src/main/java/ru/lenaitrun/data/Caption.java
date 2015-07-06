package ru.lenaitrun.data;

import java.util.Date;

/**
 * Created by qw3rtrun on 26.01.15.
 */
public class Caption {
    private String id;
    private String text;
    private long created_time;
    private From from;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getCreated_time() {
        return created_time;
    }

    public void setCreated_time(long created_time) {
        this.created_time = created_time;
    }

    public Date getCreatedDate() {
        return new Date(getCreated_time()*1000);
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Caption{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", created_time='" + created_time + '\'' +
                ", from=" + from +
                '}';
    }
}
