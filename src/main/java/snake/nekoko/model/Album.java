package snake.nekoko.model;

import java.util.List;

public class Album {
    private String title;
    private String year;
    private String coverPath;
    private List<Song> songs;

    public Album(String title, String year, String coverPath, List<Song> songs) {
        this.title = title;
        this.year = year;
        this.coverPath = coverPath;
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}