package com.example.jairg.fragments_two;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PlayerOneFragementCoordinator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSelectedPrefChanged(int index) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        PlayerOneDescriptionFragment playerOneDescriptionFragment = (PlayerOneDescriptionFragment)
                fragmentManager.findFragmentById(R.id.FragmentTwo);
        playerOneDescriptionFragment.setDescription(index);
    }

}
