package mhealth.movil.salt.mhealthcolombia.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mhealth.movil.salt.mhealthcolombia.R;


/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class DiegoFragment extends TitleFragment {

    private final String title = "Diego López";

    public DiegoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diego, container, false);
    }


    @Override
    public String getTitle() {
        return title;
    }
}
