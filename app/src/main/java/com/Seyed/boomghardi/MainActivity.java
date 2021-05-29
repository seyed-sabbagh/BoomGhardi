package com.Seyed.boomghardi;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Typeface typeface, typeface2;
    Button btnFilter;
    TextView Txtstar, Txtstar2, Txtstar3, Txtstar4, Txtstar5, txt_title, txt_item2;

    List<ModelBoomGardi> gardiList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridList();
        TypeFace();
        FindViewById();

        btnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheet  bottomSheet = new BottomSheet();
                bottomSheet.show(getSupportFragmentManager(),"TAG");
            }
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
//        Txtstar2 = findViewById(R.id.Txtstar2);
//        Txtstar3 = findViewById(R.id.Txtstar3);
//        Txtstar4 = findViewById(R.id.Txtstar4);
//        Txtstar5 = findViewById(R.id.Txtstar5);
    }

    private void TypeFace() {


    }
}