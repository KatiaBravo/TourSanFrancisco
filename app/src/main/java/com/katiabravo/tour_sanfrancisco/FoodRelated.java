package com.katiabravo.tour_sanfrancisco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodRelated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_feature);

        final ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(new Feature("Ghirardelli Squre", R.drawable.gsquare, R.string.GhirardelliSquare));
        features.add(new Feature("Pier 39", R.drawable.pier39, R.string.Pier39));
        features.add(new Feature("Al's Place", R.string.AlsPlace));
        features.add(new Feature("La Taqueria", R.string.LaTaqueria));
        features.add(new Feature("Flour + Water", R.string.FAndW));

        FeatureAdapter adapter = new FeatureAdapter(this, features, R.color.food);
        ListView listView = (ListView) findViewById(R.id.feature);
        listView.setAdapter(adapter);
    }
}
