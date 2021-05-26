package com.Seyed.boomghardi;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Typeface typeface, typeface2;
    TextView Txtstar, Txtstar2, Txtstar3, Txtstar4, Txtstar5, txt_title, txt_item2;

    List<ModelBoomGardi> gardiList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridList();
        TypeFace();
        FindViewById();

    }

    private void GridList() {

        gardiList = new ArrayList<>();

        gardiList.add(new ModelBoomGardi("هتل کوروش شاندیز", "0 نقدر", "", R.drawable.imgslider1));
        gardiList.add(new ModelBoomGardi("TestText", "TestText", "", R.drawable.gradient_black));
        gardiList.add(new ModelBoomGardi("TestText", "TestText", "", R.drawable.gradient_black));
        gardiList.add(new ModelBoomGardi("هتل کوروش شاندیز", "0 نقدر", "", R.drawable.imgslider1));

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this, gardiList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }

    private void FindViewById() {
        Txtstar = findViewById(R.id.Txtstar);
//        Txtstar2 = findViewById(R.id.Txtstar2);
//        Txtstar3 = findViewById(R.id.Txtstar3);
//        Txtstar4 = findViewById(R.id.Txtstar4);
//        Txtstar5 = findViewById(R.id.Txtstar5);
    }

    private void TypeFace() {

    }
}