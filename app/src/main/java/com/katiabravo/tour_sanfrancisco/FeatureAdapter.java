package com.katiabravo.tour_sanfrancisco;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wendy on 12/28/2016.
 */

public class FeatureAdapter extends ArrayAdapter<Feature> {

    private int mColorResourceId;

    public FeatureAdapter(Activity context, ArrayList<Feature> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView ( int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.feature_view, parent, false);
        }

        final Feature currentFeature = getItem(position);
        TextView activityName = (TextView) listItemView.findViewById(R.id.activity_name_and_times);
        activityName.setText(currentFeature.getmName());
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentFeature.getmDescription());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.activity_image);
        if (currentFeature.hasImage()){
            imageView.setImageResource(currentFeature.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);}
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
