package com.example.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView IvMiegor, IvMinum, IvCemilan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        IvMiegor = findViewById(R.id.IvMiegor);
        IvMinum = findViewById(R.id.IvMinum);
        IvCemilan = findViewById(R.id.IvCemilan);

        IvMiegor.setOnClickListener(this);
        IvMinum.setOnClickListener(this);
        IvCemilan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.IvMiegor) {
            Intent mie = new Intent(MainActivity.this, MiegorActivity.class);
            startActivity(mie);
        } else if (v.getId() == R.id.IvMinum) {
            Intent minum = new Intent(MainActivity.this, MinumActivity.class);
            startActivity(minum);
        } else if (v.getId() == R.id.IvCemilan) {
            Intent cemilan = new Intent(MainActivity.this, MinumActivity.class);
            startActivity(cemilan);
        }
    }
}
