package com.example.week2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_adapter);

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Dog", R.drawable.dog));
        animals.add(new Animal("Cat", R.drawable.cat));
        animals.add(new Animal("Butterfly", R.drawable.butterfly));
        animals.add(new Animal("Bear", R.drawable.bear));

        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView listView = findViewById(R.id.customListView);
        listView.setAdapter(adapter);



    }
}