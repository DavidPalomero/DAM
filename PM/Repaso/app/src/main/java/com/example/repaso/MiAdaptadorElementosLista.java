package com.example.repaso;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptadorElementosLista extends ArrayAdapter<ElementoLista> {

    private Context context;
    private  int layout;
    private List<ElementoLista> arrList;

    public MiAdaptadorElementosLista(@NonNull Context context, int resource, @NonNull List<ElementoLista> objects) {
        super(context, resource, objects);

        this.context = context;
        this.layout = resource;
        this.arrList = objects;
    }

    public View getView(int position, @Nullable View corvertView, @NonNull ViewGroup parent) {

        View v = LayoutInflater.from(context).inflate(layout, parent, false);

        ElementoLista elemento = arrList.get(position);

        TextView tvNombre = v.findViewById(R.id.nombre);
        TextView tvRegion = v.findViewById(R.id.region);
        ImageView ivImagen = v.findViewById(R.id.imagen);

        tvNombre.setText(elemento.getNombe());
        tvRegion.setText(elemento.getRegion());
        ivImagen.setImageResource(elemento.getImagen());

        return v;

    }
}
