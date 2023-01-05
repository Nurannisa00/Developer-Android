package com.mi.e020320052.nurannisa.resepmasakan_homework;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.solver.state.State;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView img, imgresep;
    TextView txtName, txtJudul, txtCara, txtBahan;
    Layout layout;

    public holder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.image_resep);
        txtName = itemView.findViewById(R.id.NamaJudul);
        imgresep = itemView.findViewById(R.id.image);
        txtBahan = itemView.findViewById(R.id.bahan);
        txtJudul = itemView.findViewById(R.id.namaMasakan);
        txtCara = itemView.findViewById(R.id.cara);
    }
}

public class Adapter extends RecyclerView.Adapter<holder> {
    Context context;
    ArrayList<Resep> ListResep;

    public Adapter(Context context, ArrayList<Resep> listResep) {
        this.context = context;
        ListResep = listResep;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view;
      LayoutInflater minfalter = LayoutInflater.from(context);
      view = minfalter.inflate(R.id.image_resep, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, @SuppressLint("RecyclerView") int position) {
    Resep resep = ListResep.get(position);
    holder.txtName.setText(resep.getNama());
    holder.img.setImageResource(resep.getFoto());
    holder.txtJudul.setText(resep.getNamaResep());
    holder.txtCara.setText(resep.getCaraPembuatan());
    holder.txtBahan.setText(resep.getBahan());
    holder.imgresep.setImageResource(resep.getPotoResep());

    holder.img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, ResepActivity.class);

            intent.putExtra("Nama", ListResep.get(position).getNamaResep());
            intent.putExtra("Bahan", ListResep.get(position).getBahan());
            intent.putExtra("Cara", ListResep.get(position).getCaraPembuatan());
            intent.putExtra("Foto", ListResep.get(position).getPotoResep());
        }
    });

    }

    @Override
    public int getItemCount() {
        return ListResep.size();
    }
}
