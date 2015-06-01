package mhealth.movil.salt.mhealthcolombia.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import mhealth.movil.salt.mhealthcolombia.R;

/**
 * Created by pc on 03/05/2015.
 */
public class SponsorsFragment extends Fragment implements View.OnClickListener {
    //imagenes sponsors
    ImageView cauca,cluster,nucleos,microsoft,unicauca,acopi,sanjose,susana;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.sponsors_fragment,container,false);

        //region linkImagen
        cauca = (ImageView) v.findViewById(R.id.img_cauca);
        cluster = (ImageView) v.findViewById(R.id.img_cluster);
        nucleos = (ImageView) v.findViewById(R.id.img_nucleos);
        microsoft = (ImageView) v.findViewById(R.id.img_microsoft);
        unicauca = (ImageView) v.findViewById(R.id.img_unicauca);
        acopi = (ImageView) v.findViewById(R.id.img_acopi);
        sanjose = (ImageView) v.findViewById(R.id.img_sanjose);
        susana = (ImageView) v.findViewById(R.id.img_susana);

        cauca.setOnClickListener(this);
        cluster.setOnClickListener(this);
        nucleos.setOnClickListener(this);
        microsoft.setOnClickListener(this);
        unicauca.setOnClickListener(this);
        acopi.setOnClickListener(this);
        sanjose.setOnClickListener(this);
        susana.setOnClickListener(this);
        //endregion

        return v;
    }
    //region eventosImagenes
    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        switch (view.getId()) {
            case R.id.img_cauca:
                intent.setData(Uri.parse("http://www.cauca.gov.co/"));
                startActivity(intent);
                break;
            case R.id.img_cluster:
                intent.setData(Uri.parse("http://www.parquesoftpopayan.com/"));
                startActivity(intent);
                break;
            case R.id.img_nucleos:
                intent.setData(Uri.parse("http://www.parquesoftpopayan.com/"));
                startActivity(intent);
                break;
            case R.id.img_microsoft:
                intent.setData(Uri.parse("https://www.microsoft.com/es-co/default.aspx"));
                startActivity(intent);
                break;
            case R.id.img_unicauca:
                intent.setData(Uri.parse("http://www.unicauca.edu.co/"));
                startActivity(intent);
                break;
            case R.id.img_acopi:
                intent.setData(Uri.parse("http://www.acopicauca.org.co"));
                startActivity(intent);
                break;
            case R.id.img_sanjose:
                intent.setData(Uri.parse("http://www.hospitalsanjose.gov.co"));
                startActivity(intent);
                break;
            case R.id.img_susana:
                intent.setData(Uri.parse("http://www.hosusana.gov.co"));
                startActivity(intent);
                break;
           default:
                intent.setData(Uri.parse("http://google.com"));
                startActivity(intent);
                break;
        }


    }
    //endregion
}
