package com.example.uts_papbb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class TechnologyAdapter extends RecyclerView.Adapter<TechnologyAdapter.ViewHolder> {

    Context context;
    String rjudul[];
    String rKategori[];
    String rKonten[];
    String rTanggal[];
    String rUmur[];
    int rImage[];

    public TechnologyAdapter(Context context, String[] rjudul, String[] rKategori, String[] rKonten, String[] rTanggal, String[] rUmur, int[] rImage) {
        this.context = context;
        this.rjudul = rjudul;
        this.rKategori = rKategori;
        this.rKonten = rKonten;
        this.rTanggal = rTanggal;
        this.rUmur = rUmur;
        this.rImage = rImage;
    }

    @NonNull
    @Override
    public TechnologyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TechnologyAdapter.ViewHolder holder, int position) {
        holder.img.setImageResource(rImage[position]);
        holder.txtJudul.setText(rjudul[position]);
        holder.txtKategori.setText(rKategori[position]);
        holder.txtKonten.setText(rKonten[position]);
        holder.txtUsia.setText(rUmur[position]);
        holder.txtTgl.setText(rTanggal[position]);
    }

    @Override
    public int getItemCount() {
        return rjudul.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txtJudul, txtKategori, txtKonten, txtTgl, txtUsia;

        public ViewHolder(@Nullable View itemView) {
            super(itemView);

            img =itemView.findViewById(R.id.image_view);
            txtJudul = itemView.findViewById(R.id.txt_judul);
            txtKategori = itemView.findViewById(R.id.txt_kategori);
            txtKonten = itemView.findViewById(R.id.txt_kontent);
            txtTgl = itemView.findViewById(R.id.txt_tglrilis);
            txtUsia = itemView.findViewById(R.id.bts_usia);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(context, DetailNewsActivity.class);
                    intent.putExtra("JUDUL", rjudul[getAdapterPosition()]);
                    intent.putExtra("KATEGORI", rKategori[getAdapterPosition()]);
                    intent.putExtra("KONTEN", rKonten[getAdapterPosition()]);
                    intent.putExtra("TGL", rTanggal[getAdapterPosition()]);
                    intent.putExtra("UMUR", rUmur[getAdapterPosition()]);
                    intent.putExtra("IMAGE", rImage[getAdapterPosition()]);

                    context.startActivity(intent);
                }
            });
        }
    }
}
