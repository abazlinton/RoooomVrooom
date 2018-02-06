package com.alex.roomvroom;

import android.arch.persistence.room.Relation;

import java.util.List;

/**
 * Created by alex on 05/02/2018.
 */

public class MovieAndTimes {

  public int id;
  public Integer ranking;
  public String title;
  public Integer year;

  @Relation(parentColumn = "id", entityColumn = "movie_id")
  public List<Time> times;

}
