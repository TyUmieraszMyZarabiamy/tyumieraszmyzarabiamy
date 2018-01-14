package com.example.amadeusz.youdieweearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        TextView name = findViewById(R.id.funrealHome);
        Intent i = getIntent();
        final String funrealHomeName = i.getStringExtra("name");
        name.setText(funrealHomeName);
        final ArrayList<String> categories = new ArrayList<>();
        categories.add("Znicze");
        categories.add("Kwiaty i wieńce");
        categories.add("Żwiry i kamyczki");
        categories.add("Płotki i ławeczki");
        categories.add("Krzyże i tablice nagrobne");
        categories.add("Usługi");
        final ListView categoriesList = findViewById(R.id.categoriesList);
        CategoriesAdapter adapter = new CategoriesAdapter(this, categories);
        categoriesList.setAdapter(adapter);
        categoriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), OfferElementActivity.class);
                intent.putExtra("categoryName", categories.get(i));
                intent.putExtra("funrealHomeName", funrealHomeName);
                startActivity(intent);
            }

        });
    }

}
