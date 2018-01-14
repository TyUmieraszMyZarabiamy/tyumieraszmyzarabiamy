package com.example.amadeusz.youdieweearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FunrealHomesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funreal_homes);
        final ArrayList<FunrealHome> funreals = new ArrayList<>();
        funreals.add(new FunrealHome("Amen", 1, 1, "wybrzeże Stanisława Wyspiańskiego", 27, 0, 50370, "Wrocław"));
        funreals.add(new FunrealHome("Anubis", 1, 1, "wybrzeże Stanisława Wyspiańskiego", 27, 0, 50370, "Wrocław"));
        funreals.add(new FunrealHome("Politechnika Wrocławska", 1, 1, "wybrzeże Stanisława Wyspiańskiego", 27, 0, 50370, "Wrocław"));
        funreals.add(new FunrealHome("Gloria", 1, 1, "wybrzeże Stanisława Wyspiańskiego", 27, 0, 50370, "Wrocław"));
        funreals.add(new FunrealHome("Archon", 1, 1, "wybrzeże Stanisława Wyspiańskiego", 27, 0, 50370, "Wrocław"));
        ListView funrealHomesList = findViewById(R.id.funrealHomesList);
        FunrealHomeAdapter adapter = new FunrealHomeAdapter(this, funreals);
        funrealHomesList.setAdapter(adapter);
        funrealHomesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), CategoriesActivity.class);
                intent.putExtra("name", funreals.get(i).getName());
                startActivity(intent);
            }

        });
    }

}
