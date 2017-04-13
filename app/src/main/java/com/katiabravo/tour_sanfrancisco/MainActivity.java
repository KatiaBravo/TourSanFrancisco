package com.katiabravo.tour_sanfrancisco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView activity = (TextView) findViewById(R.id.beaches);
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityI = new Intent(MainActivity.this, Beaches.class);
                startActivity(activityI);
            }
        });

        TextView food = (TextView) findViewById(R.id.food_related);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodI = new Intent(MainActivity.this, FoodRelated.class);
                startActivity(foodI);
            }
        });

        TextView attractions = (TextView) findViewById(R.id.museums);
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsI = new Intent(MainActivity.this, Museums.class);
                startActivity(attractionsI);
            }
        });

        TextView historical = (TextView) findViewById(R.id.historical_sites);
        historical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historicalI = new Intent(MainActivity.this, HistoricalSites.class);
                startActivity(historicalI);
            }
        });
    }
}
