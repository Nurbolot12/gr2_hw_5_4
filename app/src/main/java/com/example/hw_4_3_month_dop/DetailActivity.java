package com.example.hw_4_3_month_dop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw_4_3_month_dop.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;
    Planes planes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onGetExtra();
    }

    private void onGetExtra() {
        planes = (Planes) getIntent().getSerializableExtra("plane");
        binding.imageView.setImageResource(planes.getImage());
        binding.tvNameDt.setText(planes.getName());
        binding.tvDescDt.setText(planes.getDesc());

    }
}