package com.Seyed.boomghardi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<ModelBoomGardi> gardiList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gardiList =new ArrayList<>();
        gardiList.add(new ModelBoomGardi("txt1","txt2","txt3",R.drawable.img1));
        gardiList.add(new ModelBoomGardi("txt1","txt2","txt3",R.drawable.img2));
        gardiList.add(new ModelBoomGardi("txt1","txt2","txt3",R.drawable.img3));
        gardiList.add(new ModelBoomGardi("txt1","txt2","txt3",R.drawable.img4));

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this,gardiList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);
    }
}