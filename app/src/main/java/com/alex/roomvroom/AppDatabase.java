package com.alex.roomvroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by alex on 05/02/2018.
 */

@Database(entities = {Movie.class, Time.class}, version = 11)
public abstract class AppDatabase extends RoomDatabase {

  public abstract MovieDao movieDao();
  public abstract TimeDao timeDao();
  public abstract MovieAndTimesDao movieAndTimesDao();

}
