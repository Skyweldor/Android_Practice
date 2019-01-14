package com.example.jairg.fragments_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CharacterActions extends AppCompatActivity {
    String stats;
    int _HP = 3;
    int _STR = 1;
    int _DEF = 1;
    int _CRIT = 1;
    int _ACC = 1;
    int _SPD = 1;
    int _EVA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_actions);
        Intent startIntent = getIntent();
        int perfIndex = startIntent.getIntExtra("prefIndex", 0);
        setStats(perfIndex);

        TextView statsTextView = (TextView) findViewById(R.id.statsDescription);
        statsTextView.setText(stats);
    }

    public void setStats(int index) {
        switch (index) {
            case 0:
                stats = "HP: " + Integer.toString(_HP) +
                        "| STR: " + Integer.toString(_STR + 1) +
                        "| DEF: " + Integer.toString(_DEF + 2) +
                        "| CRIT: " + Integer.toString(_CRIT) +
                        "| ACC: " + Integer.toString(_ACC) +
                        "| SPD: " + Integer.toString(_SPD) +
                        "| EVA: " + Integer.toString(_EVA) +
                        "|";
                break;
            case 1:
                stats = "HP: " + Integer.toString(_HP) +
                        "| STR: " + Integer.toString(_STR) +
                        "| DEF: " + Integer.toString(_DEF) +
                        "| CRIT: " + Integer.toString(_CRIT + 2) +
                        "| ACC: " + Integer.toString(_ACC + 2) +
                        "| SPD: " + Integer.toString(_SPD) +
                        "| EVA: " + Integer.toString(_EVA) +
                        "|";
                break;
            case 2:
                stats = "HP: " + Integer.toString(_HP) +
                        "| STR: " + Integer.toString(_STR) +
                        "| DEF: " + Integer.toString(_DEF) +
                        "| CRIT: " + Integer.toString(_CRIT) +
                        "| ACC: " + Integer.toString(_ACC) +
                        "| SPD: " + Integer.toString(_SPD + 2) +
                        "| EVA: " + Integer.toString(_EVA + 2) +
                        "|";
                break;
        }
    }
}
