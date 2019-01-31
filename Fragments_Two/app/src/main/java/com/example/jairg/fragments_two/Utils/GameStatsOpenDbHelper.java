package com.example.jairg.fragments_two.Utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GameStatsOpenDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "GamsStats.db";

    public GameStatsOpenDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(GameStatsDatabaseContract.PlayerStats.SQL_CREATE_TABLE);
        db.execSQL(GameStatsDatabaseContract.GameCharacterStats.SQL_CREATE_TABLE);
        db.execSQL(GameStatsDatabaseContract.ItemStats.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(GameStatsDatabaseContract.PlayerStats.SQL_DELETE_TABLE);
        db.execSQL(GameStatsDatabaseContract.GameCharacterStats.SQL_DELETE_TABLE);
        db.execSQL(GameStatsDatabaseContract.ItemStats.SQL_DELETE_TABLE);
        onCreate(db);
    }
}
