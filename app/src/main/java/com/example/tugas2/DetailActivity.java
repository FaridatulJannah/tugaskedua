package com.example.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String title = getIntent().getStringExtra("Title");
        String deskripsi = getIntent().getStringExtra("Deskripsi");
        String harga = getIntent().getStringExtra("Harga");
        int foto = getIntent().getIntExtra("foto",0);


        TextView tvJudul = findViewById(R.id.tvJudul);
        TextView tvDeskripsi = findViewById(R.id.tvDeskripsi);
        TextView tvHarga = findViewById(R.id.tvHarga);
        ImageView ivFoto = findViewById(R.id.ivFoto);


        tvJudul.setText(title);
        tvDeskripsi.setText(deskripsi);
        tvHarga.setText(harga);
        ivFoto.setImageResource(foto);

        Button btnShare = findViewById(R.id.btnShare);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent();
                String text = "Nama Barang : " + title + "\nDeskripsi : " + deskripsi + "\nHarga : " + harga;

                share.setAction(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, text);

                startActivity(Intent.createChooser(share,"bagikan dengan"));

            }
        });

    }
}