package com.example.jairg.fragments_two;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class PlayerOneFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.activity_main, container, false);

        setupClickListeners(theView);
        return theView;
    }

    private void setupClickListeners(View theView) {
        setupClickListener(theView, R.id.strengthPreference);
        setupClickListener(theView, R.id.cunningPreference);
        setupClickListener(theView, R.id.agilityPreference);
    }

    private void setupClickListener(View theView, int childViewId) {
        View childView = theView.findViewById(childViewId);
        childView.setOnClickListener(this);
    }

    int changeIdToIndex(int id) {
        int index = 0;
        switch (id) {
            case R.id.strengthPreference:
                index = 0;
                break;
            case R.id.cunningPreference:
                index = 1;
                break;
            case R.id.agilityPreference:
                index = 2;
                break;
        }
        return index;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        RadioButton rb = (RadioButton) view;
        CharSequence classText = rb.getText();

        int index = changeIdToIndex(id);
    }
}
