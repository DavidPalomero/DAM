package com.example.repaso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment fragmento1, fragmento2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        final ProgressDialog progreso = new ProgressDialog(this);
        progreso.setTitle(R.string.TitleLoadDialog);
        progreso.setMessage(getResources().getString(R.string.TitleLoadMessage));
        progreso.setCancelable(false);
        progreso.show();

        fragmento1 = new Fragmento_uno();
        fragmento2 = new Fragmento_dos();

        Handler pdCargar = new Handler();
        pdCargar.postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_main);//lo metemos aqui para que se cargue la vista cuando acabe el temporizador
                progreso.cancel();
            }
        }, 3000);


    }

    public void cambiarFragmento(View view) {

        transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.boton1:
                transaction.replace(R.id.frameContainer, fragmento1).commit();
                transaction.addToBackStack(null);//boton para atras
                break;

            case R.id.boton2:
                transaction.replace(R.id.frameContainer, fragmento2).commit();
                transaction.addToBackStack(null);//boton para atras
                break;
        }
    }
}