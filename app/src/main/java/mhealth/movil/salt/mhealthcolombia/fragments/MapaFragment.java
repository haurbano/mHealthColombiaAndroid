package mhealth.movil.salt.mhealthcolombia.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mhealth.movil.salt.mhealthcolombia.R;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * Created by pc on 03/05/2015.
 */
public class MapaFragment extends Fragment {

    SupportMapFragment map_fragment;
    LatLng posi;

    GoogleMap googleMap;

    public static MapaFragment newInstance(Bundle params)
    {
        MapaFragment mf = new MapaFragment();
        mf.setArguments(params);
        return mf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v =  inflater.inflate(R.layout.mapa_fragment, container, false);
        FragmentManager fm = getChildFragmentManager();

        map_fragment = (SupportMapFragment) fm.findFragmentById(R.id.map);
        posi = new LatLng(2.452460, -76.597974);
        googleMap = map_fragment.getMap();
        googleMap.addMarker(new MarkerOptions().position(posi).title("TIC"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posi,15));
        return v;
    }

}
