package com.alex.roomvroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by alex on 05/02/2018.
 */

@Dao
public interface TimeDao {

  @Query("SELECT * FROM times")
  List<Time> getAll();

  @Insert
  void insert(Time time);

  @Query("DELETE FROM times")
  void deleteAll();


}


