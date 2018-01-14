package com.example.amadeusz.youdieweearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class FunrealHomeAdapter extends ArrayAdapter<FunrealHome> {

    private ArrayList<FunrealHome> funrealHomes;

    public FunrealHomeAdapter(@NonNull Context context, ArrayList<FunrealHome> funrealHomes) {
        super(context,0, funrealHomes);
        this.funrealHomes = funrealHomes;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.funreal_home, parent, false);
        }
        FunrealHome fh = getItem(position);
        if (fh != null) {
            TextView name = convertView.findViewById(R.id.name);
            TextView city = convertView.findViewById(R.id.city);
            if(name != null) {
                name.setText(fh.getName());
            }
            if(city != null) {
                city.setText(fh.getCity());
            }
        }
        return convertView;
    }

}
