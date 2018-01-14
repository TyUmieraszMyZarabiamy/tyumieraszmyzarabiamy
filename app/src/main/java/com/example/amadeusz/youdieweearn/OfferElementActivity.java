package com.example.amadeusz.youdieweearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class OfferElementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_element);
        TextView categoryName = findViewById(R.id.element_offer_name);
        Intent input = getIntent();
        final String funrealHomeName = input.getStringExtra("funrealHomeName");
        final String category = input.getStringExtra("categoryName");
        categoryName.setText(category);
        final ArrayList<OfferElement> choosenElements = new ArrayList<>();
        choosenElements.add(new Product("Znicz 60-godzinny", 10,
                "Będzie się palił dłużej, niż Ty będziesz żył.", R.drawable.snitch_60h, "fioletowy",
                60));
        choosenElements.add(new Product("Znicz płomień", 15, "Rozpali Cię do czerwoności.",
                R.drawable.snitch_flame, "biały", 300));
        choosenElements.add(new Product("Znicz mroźny", 12, "Jak go dotkniesz, to Ci się palce odmrożą.",
                R.drawable.snitch_freeze, "niebieski", 100));
        choosenElements.add(new Product("Znicz szklany", 8, "Tak szklany, jak kieliszek czystej.",
                R.drawable.snitch_glass, "biały", 40));
        choosenElements.add(new Product("Znicz lampa", 13, "Jak go potrzesz, to zamiast dżina wyleci" +
                " duch zmarłego.", R.drawable.snitch_lampe, "żółty", 3));
        final ListView offerElementsList = findViewById(R.id.element_offer_list);
        OfferElementAdapter adapter = new OfferElementAdapter(this, choosenElements);
        offerElementsList.setAdapter(adapter);
        offerElementsList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), OfferElementDetailsActivity.class);
                intent.putExtra("categoryName", category);
                intent.putExtra("elementName", choosenElements.get(i).getName());
                intent.putExtra("imageId", choosenElements.get(i).getImageId());
                intent.putExtra("funrealHomeName", funrealHomeName);
                intent.putExtra("price", choosenElements.get(i).getPrice());
                intent.putExtra("description", choosenElements.get(i).getDescription());
                startActivity(intent);
            }

        });
    }

}
