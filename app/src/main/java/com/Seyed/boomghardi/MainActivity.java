package com.Seyed.boomghardi;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Typeface typeface, typeface2;
    Button btnFilter, btnMoratabsazi, buttontest;
    TextView Txtstar, Txtstar2, Txtstar3, Txtstar4, Txtstar5, txt_title, txt_item2;
    List<ModelBoomGardi> gardiList;
    CheckBox chck_hotel;
    private BottomSheetDialog bottomsheetdialogmoratabsazi, bottomsheetdialofilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridList();
        TypeFace();
        FindViewById();


        btnMoratabsazi.setOnClickListener(v -> {
            bottomsheetdialogmoratabsazi = new BottomSheetDialog(MainActivity.this, R.style.BottomSheetTheme);

            View sheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheetdialogmoratabsazi,
                    (ViewGroup) findViewById(R.id.buttonSheets));

            bottomsheetdialogmoratabsazi.setContentView(sheetView);
            bottomsheetdialogmoratabsazi.show();

        });
        btnFilter.setOnClickListener(v -> {

            bottomsheetdialofilter = new BottomSheetDialog(MainActivity.this, R.style.BottomSheetTheme);

            View sheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottomsheetdialogfilter,
                    (ViewGroup) findViewById(R.id.buttonSheets));

            bottomsheetdialofilter.setContentView(sheetView);
            bottomsheetdialofilter.show();

        });

    }

    private void GridList() {

        gardiList = new ArrayList<>();

        gardiList.add(new ModelBoomGardi("هتل کوروش شاندیز", "0 نقدر", "", R.drawable.imgslider1));
        gardiList.add(new ModelBoomGardi("TestText", "TestText", "", R.drawable.gradient_black));
        gardiList.add(new ModelBoomGardi("TestText", "TestText", "", R.drawable.gradient_black));
        gardiList.add(new ModelBoomGardi("هتل کوروش شاندیز", "0 نقدر", "", R.drawable.imgslider1));
        gardiList.add(new ModelBoomGardi("TestText", "TestText", "", R.drawable.gradient_black));
        gardiList.add(new ModelBoomGardi("هتل کوروش شاندیز", "0 نقدر", "", R.drawable.imgslider1));
        gardiList.add(new ModelBoomGardi("TestText", "TestText", "", R.drawable.gradient_black));
        gardiList.add(new ModelBoomGardi("هتل کوروش شاندیز", "0 نقدر", "", R.drawable.imgslider1));

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this, gardiList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }

    private void FindViewById() {
        Txtstar = findViewById(R.id.Txtstar);
        btnFilter = findViewById(R.id.btnFilter);
        btnMoratabsazi = findViewById(R.id.btnMoratabsazi);
        chck_hotel = findViewById(R.id.chck_hotel);
        buttontest = findViewById(R.id.buttontest);
//        Txtstar2 = findViewById(R.id.Txtstar2);
//        Txtstar3 = findViewById(R.id.Txtstar3);
//        Txtstar4 = findViewById(R.id.Txtstar4);
//        Txtstar5 = findViewById(R.id.Txtstar5);
    }

    private void TypeFace() {


    }
}