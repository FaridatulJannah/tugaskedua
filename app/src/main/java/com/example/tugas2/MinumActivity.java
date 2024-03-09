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

public class MinumActivity extends AppCompatActivity {

    CardView cvMinum1, cvMinum2, cvMinum3, cvMinum4, cvMinum5;

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
        cvMinum1 = findViewById(R.id.cardMinum1);
        cvMinum2 = findViewById(R.id.cardMinum2);
        cvMinum3 = findViewById(R.id.cardMinum3);
        cvMinum4 = findViewById(R.id.cardMinum4);
        cvMinum5 = findViewById(R.id.cardMinum5);

        cvMinum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMie1 = findViewById(R.id.tvMie1);
                TextView tvDescMie1 = findViewById(R.id.tvDescMie1);
                TextView tvHargaMie1 = findViewById(R.id.tvHargaMie1);

                Intent mie1 = new Intent(MinumActivity.this, DetailActivity.class);

                mie1.putExtra("Title", tvMie1.getText());
                mie1.putExtra("Deskripsi", tvDescMie1.getText());
                mie1.putExtra("Harga", tvHargaMie1.getText());
                mie1.putExtra("foto", R.drawable.miegor1);
                startActivity(mie1);
            }
        });
        cvMinum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMinum2 = findViewById(R.id.tvMinum2);
                TextView tvDescMinum2 = findViewById(R.id.tvDescMinum2);
                TextView tvHargaMinum2 = findViewById(R.id.tvHargaMinum2);

                Intent mie2 = new Intent(MinumActivity.this, DetailActivity.class);

                mie2.putExtra("Title", tvMinum2.getText());
                mie2.putExtra("Deskripsi", tvDescMinum2.getText());
                mie2.putExtra("Harga", tvHargaMinum2.getText());
                mie2.putExtra("foto", R.drawable.nutrisari);
                startActivity(mie2);
            }
        });
        cvMinum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMinum3 = findViewById(R.id.tvMinum3);
                TextView tvDescMinum3 = findViewById(R.id.tvDescMinum3);
                TextView tvHargaMinum3 = findViewById(R.id.tvHargaMinum3);

                Intent minum3 = new Intent(MinumActivity.this, DetailActivity.class);

                minum3.putExtra("Title", tvMinum3.getText());
                minum3.putExtra("Deskripsi", tvDescMinum3.getText());
                minum3.putExtra("Harga", tvHargaMinum3.getText());
                minum3.putExtra("foto", R.drawable.milo);
                startActivity(minum3);
            }
        });
        cvMinum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMinum4 = findViewById(R.id.tvMinum4);
                TextView tvDescMinum4 = findViewById(R.id.tvDescMinum4);
                TextView tvHargaMinum4 = findViewById(R.id.tvHargaMinum4);

                Intent minum4 = new Intent(MinumActivity.this, DetailActivity.class);

                minum4.putExtra("Title", tvMinum4.getText());
                minum4.putExtra("Deskripsi", tvDescMinum4.getText());
                minum4.putExtra("Harga", tvHargaMinum4.getText());
                minum4.putExtra("foto", R.drawable.whitekoffie);
                startActivity(minum4);
            }
        });
        cvMinum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvMinum5 = findViewById(R.id.tvMinum5);
                TextView tvDescMinum5 = findViewById(R.id.tvDescMinum5);
                TextView tvHargaMinum5 = findViewById(R.id.tvHargaMinum5);

                Intent minum5 = new Intent(MinumActivity.this, DetailActivity.class);

                minum5.putExtra("Title", tvMinum5.getText());
                minum5.putExtra("Deskripsi", tvDescMinum5.getText());
                minum5.putExtra("Harga", tvHargaMinum5.getText());
                minum5.putExtra("foto", R.drawable.goodday);
                startActivity(minum5);
            }
        });
    }
}