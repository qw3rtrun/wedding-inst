package ru.lenaitrun.data;

/**
 * Created by qw3rtrun on 26.01.15.
 */
public class From {
    private String username;
    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "From{" +
                "username='" + username + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
