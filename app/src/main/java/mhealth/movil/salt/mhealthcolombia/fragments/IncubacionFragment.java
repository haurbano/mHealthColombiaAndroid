package mhealth.movil.salt.mhealthcolombia.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mhealth.movil.salt.mhealthcolombia.R;


public class IncubacionFragment extends TitleFragment {

    private final String title ="Incubacion";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_incubacion, container, false);
    }


    @Override
    public String getTitle() {
        return title;
    }
}
