package com.alex.roomvroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by alex on 05/02/2018.
 */

@Dao
public interface MovieDao {

  @Query("SELECT * FROM movies")
  List<Movie> getAll();

  @Query("SELECT * FROM movies WHERE id IN (:ids)")
  List<Movie> loadAllByIds(int[] ids);

  @Query("SELECT * FROM movies WHERE title LIKE :title LIMIT 1")
  Movie findByTitle(String title);

  @Query("DELETE from movies")
  void deleteAll();

  @Insert
  long[] insertAll(Movie... movies);

  @Insert
  void insert(Movie movie);

  @Delete
  void delete(Movie movie);




}
