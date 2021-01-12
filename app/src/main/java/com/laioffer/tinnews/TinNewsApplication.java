package com.laioffer.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.laioffer.tinnews.database.TinNewsDatabase;

public class TinNewsApplication extends Application {

    private TinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
    }

    public TinNewsDatabase getDatabase() {
        return database;
    }

}
