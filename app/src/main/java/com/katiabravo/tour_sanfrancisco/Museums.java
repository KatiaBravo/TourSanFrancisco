package com.katiabravo.tour_sanfrancisco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.katiabravo.tour_sanfrancisco.R.id.feature;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_feature);

        final ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(new Feature("Asian Art Museum", R.drawable.asianartmuseum, R.string.AAM));
        features.add(new Feature("San Francisco Museum of Modern Arts", R.drawable.sfmoma, R.string.SFMOMA));

        FeatureAdapter adapter = new FeatureAdapter(this, features, R.color.museum);
        ListView listView = (ListView) findViewById(R.id.feature);
        listView.setAdapter(adapter);
    }
}
