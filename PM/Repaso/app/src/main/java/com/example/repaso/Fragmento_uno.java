package com.example.repaso;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragmento_uno extends Fragment {

    private ListView lvE1;
    private List<ElementoLista> el1Array;

    public static Fragmento_uno newInstance() {
        Fragmento_uno fragment = new Fragmento_uno();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);

        lvE1 = v.findViewById(R.id.lvElementos);

        el1Array = new ArrayList<>();
        el1Array.add(new ElementoLista(getResources().getString(R.string.yasuo), getResources().getString(R.string.jonia), getResources().getString(R.string.machote), R.drawable.yasuo, 8));
        el1Array.add(new ElementoLista(getResources().getString(R.string.garen), getResources().getString(R.string.demacia), getResources().getString(R.string.demaciaaaaaa), R.drawable.garent, 1));
        el1Array.add(new ElementoLista(getResources().getString(R.string.teemo), getResources().getString(R.string.bandle), getResources().getString(R.string.tejon), R.drawable.teemo, 3));
        el1Array.add(new ElementoLista(getResources().getString(R.string.cassiopeia), getResources().getString(R.string.noxus), getResources().getString(R.string.serpuente), R.drawable.cassiopeia, 9));

        MiAdaptadorElementosLista adaptadorLol = new MiAdaptadorElementosLista(getContext(), R.layout.campeoneslol, el1Array);
        lvE1.setAdapter(adaptadorLol);

        //añadir evento al item del listView
        lvE1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), el1Array.get(position).getSexo(), Toast.LENGTH_SHORT).show();
            }
        });

        return v;

    }
}