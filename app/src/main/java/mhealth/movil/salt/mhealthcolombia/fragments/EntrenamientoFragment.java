package mhealth.movil.salt.mhealthcolombia.fragments;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import mhealth.movil.salt.mhealthcolombia.R;


public class EntrenamientoFragment extends TitleFragment {

private final String title = "Entrenamiento";

    TextView link_entrenamiento;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_entrenamiento, container, false);
        link_entrenamiento = (TextView) v.findViewById(R.id.link_entrenamiento);
        link_entrenamiento.setMovementMethod(LinkMovementMethod.getInstance());
        link_entrenamiento.setText(Html.fromHtml("<a href='https://onedrive.live.com/survey?resid=BF82224653124AC1!122&authkey=!AIR19HZ24GnS8CM' style='color:#ffffff; background-color:#ff6534;text-decoration:none;padding:3% 5% 3% 5%'>Incríbete aquí!</a>"));
        return v;
    }


    @Override
    public String getTitle() {
        return title;
    }
}
