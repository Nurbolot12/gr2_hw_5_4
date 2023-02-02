package com.example.hw_4_3_month_dop;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_4_3_month_dop.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

    FragmentDetailBinding binding;
    Planes planes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getExtraFragment();

    }


    private void getExtraFragment() {
        if (getArguments() != null) {
            planes = (Planes) getArguments().getSerializable("plane");
            binding.tvNameDt.setText(planes.getName());
            binding.tvDescDt.setText(planes.getDesc());
            binding.imageView.setImageResource(planes.getImage());

        }
    }
}