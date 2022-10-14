package com.example.uts_papbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailNewsActivity extends AppCompatActivity {

    TextView txtJudul, txtKategori, txtKonten, txtTgl, txtUsia;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        img = findViewById(R.id.image_view);
        txtJudul = findViewById(R.id.txt_judul);
        txtKategori = findViewById(R.id.txt_kategori);
        txtKonten = findViewById(R.id.txt_konten);
        txtTgl = findViewById(R.id.txt_tglrilis);
        txtUsia = findViewById(R.id.bts_usia);

        Intent intent = getIntent();

        img.setImageResource(intent.getIntExtra("IMAGE", 0));
        txtJudul.setText(intent.getStringExtra("JUDUL"));
        txtKategori.setText(intent.getStringExtra("KATEGORI"));
        txtKonten.setText(intent.getStringExtra("KONTEN"));
        txtTgl.setText(intent.getStringExtra("TGL"));
        txtUsia.setText(intent.getStringExtra("UMUR"));


    }
}