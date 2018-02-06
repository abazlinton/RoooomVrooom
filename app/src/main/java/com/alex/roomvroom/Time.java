package com.alex.roomvroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by alex on 05/02/2018.
 */

@Entity(
  tableName = "times",
  foreignKeys = @ForeignKey(
      entity = Movie.class,
      parentColumns = "id",
      childColumns = "movie_id",
      onDelete = ForeignKey.CASCADE
  )
)
public class Time {

  @PrimaryKey(autoGenerate = true)
  private int id;
  @ColumnInfo(name = "movie_id")
  private int movieId;
  private String time;

  public Time(String time, int movieId){
    this.time = time;
    this.movieId = movieId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public int getMovieId() {
    return movieId;
  }

  public void setMovieId(int movieId) {
    this.movieId = movieId;
  }


}
