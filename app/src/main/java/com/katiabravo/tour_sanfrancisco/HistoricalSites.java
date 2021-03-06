package com.katiabravo.tour_sanfrancisco;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.katiabravo.tour_sanfrancisco.R.id.feature;


public class HistoricalSites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_feature);

        final ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(new Feature(R.string.GGPTitle, R.drawable.thegoldengatepark, R.string.Golden_Gate_Park));
        features.add(new Feature(R.string.FMWTitle, R.drawable.fishermanswharf, R.string.FisherMansWharf));
        features.add(new Feature(R.string.GGBTitle, R.drawable.goldengatebridge, R.string.GGB));
        features.add(new Feature(R.string.CTTitle, R.drawable.chinatown, R.string.ChinaTown));
        features.add(new Feature(R.string.ATitle, R.drawable.alcatrazisland, R.string.Alcatraz));

        FeatureAdapter adapter = new FeatureAdapter(this, features, R.color.history);
        ListView listView = (ListView) findViewById(R.id.feature);
        listView.setAdapter(adapter);
    }
}

