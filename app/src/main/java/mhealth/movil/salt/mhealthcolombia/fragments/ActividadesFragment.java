package mhealth.movil.salt.mhealthcolombia.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

import mhealth.movil.salt.mhealthcolombia.R;

/**
 * Created by pc on 03/05/2015.
 */
public class ActividadesFragment extends Fragment {

    ViewPager pager;
    List<TitleFragment> data;
    PagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.actividades_fragment,container,false);

        pager = (ViewPager) v.findViewById(R.id.pager);
        data = new ArrayList<>();

        data.add(new EntrenamientoFragment());
        data.add(new HackathonFragment());
        data.add(new CursoSanaFragment());
        data.add(new IncubacionFragment());

        adapter = new mhealth.movil.salt.mhealthcolombia.adapters.PagerAdapter(getFragmentManager(),data);
        pager.setAdapter(adapter);

        return v;
    }


}
