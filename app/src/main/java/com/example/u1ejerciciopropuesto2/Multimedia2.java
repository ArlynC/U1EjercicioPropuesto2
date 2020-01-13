package com.example.u1ejerciciopropuesto2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Vector;

public class Multimedia2 extends AppCompatActivity {

    private RecyclerView recyclerView2;
    private RecyclerView.LayoutManager layoutManager;
    private Adaptador2 adaptador;
    private Vector<String> misdatos;

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia2);

        mp = MediaPlayer.create(this, R.raw.musica);

        recyclerView2 = findViewById(R.id.recycler_view2);
        misdatos = new Vector<String>();
        misdatos.add("Musica 1");
        misdatos.add("123000 Pepito Domingez");
        adaptador = new Adaptador2(this,
                misdatos);
        recyclerView2.setAdapter(adaptador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mp.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        mp.pause();
    }
}
