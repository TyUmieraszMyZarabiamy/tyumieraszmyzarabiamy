package com.example.amadeusz.youdieweearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoriesAdapter extends ArrayAdapter<String> {

    public CategoriesAdapter(@NonNull Context context, @NonNull ArrayList<String> categories) {
        super(context, 0, categories);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.category, parent, false);
        }
        String category = getItem(position);
        if (category != null) {
            TextView name = convertView.findViewById(R.id.name);
            if(name != null) {
                name.setText(category);
            }
        }
        return convertView;
    }

}
