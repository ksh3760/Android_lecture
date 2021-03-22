package com.example.restaurantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.restaurantapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

// 버튼 -----------------------------------------------------------------------------------
        Button button1 = binding.buttonMenu;
        Button button2 = binding.buttonLocation;
        Button button3 = binding.buttonEvent;

        button1.setOnClickListener(new View.OnClickListener() { // 버튼1(메뉴)
            @Override
            public void onClick(View view) {
                binding.menuScroll.setVisibility(View.VISIBLE);
                binding.imageViewLocation.setVisibility(View.GONE);
                binding.linearLayout.setVisibility(View.GONE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { // 버튼2(위치)
            @Override
            public void onClick(View view) {
                binding.imageViewLocation.setVisibility(View.VISIBLE);
                binding.menuScroll.setVisibility(View.GONE);
                binding.linearLayout.setVisibility(View.GONE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() { // 버튼3(이벤트)
            @Override
            public void onClick(View view) {
                binding.linearLayout.setVisibility(View.VISIBLE);
                binding.menuScroll.setVisibility(View.GONE);
                binding.imageViewLocation.setVisibility(View.GONE);
            }
        });



    }









}