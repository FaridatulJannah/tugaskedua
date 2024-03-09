package com.example.tugas2;

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

public class CemilanActivity extends AppCompatActivity {

    CardView cvCemilan1, cvCemilan2, cvCemilan3, cvCemilan4, cvCemilan5;

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
        cvCemilan1 = findViewById(R.id.cardCemilan1);
        cvCemilan2 = findViewById(R.id.cardCemilan2);
        cvCemilan3 = findViewById(R.id.cardCemilan3);
        cvCemilan4 = findViewById(R.id.cardCemilan4);
        cvCemilan5 = findViewById(R.id.cardCemilan5);

        cvCemilan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvCemilan1 = findViewById(R.id.tvCemilan1);
                TextView tvDescCemilan1 = findViewById(R.id.tvDescCemilan1);
                TextView tvHargaCemilan1 = findViewById(R.id.tvHargaCemilan1);

                Intent cemilan1 = new Intent(CemilanActivity.this, DetailActivity.class);

                cemilan1.putExtra("Title", tvCemilan1.getText());
                cemilan1.putExtra("Deskripsi", tvDescCemilan1.getText());
                cemilan1.putExtra("Harga", tvHargaCemilan1.getText());
                cemilan1.putExtra("foto", R.drawable.cemilan1);
                startActivity(cemilan1);
            }
        });
        cvCemilan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvCemilan2 = findViewById(R.id.tvCemilan2);
                TextView tvDescCemilan2 = findViewById(R.id.tvDescCemilan2);
                TextView tvHargaCemilan2 = findViewById(R.id.tvHargaCemilan2);

                Intent cemilan2 = new Intent(CemilanActivity.this, DetailActivity.class);

                cemilan2.putExtra("Title", tvCemilan2.getText());
                cemilan2.putExtra("Deskripsi", tvDescCemilan2.getText());
                cemilan2.putExtra("Harga", tvHargaCemilan2.getText());
                cemilan2.putExtra("foto", R.drawable.baksobakar);
                startActivity(cemilan2);
            }
        });
        cvCemilan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvCemilan3 = findViewById(R.id.tvCemilan3);
                TextView tvDescCemilan3 = findViewById(R.id.tvDescCemilan3);
                TextView tvHargaCemilan3 = findViewById(R.id.tvHargaCemilan3);

                Intent cemilan3 = new Intent(CemilanActivity.this, DetailActivity.class);

                cemilan3.putExtra("Title", tvCemilan3.getText());
                cemilan3.putExtra("Deskripsi", tvDescCemilan3.getText());
                cemilan3.putExtra("Harga", tvHargaCemilan3.getText());
                cemilan3.putExtra("foto", R.drawable.tempe);
                startActivity(cemilan3);
            }
        });
        cvCemilan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvCemilan4 = findViewById(R.id.tvCemilan4);
                TextView tvDescCemilan4 = findViewById(R.id.tvDescCemilan4);
                TextView tvHargaCemilan4 = findViewById(R.id.tvHargaCemilan4);

                Intent cemilan4 = new Intent(CemilanActivity.this, DetailActivity.class);

                cemilan4.putExtra("Title", tvCemilan4.getText());
                cemilan4.putExtra("Deskripsi", tvDescCemilan4.getText());
                cemilan4.putExtra("Harga", tvHargaCemilan4.getText());
                cemilan4.putExtra("foto", R.drawable.pisgor);
                startActivity(cemilan4);
            }
        });
        cvCemilan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvCemilan5 = findViewById(R.id.tvCemilan5);
                TextView tvDescCemilan5 = findViewById(R.id.tvDescCemilan5);
                TextView tvHargaCemilan5 = findViewById(R.id.tvHargaCemilan5);

                Intent cemilan5 = new Intent(CemilanActivity.this, DetailActivity.class);

                cemilan5.putExtra("Title", tvCemilan5.getText());
                cemilan5.putExtra("Deskripsi", tvDescCemilan5.getText());
                cemilan5.putExtra("Harga", tvHargaCemilan5.getText());
                cemilan5.putExtra("foto", R.drawable.jamur);
                startActivity(cemilan5);
            }
        });
    }
}