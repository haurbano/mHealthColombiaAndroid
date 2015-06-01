package mhealth.movil.salt.mhealthcolombia.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mhealth.movil.salt.mhealthcolombia.R;


public class CursoSanaFragment extends TitleFragment {


    private final String title="Curso Sana";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_curso_sana, container, false);
        return v;


    }


    @Override
    public String getTitle() {
        return title;
    }
}
