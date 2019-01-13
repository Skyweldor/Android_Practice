package com.example.jairg.fragments_two;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlayerOneDescriptionFragment extends Fragment {
    final String _preferenceIndexStateKey = "prefIndex";
    final int _preferenceIndexDefaultValue = 0;

    TextView _descriptionView;
    String[] _preferenceDescriptions;
    int _prefIndex;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_two, container, false);

        _descriptionView = (TextView) fragmentView.findViewById(R.id.playerDescription);
        _preferenceDescriptions = getResources().getStringArray(R.array.preferencesDescriptions);

        _prefIndex = _preferenceIndexDefaultValue;

        setDescription(_prefIndex);
        return fragmentView;
    }

    public void setDescription(int prefIndex) {
        _prefIndex = prefIndex;
        _descriptionView.setText(_preferenceDescriptions[_prefIndex]);
    }
}
