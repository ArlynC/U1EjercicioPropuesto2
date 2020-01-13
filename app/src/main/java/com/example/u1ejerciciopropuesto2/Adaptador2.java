package com.example.u1ejerciciopropuesto2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class Adaptador2 extends RecyclerView.Adapter<Adaptador2.ViewHolder> {
    private LayoutInflater inflador;
    private Vector<String> lista;
    Context micontext;
    public Adaptador2(Context context, Vector<String> lista) {
        this.lista = lista;
        micontext=context;
        inflador = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public Adaptador2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.musica, parent, false);
        return new Adaptador2.ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(Adaptador2.ViewHolder holder, final int i) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((InterfaceToast)micontext).mensaje(lista.get(i));
            }
        });
        holder.titulo.setText(lista.get(i));
        holder.button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((InterfaceToast)micontext).mensaje("El item de la posición: "+ i + " Su valor es: " + lista.get(i));
            }
        });
    }
    @Override
    public int getItemCount() {
        return lista.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, subtitutlo;
        public ImageView icon;
        public Button miboton;
        public Button button4;
        ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.titulo);
            subtitutlo = (TextView)itemView.findViewById(R.id.subtitulo);
            icon = (ImageView)itemView.findViewById(R.id.icono);
            miboton= itemView.findViewById(R.id.mibotonitem);
            button4=itemView.findViewById(R.id.button4);
        }
    }

}
