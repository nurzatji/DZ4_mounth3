package com.example.dz4_mounth3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz4_mounth3.databinding.ItemContinentBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> implements Serializable {

    private ArrayList<ConteinerModel> nameList;
    firstFragment onItemClick;


    public ContinentAdapter(ArrayList<ConteinerModel> nameList) {
        this.nameList = nameList;
    }


    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(nameList.get(position));}

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    ItemContinentBinding binding;

    public ContinentViewHolder(@NonNull ItemContinentBinding itemContinentBinding) {
        super(itemContinentBinding.getRoot());
        this.binding = itemContinentBinding;

    }

    void onBind(ConteinerModel conteinerModel) {
        binding.imgContinent.setImageResource(conteinerModel.getAvatarImageCountry());
        binding.textView.setText(conteinerModel.getAvatarImageCountry());
    }
}

