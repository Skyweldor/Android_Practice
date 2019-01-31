package com.example.jairg.fragments_two;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.jairg.fragments_two.Fragments.PlayerOneDescriptionFragment;
import com.example.jairg.fragments_two.Fragments.PlayerOneFragementCoordinator;
import com.example.jairg.fragments_two.Utils.GameStatsDatabaseContract;
import com.example.jairg.fragments_two.Utils.GameStatsOpenDbHelper;

public class MainActivity extends AppCompatActivity implements PlayerOneFragementCoordinator {

    private static final String DATABASE_TAG = "DATABASE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insertPlayer();
    }

    public void onSelectedPrefChanged(int index) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        PlayerOneDescriptionFragment playerOneDescriptionFragment = (PlayerOneDescriptionFragment)
                fragmentManager.findFragmentById(R.id.FragmentTwo);
        playerOneDescriptionFragment.setDescription(index);
    }

    public void readData() {
        GameStatsOpenDbHelper helper = new GameStatsOpenDbHelper(this);
        SQLiteDatabase db = helper.getReadableDatabase();

        String[] projection = {
                BaseColumns._ID,
                GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_NAME,
                GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_GOLD,
                GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_XP,
                GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_AP
        };

        String selection = GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_ID + " = ?";
        String[] selectionArgs = {"player_one"};

        String sortOrder =
                GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_NAME + " DESC";

        Cursor cursor = db.query(
                GameStatsDatabaseContract.PlayerStats.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                sortOrder
        );

        Log.d(DATABASE_TAG, cursor.getString(0));
    }

    public void insertPlayer() {
        GameStatsOpenDbHelper helper = new GameStatsOpenDbHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_ID, "player_one");
        values.put(GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_NAME, "Player One");
        values.put(GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_GOLD, 420);
        values.put(GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_XP, 15);
        values.put(GameStatsDatabaseContract.PlayerStats.COLUMN_PLAYER_AP, 10);
        long newRowId = db.insert(GameStatsDatabaseContract.PlayerStats.TABLE_NAME, null, values);
    }

}
