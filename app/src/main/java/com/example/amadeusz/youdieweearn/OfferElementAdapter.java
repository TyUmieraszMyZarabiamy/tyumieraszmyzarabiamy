package com.example.amadeusz.youdieweearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OfferElementAdapter extends ArrayAdapter<OfferElement> {

    public OfferElementAdapter(@NonNull Context context, @NonNull ArrayList<OfferElement> offerElements) {
        super(context, 0, offerElements);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.offer_element, parent, false);
        }
        OfferElement offerElement = getItem(position);
        if (offerElement != null) {
            ImageView elementImage = convertView.findViewById(R.id.element_offer_item_image);
            TextView elementName = convertView.findViewById(R.id.element_offer_item_name);
            if(elementImage != null) {
                elementImage.setImageResource(offerElement.getImageId());
            }
            if(elementName != null) {
                elementName.setText(offerElement.getName());
            }
        }
        return convertView;
    }

}
