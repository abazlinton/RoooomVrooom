package com.alex.roomvroom;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    AppDatabase db = Room.databaseBuilder(getApplicationContext(),
      AppDatabase.class, "database-name")
      .allowMainThreadQueries()
      .fallbackToDestructiveMigration()
      .build();

    ArrayList<Movie> topMovies = new TopMovies().getList();
    db.movieDao().deleteAll();
    db.timeDao().deleteAll();
    long[] ids = db.movieDao().insertAll(topMovies.toArray(new Movie[]{}));
    List movies = db.movieDao().getAll();

    Time time = new Time("15:00", (int) ids[0]);
    db.timeDao().insert(time);

    Log.d("movies", movies.toString());
  }
}
