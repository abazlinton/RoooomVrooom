package com.alex.roomvroom;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "movies")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private Integer ranking;

    private String title;

    private Integer year;

    public Movie(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public int getId(){
        return id;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return this.getTitle();
    }

}
