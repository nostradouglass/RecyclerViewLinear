package com.kellydouglass.recyclerviewlinear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    AdapterRecyclerLinear adapterRecyclerLinear;

    ArrayList<Pojo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearList();

        recyclerView = findViewById(R.id.recyclerview_linear);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterRecyclerLinear = new AdapterRecyclerLinear(this, list);
        recyclerView.setAdapter(adapterRecyclerLinear);
    }

    private void linearList() {

        list = new ArrayList<Pojo>();
        list.add(new Pojo("Pie", "9.0"));
        list.add(new Pojo("Oreo", "8.0"));
        list.add(new Pojo("Nougat", "7.0"));
        list.add(new Pojo("Marshmellow", "6.0"));

        list.add(new Pojo("Lollipop", "5.0"));
        list.add(new Pojo("Kitkat", "4.0"));
        list.add(new Pojo("Jelly Bean", "3.0"));
        list.add(new Pojo("Ice Cream Sandwich", "2.0"));
        list.add(new Pojo("Honey Comb", "1.0"));
        list.add(new Pojo("Pie", "9.0"));
        list.add(new Pojo("Oreo", "8.0"));
        list.add(new Pojo("Nougat", "7.0"));
        list.add(new Pojo("Marshmellow", "6.0"));

        list.add(new Pojo("Lollipop", "5.0"));
        list.add(new Pojo("Kitkat", "4.0"));
        list.add(new Pojo("Jelly Bean", "3.0"));
        list.add(new Pojo("Ice Cream Sandwich", "2.0"));
        list.add(new Pojo("Honey Comb", "1.0"));
    }
}
