package com.geektech.java_3_dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NameAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> names = new ArrayList<>();
        names.add("Alym1");
        names.add("Alym2");
        names.add("Alym3");
        names.add("Alym4");
        names.add("Alym5");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        names.add("Alym6");
        adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}