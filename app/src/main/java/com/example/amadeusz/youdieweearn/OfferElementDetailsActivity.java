package com.example.amadeusz.youdieweearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class OfferElementDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_element_details);
        Intent input = getIntent();
        TextView categoryName = findViewById(R.id.category_name);
        categoryName.setText(input.getStringExtra("categoryName"));
        ImageView elementImage = findViewById(R.id.element_image);
        elementImage.setImageResource(input.getIntExtra("imageId", 0));
        TextView elementName = findViewById(R.id.element_name);
        elementName.setText(input.getStringExtra("elementName"));
        TextView funrealHomeName = findViewById(R.id.funreal_home_name);
        funrealHomeName.setText(input.getStringExtra("funrealHomeName"));
        TextView price = findViewById(R.id.price);
        String pricePln = input.getDoubleExtra("price", 0.0) + getString(R.string.pln);
        price.setText(pricePln);
        TextView description = findViewById(R.id.description);
        description.setText(input.getStringExtra("description"));
    }

}
