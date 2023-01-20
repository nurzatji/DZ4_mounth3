package com.example.dz4_mounth3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dz4_mounth3.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ContinentAdapter continentAdapter;
    private ArrayList<ConteinerModel> arrayList = new ArrayList<>();

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new firstFragment()).commit();
        }
    }
}