package com.example.hw_4_3_month_dop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw_4_3_month_dop.databinding.ActivityContainerBinding;

public class ContainerActivity extends AppCompatActivity {

    ActivityContainerBinding binding;
    Planes planes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onGetExtra();
    }

    private void onGetExtra() {
        planes = (Planes) getIntent().getSerializableExtra("plane");


        DetailFragment fragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("plane", planes);
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_fragments,fragment ).commit();

    }
}