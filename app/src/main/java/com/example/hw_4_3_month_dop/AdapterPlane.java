package com.example.hw_4_3_month_dop;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_4_3_month_dop.databinding.ItemPlaneBinding;

import java.util.ArrayList;

public class AdapterPlane extends RecyclerView.Adapter<ViewHolderPlane> {

    private ArrayList<Planes> arrayList = new ArrayList<>();
    private OnItemClick onItemClick;

    public AdapterPlane(ArrayList <Planes> arrayList, OnItemClick onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ViewHolderPlane onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderPlane(ItemPlaneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPlane holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(arrayList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

class ViewHolderPlane extends RecyclerView.ViewHolder {

    ItemPlaneBinding binding;

    public ViewHolderPlane(@NonNull ItemPlaneBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void onBind(Planes planes) {
        binding.tvName.setText(planes.getName());
        binding.tvDesc.setText(planes.getDesc());
        binding.imgPlane.setImageResource(planes.getImage());
    }
}
