package com.example.jairg.fragments_two;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

public class PlayerOneFragment extends Fragment implements View.OnClickListener {
    int index = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View theView = inflater.inflate(R.layout.fragment_one, container, false);

        Button button = theView.findViewById(R.id.travelButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CharacterActions.class);
                intent.putExtra("prefIndex", index);
                startActivity(intent);
            }
        });

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
            default:
                return index;
        }
        return index;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        RadioButton rb = (RadioButton) view;
        CharSequence classText = rb.getText();

        int index = changeIdToIndex(id);

        Activity activity = getActivity();
        PlayerOneFragementCoordinator coordinator = (PlayerOneFragementCoordinator) activity;
        coordinator.onSelectedPrefChanged(index);
    }
}
