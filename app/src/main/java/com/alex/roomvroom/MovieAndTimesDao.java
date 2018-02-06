package com.alex.roomvroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by alex on 05/02/2018.
 */
@Dao
public interface MovieAndTimesDao {

  @Query("SELECT * FROM movies")
  public List<MovieAndTimes> loadMovieAndTimes();
}
