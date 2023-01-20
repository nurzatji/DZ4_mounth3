package com.example.dz4_mounth3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.dz4_mounth3.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class firstFragment extends Fragment {

    FragmentFirstBinding binding;
    ContinentAdapter adapter;
    //111
    ArrayList<ConteinerModel> arrayList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        fillOurList();
      binding.recyclerView.setAdapter(adapter);
 }



    private void fillOurList() {
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
        arrayList.add(new ConteinerModel(R.drawable.ic_launcher_background,"Asian"));
    }
}