package mhealth.movil.salt.mhealthcolombia.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mhealth.movil.salt.mhealthcolombia.R;


/**
 * Created by pc on 03/05/2015.
 */
public class ContactoFragment extends Fragment implements View.OnClickListener {
    EditText nom,contenido;
    Button btn_enviar;
    String[] correo={"mHealthColombia@outlook.com"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.contacto_fragment, container,false);
        nom = (EditText) v.findViewById(R.id.txt_nombre);
        contenido = (EditText) v.findViewById(R.id.txt_contenido);
        btn_enviar = (Button) v.findViewById(R.id.btn_enviarcorreo);

        btn_enviar.setOnClickListener(this);



        return v;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,correo);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Contacto mHealth Colombia: "+nom.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,contenido.getText().toString());
        try {
            startActivity(intent);
            nom.setText(" ");
            contenido.setText(" ");
            Toast.makeText(getActivity(),"Mensaje enviado",Toast.LENGTH_SHORT).show();
        }catch (Exception exp){
            Toast.makeText(getActivity(),"No se pudo enviar el correo",Toast.LENGTH_SHORT).show();
        }
    }
}
