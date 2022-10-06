package com.si5a.belajarexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); //untuk ngehubung ke activity_second.xml

        getSupportActionBar().setTitle("Layout B"); //set title bar pucuk
        tvNama = findViewById(R.id.tv_nama);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama"); // untuk nerima kiriman putExtra dari MainActivity
        tvNama.setText(yNama);
    }
}