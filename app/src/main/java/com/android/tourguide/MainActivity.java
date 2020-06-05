package com.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView placesTextView = findViewById(R.id.places);
        placesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlacesActivity.class);
                startActivity(intent);
            }
        });

        TextView restaurantsTextView = findViewById(R.id.restaurants);
        restaurantsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        TextView hotelsTextView = findViewById(R.id.hotels);
        hotelsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });

        TextView eventsTextView = findViewById(R.id.events);
        eventsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });
    }
}
