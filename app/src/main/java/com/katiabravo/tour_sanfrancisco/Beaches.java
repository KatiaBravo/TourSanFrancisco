package com.katiabravo.tour_sanfrancisco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Beaches extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_feature);

        final ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(new Feature("Ocean Beach", R.drawable.oceanbeach, R.string.OceanBeach));
        features.add(new Feature("Baker Beach", R.drawable.bakerbeach, R.string.BakerBeach));

        FeatureAdapter adapter = new FeatureAdapter(this, features, R.color.beach);
        ListView listView = (ListView) findViewById(R.id.feature);
        listView.setAdapter(adapter);
    }
}
