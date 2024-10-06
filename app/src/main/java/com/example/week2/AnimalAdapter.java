package com.example.week2;

import android.widget.ArrayAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    private final Context context;
    private final List<Animal> animals;

    public AnimalAdapter(Context context, List<Animal> animals) {
        super(context, R.layout.listview_row, animals);
        this.context = context;
        this.animals = animals;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listview_row, parent, false);


        TextView textView = rowView.findViewById(R.id.textView);
        ImageView imageView = rowView.findViewById(R.id.imageView);


        Animal animal = animals.get(position);
        textView.setText(animal.name);
        imageView.setImageResource(animal.image);

        return rowView;
    }

}
