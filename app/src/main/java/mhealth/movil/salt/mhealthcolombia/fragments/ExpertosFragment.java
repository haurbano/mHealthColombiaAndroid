package mhealth.movil.salt.mhealthcolombia.fragments;


import android.os.Bundle;
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
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class ExpertosFragment extends Fragment {

    View v;

    ViewPager pager;
    List<TitleFragment> data;
    PagerAdapter adapter;

    public ExpertosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_expertos, container, false);

        pager = (ViewPager) v.findViewById(R.id.pager1);
        data = new ArrayList<>();

        data.add(new KennethFragment());
        data.add(new EricFragment());
        data.add(new JuanFragment());
        data.add(new DiegoFragment());

        adapter = new mhealth.movil.salt.mhealthcolombia.adapters.PagerAdapter(getFragmentManager(),data);
        pager.setAdapter(adapter);


        return v;
    }



}
