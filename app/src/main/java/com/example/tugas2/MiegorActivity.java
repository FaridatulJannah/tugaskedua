package com.example.tugas2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MiegorActivity extends AppCompatActivity {

    CardView cvMie1, cvMie2, cvMie3, cvMie4, cvMie5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cemilan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cvMie1 = findViewById(R.id.cardMie1);
        cvMie2 = findViewById(R.id.cardMie2);
        cvMie3 = findViewById(R.id.cardMie3);
        cvMie4 = findViewById(R.id.cardMie4);
        cvMie5 = findViewById(R.id.cardMie5);

        cvMie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMie1 = findViewById(R.id.tvMie1);
                TextView tvDescMie1 = findViewById(R.id.tvDescMie1);
                TextView tvHargaMie1 = findViewById(R.id.tvHargaMie1);

                Intent mie1 = new Intent(MiegorActivity.this, DetailActivity.class);

                mie1.putExtra("Title", tvMie1.getText());
                mie1.putExtra("Deskripsi", tvDescMie1.getText());
                mie1.putExtra("Harga", tvHargaMie1.getText());
                mie1.putExtra("foto", R.drawable.miegor1);
                startActivity(mie1);
            }
        });
        cvMie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMie2 = findViewById(R.id.tvMie2);
                TextView tvDescMie2 = findViewById(R.id.tvDescMie2);
                TextView tvHargaMie2 = findViewById(R.id.tvHargaMie2);

                Intent mie2 = new Intent(MiegorActivity.this, DetailActivity.class);

                mie2.putExtra("Title", tvMie2.getText());
                mie2.putExtra("Deskripsi", tvDescMie2.getText());
                mie2.putExtra("Harga", tvHargaMie2.getText());
                mie2.putExtra("foto", R.drawable.miegor2);
                startActivity(mie2);

            }
        });
        cvMie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMie3 = findViewById(R.id.tvMie3);
                TextView tvDescMie3 = findViewById(R.id.tvDescMie3);
                TextView tvHargaMie3 = findViewById(R.id.tvHargaMie3);

                Intent mie3 = new Intent(MiegorActivity.this, DetailActivity.class);

                mie3.putExtra("Title", tvMie3.getText());
                mie3.putExtra("Deskripsi", tvDescMie3.getText());
                mie3.putExtra("Harga", tvHargaMie3.getText());
                mie3.putExtra("foto", R.drawable.miegor3);
                startActivity(mie3);
            }
        });
        cvMie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMie4 = findViewById(R.id.tvMie4);
                TextView tvDescMie4 = findViewById(R.id.tvDescMie4);
                TextView tvHargaMie4 = findViewById(R.id.tvHargaMie4);

                Intent mie4 = new Intent(MiegorActivity.this, DetailActivity.class);

                mie4.putExtra("Title", tvMie4.getText());
                mie4.putExtra("Deskripsi", tvDescMie4.getText());
                mie4.putExtra("Harga", tvHargaMie4.getText());
                mie4.putExtra("foto", R.drawable.miegor4);
                startActivity(mie4);
            }
        });
        cvMie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMie5 = findViewById(R.id.tvMie5);
                TextView tvDescMie5 = findViewById(R.id.tvDescMie5);
                TextView tvHargaMie5 = findViewById(R.id.tvHargaMie5);

                Intent mie5 = new Intent(MiegorActivity.this, DetailActivity.class);

                mie5.putExtra("Title", tvMie5.getText());
                mie5.putExtra("Deskripsi", tvDescMie5.getText());
                mie5.putExtra("Harga", tvHargaMie5.getText());
                mie5.putExtra("foto", R.drawable.miegor5);
                startActivity(mie5);

            }
        });

    }
}